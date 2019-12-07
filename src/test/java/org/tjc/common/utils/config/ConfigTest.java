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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tjclancy
 */
public class ConfigTest {

    public ConfigTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
        System.out.println();
    }

    /**
     * Test of load method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testLoad() throws IOException {
        System.out.println("testLoad");
        System.out.println("========");
        URL propsUrl = getAppProperties();
        assertNotNull(propsUrl);
        Config instance = new Config();
        assertNotNull(instance);
        instance.load(propsUrl);
        int expected = 2;
        assertEquals(expected, instance.size());
        instance.print();
    }

    /**
     * Test of print method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testPrint_0args() throws IOException {
        System.out.println("testPrint_0args");
        System.out.println("===============");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        instance.print();
    }

    /**
     * Test of print method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testPrint_PrintStream() throws IOException {
        System.out.println("testPrint_PrintStream");
        System.out.println("=====================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        instance.print(System.out);
    }

    /**
     * Test of print method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testPrint_PrintWriter() throws IOException {
        System.out.println("testPrint_PrintWriter");
        System.out.println("=====================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        PrintWriter printWriter = new PrintWriter(System.out);
        instance.print(printWriter);
    }

    /**
     * Test of getProperty method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testGetProperty_String() throws IOException {
        System.out.println("testGetProperty_String");
        System.out.println("======================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        String value = instance.getProperty("foo.bar");
        String expected = "hello!";
        assertEquals(expected, value);
    }

    /**
     * Test of getProperty method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testGetProperty_String_String() throws IOException {
        System.out.println("testGetProperty_String_String");
        System.out.println("=============================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        String expected = "using default";
        String value = instance.getProperty("foo.foo", expected);
        assertEquals(expected, value);
    }

    /**
     * Test of size method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testSize() throws IOException {
        System.out.println("testSize");
        System.out.println("========");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        int expected = 2;
        int size = instance.size();
        assertEquals(expected, size);
    }

    /**
     * Test of isEmpty method, of class Config.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("testIsEmpty");
        System.out.println("===========");
        Config instance = new Config();
        boolean expected = true;
        boolean empty = instance.isEmpty();
        assertEquals(expected, empty);
    }

    /**
     * Test of containsValue method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testContainsValue() throws IOException {
        System.out.println("testContainsValue");
        System.out.println("=================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        boolean expected = true;
        boolean value = instance.containsValue("hello!");
        assertEquals(expected, value);
    }

    /**
     * Test of containsKey method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testContainsKey() throws IOException {
        System.out.println("testContainsKey");
        System.out.println("===============");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        boolean expected = true;
        boolean value = instance.containsKey("foo.bar");
        assertEquals(expected, value);
    }

    /**
     * Test of forEach method, of class Config.
     */
    @Test
    public void testForEach() {
        System.out.println("testForEach");
        System.out.println("===========");
    }


    /**
     * Test of load method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testLoad_URL() throws IOException {
        System.out.println("testLoad_URL");
        System.out.println("============");
        var instance = new Config(getAppProperties());
        assertNotNull(instance);
        instance.load(System.getProperties());
        assertTrue(instance.containsKey("foo.bar"));
        assertTrue(instance.containsKey("user.name"));
    }

    /**
     * Test of load method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testLoad_InputStream() throws IOException {
        System.out.println("testLoad_InputStream");
        System.out.println("====================");
        var instance = new Config();
        assertNotNull(instance);
        URL url = getAppProperties();
        assertNotNull(url);
        try( InputStream in = url.openStream()) {
            instance.load(in);
        }
    }

    /**
     * Test of store method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testStore() throws IOException {
        System.out.println("testStore");
        System.out.println("=========");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        try( OutputStream out = new FileOutputStream("target/application.properties")) {
            instance.store(out, "a comment.");
        }
    }

    /**
     * Test of storeToXML method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testStoreToXML() throws IOException {
        System.out.println("testStoreToXML");
        System.out.println("==============");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        try( OutputStream out = new FileOutputStream("target/application.properties.xml")) {
            instance.storeToXML(out, "A comment.");
        }
    }

    /**
     * Test of stringPropertyNames method, of class Config.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testStringPropertyNames() throws IOException {
        System.out.println("testStringPropertyNames");
        System.out.println("=======================");
        Config instance = new Config(getAppProperties());
        assertNotNull(instance);
        instance.stringPropertyNames().forEach(System.out::println);
    }

    /**
     * Test of put method, of class Config.
     */
    @Test
    public void testPut() {
        System.out.println("testPut");
        System.out.println("=======");
        Config instance = Config.newInstance();
        instance.put("foo.bar", "goodbye!");
        int expected = 1;
        assertEquals(expected, instance.size());
        assertTrue(instance.containsKey("foo.bar"));
        String value = instance.getProperty("foo.bar");
        String expectedStr = "goodbye!";
        assertEquals(expectedStr, value);
    }

    /**
     * Test of putAll method, of class Config.
     */
    @Test
    public void testPutAll() {
        System.out.println("testPutAll");
        System.out.println("==========");
    }

    /**
     * Test of replaceAll method, of class Config.
     */
    @Test
    public void testReplaceAll() {
        System.out.println("testReplaceAll");
        System.out.println("==============");
    }

    /**
     * Test of remove method, of class Config.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("testRemove_Object");
        System.out.println("=================");
    }

    /**
     * Test of remove method, of class Config.
     */
    @Test
    public void testRemove_Object_Object() {
        System.out.println("testRemove_Object_Object");
        System.out.println("========================");
    }


    /**
     * Test of newInstance method, of class Config.
     */
    @Test
    public void testNewInstance_0args() {
        System.out.println("testNewInstance_0args");
        System.out.println("=====================");
    }

    /**
     * Test of newInstance method, of class Config.
     */
    @Test
    public void testNewInstance_URL() throws Exception {
        System.out.println("testNewInstance_URL");
        System.out.println("===================");
    }

    /**
     * Test of newInstance method, of class Config.
     */
    @Test
    public void testNewInstance_Properties() throws Exception {
        System.out.println("testNewInstance_Properties");
        System.out.println("==========================");
    }

    /**
     * Test of load method, of class Config.
     */
    @Test
    public void testLoad_Properties() throws Exception {
        System.out.println("testLoad_Properties");
        System.out.println("===================");
    }

    /**
     * Test of putProperty method, of class Config.
     */
    @Test
    public void testPutProperty() {
        System.out.println("testPutProperty");
        System.out.println("===============");
    }

    private URL getAppProperties() {
        return getClass().getResource("/application.properties");
    }

}
