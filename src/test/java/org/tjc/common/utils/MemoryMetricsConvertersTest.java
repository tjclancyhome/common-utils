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

import org.junit.jupiter.api.Test;

/**
 *
 * @author tjclancy
 */
public class MemoryMetricsConvertersTest {

    /**
     * Test of humanReadableByteCount method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCount() {
        String converted = MemoryMetricsConverters.humanReadableByteCount(8192);
        System.out.println("8192 bytes = " + converted);
        converted = MemoryMetricsConverters.humanReadableByteCount(512);
        System.out.println("512 bytes = " + converted);
    }

    /**
     * Test of bytesToKB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToKB() {
    }

    /**
     * Test of bytesToMB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToMB() {
    }

    /**
     * Test of bytesToGB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToGB() {
    }

    /**
     * Test of bytesToTB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToTB() {
    }

    /**
     * Test of toMostRelevantString method, of class MemoryMetricsConverters.
     */
    @Test
    public void testToMostRelevantString() {
    }

}
