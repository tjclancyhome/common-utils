/*
 * The MIT License
 *
 * Copyright 2017 tjclancy.
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

import java.util.Arrays;

/**
 * Some convenient string format utility methods.
 *
 * @author tjclancy
 */
public final class StringFormatUtils {

    /**
     * Return 'yes' if b == true, 'false' otherwise.
     *
     * @param b
     *
     * @return A string containing 'yes' if b == true, 'false' otherwise.
     */
    public static String yesOrNo(boolean b) {
        return b == true ? "yes" : "no";
    }

    public static String trueOrFalse(boolean b) {
        return Boolean.toString(b);
    }

    public static String underline(String message) {
        return underline(message, '=');
    }

    public static String underline(String message, char underlineChar) {
        String underlineStr = fill(underlineChar, message.length());
        return String.format("%s\n%s", message, underlineStr);
    }

    public static String fill(String fillValue, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(fillValue);
        }
        return sb.toString();
    }

    public static String fill(char c, int count) {
        char[] ca = new char[count];
        Arrays.fill(ca, c);
        return String.valueOf(ca);
    }

}
