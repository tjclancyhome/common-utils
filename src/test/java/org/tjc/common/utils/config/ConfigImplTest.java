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
package org.tjc.common.utils.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.BaseTest;

/**
 *
 * @author tjclancy
 */
public class ConfigImplTest extends BaseTest {

    public ConfigImplTest() {
    }

    @AfterEach
    public void tearDown() {
        System.out.println();
    }

    /**
     * Test of newInstance method, of class ConfigImpl.
     */
    @Test
    public void testNewInstance() {
        printBanner("testNewInstance()");
    }

    /**
     * Test of containsProperty method, of class ConfigImpl.
     */
    @Test
    public void testContainsProperty() {
        printBanner("testContainsProperty()");
    }

    /**
     * Test of getDoubleProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetDoubleProperty_String() {
        printBanner("testGetDoubleProperty_String()");
    }

    /**
     * Test of getDoubleProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetDoubleProperty_String_double() {
        printBanner("testGetDoubleProperty_String_double()");
    }

    /**
     * Test of getFloatProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetFloatProperty_String() {
        printBanner("testGetFloatProperty_String()");
    }

    /**
     * Test of getFloatProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetFloatProperty_String_float() {
        printBanner("testGetFloatProperty_String_float()");
    }

    /**
     * Test of getIntProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetIntProperty_String() {
        printBanner("testGetIntProperty_String()");
    }

    /**
     * Test of getIntProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetIntProperty_String_int() {
        printBanner("testGetIntProperty_String_int()");
    }

    /**
     * Test of getStringProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetStringProperty_String() {
        printBanner("testGetStringProperty_String()");
    }

    /**
     * Test of getStringProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetStringProperty_String_String() {
        printBanner("testGetStringProperty_String_String()");
    }

    /**
     * Test of getProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetProperty_String() {
        printBanner("testGetProperty_String()");
    }

    /**
     * Test of getProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetProperty_String_Object() {
        printBanner("testGetProperty_String_Object()");
    }

    /**
     * Test of getPropertyNames method, of class ConfigImpl.
     */
    @Test
    public void testGetPropertyNames() {
        printBanner("testGetPropertyNames()");
    }

    /**
     * Test of load method, of class ConfigImpl.
     */
    @Test
    public void testLoad() throws Exception {
        printBanner("testLoad()");
    }

    /**
     * Test of putProperty method, of class ConfigImpl.
     */
    @Test
    public void testPutProperty() {
        printBanner("testPutProperty()");
    }

    /**
     * Test of removeProperty method, of class ConfigImpl.
     */
    @Test
    public void testRemoveProperty() {
        printBanner("testRemoveProperty()");
    }

    /**
     * Test of size method, of class ConfigImpl.
     */
    @Test
    public void testSize() {
        printBanner("testSize()");
    }

    /**
     * Test of isEmpty method, of class ConfigImpl.
     */
    @Test
    public void testIsEmpty() {
        printBanner("testIsEmpty()");
    }

    /**
     * Test of forEach method, of class ConfigImpl.
     */
    @Test
    public void testForEach() {
        printBanner("testForEach()");
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_0args() {
        printBanner("testPrint_0args()");
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_PrintStream() {
        printBanner("testPrint_PrintStream()");
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_PrintWriter() {
        printBanner("testPrint_PrintWriter()");
    }
}
