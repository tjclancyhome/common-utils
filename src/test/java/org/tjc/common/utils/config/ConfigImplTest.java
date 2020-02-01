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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.BaseTest;
import static org.tjc.common.unittest.UnitTestSupport.getShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.setShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;

/**
 *
 * @author tjclancy
 */
public class ConfigImplTest extends BaseTest {

    public ConfigImplTest() {
        super();

    }

    @BeforeEach
    public void setup() {
        pushBool(getShowOutput());
        setShowOutput(true);

    }

    @AfterEach
    public void tearDown() {
        setShowOutput(popBool());
    }

    /**
     * Test of newInstance method, of class ConfigImpl.
     */
    @Test
    public void testNewInstance() {
        writeBanner(methodName());

    }

    /**
     * Test of containsProperty method, of class ConfigImpl.
     */
    @Test
    public void testContainsProperty() {
        writeBanner(methodName());
    }

    /**
     * Test of getDoubleProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetDoubleProperty_String() {
        writeBanner(methodName());
    }

    /**
     * Test of getDoubleProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetDoubleProperty_String_double() {
        writeBanner(methodName());
    }

    /**
     * Test of getFloatProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetFloatProperty_String() {
        writeBanner(methodName());
    }

    /**
     * Test of getFloatProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetFloatProperty_String_float() {
        writeBanner(methodName());
    }

    /**
     * Test of getIntProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetIntProperty_String() {
        writeBanner(methodName());
    }

    /**
     * Test of getIntProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetIntProperty_String_int() {
        writeBanner(methodName());
    }

    /**
     * Test of getStringProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetStringProperty_String() {
        writeBanner(methodName());
    }

    /**
     * Test of getStringProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetStringProperty_String_String() {
        writeBanner(methodName());
    }

    /**
     * Test of getObjectProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetObjectProperty_String() {
    }

    /**
     * Test of getObjectProperty method, of class ConfigImpl.
     */
    @Test
    public void testGetObjectProperty_String_Object() {
    }

    /**
     * Test of getPropertyNames method, of class ConfigImpl.
     */
    @Test
    public void testGetPropertyNames() {
        writeBanner(methodName());
    }

    /**
     * Test of load method, of class ConfigImpl.
     */
    @Test
    public void testLoad() throws Exception {
        writeBanner(methodName());
    }

    /**
     * Test of putProperty method, of class ConfigImpl.
     */
    @Test
    public void testPutProperty() {
        writeBanner(methodName());
    }

    /**
     * Test of removeProperty method, of class ConfigImpl.
     */
    @Test
    public void testRemoveProperty() {
        writeBanner(methodName());
    }

    /**
     * Test of size method, of class ConfigImpl.
     */
    @Test
    public void testSize() {
        writeBanner(methodName());
    }

    /**
     * Test of isEmpty method, of class ConfigImpl.
     */
    @Test
    public void testIsEmpty() {
        writeBanner(methodName());
    }

    /**
     * Test of forEach method, of class ConfigImpl.
     */
    @Test
    public void testForEach() {
        writeBanner(methodName());
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_0args() {
        writeBanner(methodName());
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_PrintStream() {
        writeBanner(methodName());
    }

    /**
     * Test of print method, of class ConfigImpl.
     */
    @Test
    public void testPrint_PrintWriter() {
        writeBanner(methodName());
    }

}
