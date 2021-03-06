/*
 * The MIT License
 *
 * Copyright 2019 tjclancy.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.tjc.common.utils;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.setShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class LruCacheTest {

    public LruCacheTest() {
    }

    @BeforeEach
    public void forEach() {
        setShowOutput(true);
    }

    @AfterEach
    public void afterEach() {
        setShowOutput(false);
    }

    /**
     * Test of removeEldestEntry method, of class LruCache.
     */
    @Test
    public void testRemoveEldestEntry() {
        writeBanner(methodName());

        LruCache cache = new LruCache();
        cache.put("Key", "Value");
        assertFalse(cache.isEmpty());
        assertTrue(cache.size() == 1);
    }

    @Test
    public void testRemoveEldestEntryWithALwaysTruePredicate() {
        writeBanner(methodName());

        LruRemovalPredicate<String, String> alwaysTrue = new LruRemovalPredicate.AlwaysTruePredicate<>();
        LruCache cache = new LruCache(alwaysTrue);

        // should be empty
        assertTrue(cache.isEmpty());
        cache.put("Key", "Value");
        assertTrue(cache.isEmpty());

    }

    @Test
    public void testRemoveEldestEntryWhenCapacityIsFull() {
        writeBanner(methodName());

        RemoveWhenCapacityIsFull<UUID, String> removalPredicate
            = new RemoveWhenCapacityIsFull<>(10);

        UUID uuid = UUID.randomUUID();

        LruCache<UUID, String> cache = new LruCache(removalPredicate);
        cache.put(UUID.randomUUID(), "apple");
        cache.put(UUID.randomUUID(), "peach");
        cache.put(UUID.randomUUID(), "plum");
        cache.put(UUID.randomUUID(), "cherry");
        cache.put(UUID.randomUUID(), "mango");


        assertTrue(cache.size() == 5);

        cache.put(UUID.randomUUID(), "banana");
        cache.put(UUID.randomUUID(), "aaa");
        cache.put(UUID.randomUUID(), "bbb");
        cache.put(UUID.randomUUID(), "ccc");
        cache.put(UUID.randomUUID(), "ddd");

        assertTrue(cache.size() == 10);
        cache.forEach((k, v) -> writeln("{0} => {1}", k, v));

        cache.put(UUID.randomUUID(), "eee");
        assertTrue(cache.size() == 10);
        assertFalse(cache.containsValue("apple"));
        cache.forEach((k, v) -> writeln("{0} => {1}", k, v));

        cache.put(UUID.randomUUID(), "apple");
        assertTrue(cache.size() == 10);
        assertFalse(cache.containsValue("peach"));
        cache.forEach((k, v) -> writeln("{0} => {1}", k, v));

    }

    public class RemoveWhenCapacityIsFull<Integer, String> extends LruRemovalPredicate<Integer, String> {
        private final int cacheCapacity;

        public RemoveWhenCapacityIsFull(int cacheCapacity) {
            this.cacheCapacity = cacheCapacity;
        }

        @Override
        public boolean test(LruCache<Integer, String> cache, Map.Entry<Integer, String> entry) {
            return cache.size() > cacheCapacity;
        }

    }

}
