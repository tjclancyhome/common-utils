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
import static org.mockito.Mockito.*;
import org.tjc.common.BaseTest;

/**
 *
 * @author tjclancy
 */
public class ConfigTest extends BaseTest {

    public ConfigTest() {
    }

    @AfterEach
    public void tearDown() {
        System.out.println();
    }


    /**
     * Test of getProperty method, of class Config.
     */
    @Test
    public void testGetProperty_String() {
        printBanner("testGetProperty_String()");

        Config mockedConfig = mock(Config.class);
        when(mockedConfig.getProperty("foo.bar")).thenReturn("baz");

        System.out.println("value: " + mockedConfig.getProperty("foo.bar"));
        System.out.println("value: " + mockedConfig.getProperty("bar.baz"));
    }

    /**
     * Test of getStringProperty method, of class Config.
     */
    @Test
    public void testGetStringProperty_String() {
        printBanner("testGetStringProperty_String()");

        Config mockedConfig = mock(Config.class);
        when(mockedConfig.getStringProperty("foo.bar")).thenReturn("baz");

        System.out.println("value: " + mockedConfig.getStringProperty("foo.bar"));
        System.out.println("value: " + mockedConfig.getStringProperty("bar.baz"));
    }

    /**
     * Test of getIntProperty method, of class Config.
     */
    @Test
    public void testGetIntProperty_String() {
        printBanner("testGetIntProperty_String()");

        Config mockedConfig = mock(Config.class);
        when(mockedConfig.getIntProperty("foo.bar")).thenReturn(42);

        System.out.println("value: " + mockedConfig.getIntProperty("foo.bar"));
        System.out.println("value: " + mockedConfig.getIntProperty("bar.baz"));
    }

    /**
     * Test of getFloatProperty method, of class Config.
     */
    @Test
    public void testGetFloatProperty_String() {
        printBanner("testGetFloatProperty_String()");

        Config mockedConfig = mock(Config.class);
        when(mockedConfig.getFloatProperty("foo.bar")).thenReturn(42.0f);

        System.out.println("value: " + mockedConfig.getFloatProperty("foo.bar"));
        System.out.println("value: " + mockedConfig.getFloatProperty("bar.baz"));
    }

    /**
     * Test of getDoubleProperty method, of class Config.
     */
    @Test
    public void testGetDoubleProperty_String() {
        printBanner("testGetDoubleProperty_String()");

        Config mockedConfig = mock(Config.class);
        when(mockedConfig.getDoubleProperty("foo.bar")).thenReturn(42.0d);

        System.out.println("value: " + mockedConfig.getDoubleProperty("foo.bar"));
        System.out.println("value: " + mockedConfig.getDoubleProperty("bar.baz"));
    }

    /**
     * Test of getProperty method, of class Config.
     */
    @Test
    public void testGetProperty_String_Object() {
        printBanner("testGetProperty_String_Object()");
    }

    /**
     * Test of getStringProperty method, of class Config.
     */
    @Test
    public void testGetStringProperty_String_String() {
        printBanner("testGetStringProperty_String_String()");
    }

    /**
     * Test of getIntProperty method, of class Config.
     */
    @Test
    public void testGetIntProperty_String_int() {
        printBanner("testGetIntProperty_String_int()");
    }

    /**
     * Test of getFloatProperty method, of class Config.
     */
    @Test
    public void testGetFloatProperty_String_float() {
        printBanner("testGetFloatProperty_String_float()");
    }

    /**
     * Test of getDoubleProperty method, of class Config.
     */
    @Test
    public void testGetDoubleProperty_String_double() {
        printBanner("testGetDoubleProperty_String_double()");
    }

    /**
     * Test of putProperty method, of class Config.
     */
    @Test
    public void testPutProperty() {
        printBanner("testPutProperty()");
    }

    /**
     * Test of removeProperty method, of class Config.
     */
    @Test
    public void testRemoveProperty() {
        printBanner("testRemoveProperty()");
    }

    /**
     * Test of containsProperty method, of class Config.
     */
    @Test
    public void testContainsProperty() {
        printBanner("testContainsProperty()");
    }

    /**
     * Test of getPropertyNames method, of class Config.
     */
    @Test
    public void testGetPropertyNames() {
        printBanner("testGetPropertyNames()");
    }

    /**
     * Test of size method, of class Config.
     */
    @Test
    public void testSize() {
        printBanner("testSize()");
    }

    /**
     * Test of isEmpty method, of class Config.
     */
    @Test
    public void testIsEmpty() {
        printBanner("testIsEmpty()");
    }

    /**
     * Test of forEach method, of class Config.
     */
    @Test
    public void testForEach() {
        printBanner("testForEach()");
    }
}
