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

import java.util.Map.Entry;
import java.util.function.BiPredicate;

/**
 * A remove eldest predicate for LruCache which subclasses LinkedHashMap.
 *
 * @author tjclancy
 * @param <K>
 * @param <V>
 */
public abstract class LruRemovalPredicate<K, V> implements BiPredicate<LruCache<K, V>, Entry<K, V>> {

    public static class AlwaysFalsePredicate<K, V> extends LruRemovalPredicate<K, V> {
        @Override
        public boolean test(LruCache<K, V> arg0, Entry<K, V> arg1) {
            return false;
        }
    }

    public static class AlwaysTruePredicate<K, V> extends LruRemovalPredicate<K, V> {
        @Override
        public boolean test(LruCache<K, V> arg0, Entry<K, V> arg1) {
            return true;
        }
    }

}
