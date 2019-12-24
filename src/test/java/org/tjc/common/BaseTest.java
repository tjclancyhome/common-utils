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
package org.tjc.common;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author tjclancy
 */
public class BaseTest {

    /**
     * I don't really like my implementation, but it works.
     *
     * @param message The message to include in the banner.
     *
     *
     * @return A String containing the banner which looks something like this:
     *
     * <pre>
     * =========
     * a message
     * =========
     * </pre>
     *
     */
    public String createBanner(String message) {
        Objects.requireNonNull(message, () -> "The 'message' argument is null.");

        char[] top = new char[message.length()];
        Arrays.fill(top, '=');
        String frame = String.valueOf(top);
        return String.join("\n", frame, message, frame);
    }

    /**
     * Creates a banner and then prints the banner string to stdout.
     *
     * @param message The message to include in the banner.
     */
    public void printBanner(String message) {
        System.out.println(createBanner(message));
    }

}
