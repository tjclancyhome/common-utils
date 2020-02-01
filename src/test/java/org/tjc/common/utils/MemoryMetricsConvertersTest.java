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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.BaseTest;
import static org.tjc.common.unittest.UnitTestSupport.getShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.setShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class MemoryMetricsConvertersTest extends BaseTest {

    @BeforeEach
    public void setup() {
        pushBool(getShowOutput());
        setShowOutput(true);

    }

    @AfterEach
    public void tearDown() {
        writeln("");
        setShowOutput(popBool());
    }

    /**
     * Test of humanReadableByteCount method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCount() {
        writeBanner(methodName());
        String converted = MemoryMetricsConverters.humanReadableByteCount(8192);
        writeln("8192 bytes = {0}", converted);
        converted = MemoryMetricsConverters.humanReadableByteCount(512);
        writeln("512 bytes = {0}", converted);
    }

    /**
     * Test of bytesToKB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToKB() {
        writeBanner(methodName());
    }

    /**
     * Test of bytesToMB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToMB() {
        writeBanner(methodName());
    }

    /**
     * Test of bytesToGB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToGB() {
        writeBanner(methodName());

    }

    /**
     * Test of bytesToTB method, of class MemoryMetricsConverters.
     */
    @Test
    public void testBytesToTB() {
        writeBanner(methodName());
    }

    /**
     * Test of toMostRelevantString method, of class MemoryMetricsConverters.
     */
    @Test
    public void testToMostRelevantString() {
        writeBanner(methodName());
    }

    /**
     * Test of humanReadableByteCount method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCount_long_boolean() {
        writeBanner(methodName());
    }

    /**
     * Test of humanReadableByteCount method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCount_long_Base() {
        writeBanner(methodName());
    }

    /**
     * Test of humanReadableByteCountSI method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCountSI() {
        writeBanner(methodName());
        writeln("humanReadableByteCountSI(10270): {0}", MemoryMetricsConverters
            .humanReadableByteCountSI(10270));
    }

    /**
     * Test of humanReadableByteCountBin method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCountBin() {
        writeBanner(methodName());
        writeln("humanReadableByteCountBin(10270): {0}", MemoryMetricsConverters.humanReadableByteCountSI(
            10270));
    }

    /**
     * Test of humanReadableByteCount method, of class MemoryMetricsConverters.
     */
    @Test
    public void testHumanReadableByteCount_long() {
        writeBanner(methodName());
    }

    /**
     * Test of convertToString method, of class MemoryMetricsConverters.
     */
    @Test
    public void testConvertToString() {
        writeBanner(methodName());
        writeln(MemoryMetricsConverters.convertToString(1024000231034.0));
    }

}
