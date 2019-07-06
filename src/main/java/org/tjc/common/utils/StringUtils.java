/*
 * The MIT License
 *
 * Copyright 2018 tjclancy.
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

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

/**
 *
 * @author tjclancy
 */
public class StringUtils {

    public static int maxLength(final List<String> strs) {
        final AtomicInteger length = new AtomicInteger(0);
        strs.forEach(str -> {
            if (str.length() > length.get()) {
                length.set(str.length());
            }
        });
        return length.get();
    }

    public static int maxLength(final String[] strs) {
        return maxLength(asList(strs));
    }

    public static String swap(String s, int indx1, int indx2) {
        char[] ca = s.toCharArray();
        char tmp = ca[indx1];
        ca[indx1] = ca[indx2];
        ca[indx2] = tmp;
        return String.valueOf(ca);
    }

    private StringUtils() {
    }

}
