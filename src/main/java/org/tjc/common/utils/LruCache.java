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

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author tjclancy
 * @param <K>
 * @param <V>
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private static final Logger log = LoggerFactory.getLogger(LruCache.class);

    private static final int DEFAULT_CAPACITY = 10;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final boolean DEFAULT_ACCESS_ORDER = true;

    private final LruRemovalPredicate<K, V> removalPredicate;

    public LruCache() {
        super(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR, DEFAULT_ACCESS_ORDER);
        log.trace("### entered LRUCache() ctor.");
        this.removalPredicate = new LruRemovalPredicate.AlwaysFalsePredicate<>();
    }

    public LruCache(LruRemovalPredicate<K, V> removalPredicate) {
        super(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR, DEFAULT_ACCESS_ORDER);
        log.trace("### entered LRUCache(Predicate) ctor: removalPredicate: {}", removalPredicate);
        this.removalPredicate = removalPredicate;
    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        log.trace("### entered removeEldestEntry(Map.Entry<K,V>)");
        return removalPredicate.test(this, eldest);
    }

}
