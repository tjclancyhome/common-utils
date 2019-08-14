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

/**
 *
 * @author tjclancy
 */
public class OSTest {

    public OSTest() {
    }

    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of arch method, of class OS.
     */
    @Test
    public void testArch() {
        String expResult = "";
        String result = OS.arch();
    }

    /**
     * Test of name method, of class OS.
     */
    @Test
    public void testName() {
        String expResult = "";
        String result = OS.name();
    }

    /**
     * Test of version method, of class OS.
     */
    @Test
    public void testVersion() {
        String expResult = "";
        String result = OS.version();
    }

    /**
     * Test of availableProcessors method, of class OS.
     */
    @Test
    public void testAvailableProcessors() {
        int expResult = 0;
        int result = OS.availableProcessors();
    }

    /**
     * Test of systemLoadAverage method, of class OS.
     */
    @Test
    public void testSystemLoadAverage() {
        double expResult = 0.0;
        double result = OS.systemLoadAverage();
    }

    /**
     * Test of committedVirtualMemorySize method, of class OS.
     */
    @Test
    public void testCommittedVirtualMemorySize() {
        long expResult = 0L;
        long result = OS.committedVirtualMemorySize();
    }

    /**
     * Test of freePhysicalMemorySize method, of class OS.
     */
    @Test
    public void testFreePhysicalMemorySize() {
        long expResult = 0L;
        long result = OS.freePhysicalMemorySize();
    }

    /**
     * Test of freeSwapSpaceSize method, of class OS.
     */
    @Test
    public void testFreeSwapSpaceSize() {
        long expResult = 0L;
        long result = OS.freeSwapSpaceSize();
    }

    /**
     * Test of processCpuLoad method, of class OS.
     */
    @Test
    public void testProcessCpuLoad() {
        double expResult = 0.0;
        double result = OS.processCpuLoad();
    }

    /**
     * Test of processCpuTime method, of class OS.
     */
    @Test
    public void testProcessCpuTime() {
        long expResult = 0L;
        long result = OS.processCpuTime();
    }

    /**
     * Test of systemCpuLoad method, of class OS.
     */
    @Test
    public void testSystemCpuLoad() {
        double expResult = 0.0;
        double result = OS.systemCpuLoad();
    }

    /**
     * Test of totalPhysicalMemorySize method, of class OS.
     */
    @Test
    public void testTotalPhysicalMemorySize() {
        long expResult = 0L;
        long result = OS.totalPhysicalMemorySize();
    }

    /**
     * Test of totalSwapSpaceSize method, of class OS.
     */
    @Test
    public void testTotalSwapSpaceSize() {
        long expResult = 0L;
        long result = OS.totalSwapSpaceSize();
    }

    /**
     * Test of asString method, of class OS.
     */
    @Test
    public void testAsString() {
        System.out.println(OS.asString());
    }

}
