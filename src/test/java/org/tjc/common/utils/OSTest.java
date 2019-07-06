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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.tjc.common.utils.test.UnitTestSupport.getMethodName;
import static org.tjc.common.utils.test.UnitTestSupport.methodName;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;
import static org.tjc.common.utils.test.UnitTestSupport.writeBanner;
import static org.tjc.common.utils.test.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class OSTest {

    public OSTest() {
    }

    @Before
    public void setup() {
        setShowOutput(true);
    }

    @After
    public void tearDown() {
        setShowOutput(false);
    }

    /**
     * Test of arch method, of class OS.
     */
    @Test
    public void testArch() {
        writeBanner(methodName());
        String expResult = "";
        String result = OS.arch();
    }

    /**
     * Test of name method, of class OS.
     */
    @Test
    public void testName() {
        writeBanner(methodName());
        String expResult = "";
        String result = OS.name();
    }

    /**
     * Test of version method, of class OS.
     */
    @Test
    public void testVersion() {
        writeBanner(methodName());
        String expResult = "";
        String result = OS.version();
    }

    /**
     * Test of availableProcessors method, of class OS.
     */
    @Test
    public void testAvailableProcessors() {
        writeBanner(methodName());
        int expResult = 0;
        int result = OS.availableProcessors();
    }

    /**
     * Test of systemLoadAverage method, of class OS.
     */
    @Test
    public void testSystemLoadAverage() {
        writeBanner(methodName());
        double expResult = 0.0;
        double result = OS.systemLoadAverage();
    }

    /**
     * Test of committedVirtualMemorySize method, of class OS.
     */
    @Test
    public void testCommittedVirtualMemorySize() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.committedVirtualMemorySize();
    }

    /**
     * Test of freePhysicalMemorySize method, of class OS.
     */
    @Test
    public void testFreePhysicalMemorySize() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.freePhysicalMemorySize();
    }

    /**
     * Test of freeSwapSpaceSize method, of class OS.
     */
    @Test
    public void testFreeSwapSpaceSize() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.freeSwapSpaceSize();
    }

    /**
     * Test of processCpuLoad method, of class OS.
     */
    @Test
    public void testProcessCpuLoad() {
        writeBanner(methodName());
        double expResult = 0.0;
        double result = OS.processCpuLoad();
    }

    /**
     * Test of processCpuTime method, of class OS.
     */
    @Test
    public void testProcessCpuTime() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.processCpuTime();
    }

    /**
     * Test of systemCpuLoad method, of class OS.
     */
    @Test
    public void testSystemCpuLoad() {
        writeBanner(methodName());
        double expResult = 0.0;
        double result = OS.systemCpuLoad();
    }

    /**
     * Test of totalPhysicalMemorySize method, of class OS.
     */
    @Test
    public void testTotalPhysicalMemorySize() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.totalPhysicalMemorySize();
    }

    /**
     * Test of totalSwapSpaceSize method, of class OS.
     */
    @Test
    public void testTotalSwapSpaceSize() {
        writeBanner(methodName());
        long expResult = 0L;
        long result = OS.totalSwapSpaceSize();
    }

    /**
     * Test of asString method, of class OS.
     */
    @Test
    public void testAsString() {
        writeBanner(getMethodName());

        writeln(OS.asString());
    }

}
