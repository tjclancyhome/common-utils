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
public class SystemInfoTest {

    public SystemInfoTest() {
    }

    /**
     * Test of fileEncoding method, of class SystemInfo.
     */
    @Test
    public void testFileEncoding() {
        System.out.println("fileEncoding: " + SystemInfo.fileEncoding());
    }

    /**
     * Test of javaRuntimeVersion method, of class SystemInfo.
     */
    @Test
    public void testJavaRuntimeVersion() {
        System.out.println("javaRuntimeVersion: " + SystemInfo.javaRuntimeVersion());
    }

    /**
     * Test of javaVersion method, of class SystemInfo.
     */
    @Test
    public void testJavaVersion() {
        System.out.println("javaVersion: " + SystemInfo.javaVersion());
    }

    /**
     * Test of javafxVersion method, of class SystemInfo.
     */
    @Test
    public void testJavafxVersion() {
        System.out.println("javafxVersion: " + SystemInfo.javafxVersion());
    }

    /**
     * Test of osArch method, of class SystemInfo.
     */
    @Test
    public void testOsArch() {
        System.out.println("osArch: " + SystemInfo.osArch());
    }

    /**
     * Test of osName method, of class SystemInfo.
     */
    @Test
    public void testOsName() {
        System.out.println("osName: " + SystemInfo.osName());
    }

    /**
     * Test of osVersion method, of class SystemInfo.
     */
    @Test
    public void testOsVersion() {
        System.out.println("osVersion: " + SystemInfo.osVersion());
    }

    /**
     * Test of userName method, of class SystemInfo.
     */
    @Test
    public void testUserName() {
        System.out.println("userName: " + SystemInfo.userName());
    }

    /**
     * Test of userHome method, of class SystemInfo.
     */
    @Test
    public void testUserHome() {
        System.out.println("userHome: " + SystemInfo.userHome());
    }

    /**
     * Test of userDir method, of class SystemInfo.
     */
    @Test
    public void testUserDir() {
        System.out.println("userDir: " + SystemInfo.userDir());
    }

    /**
     * Test of userLanguage method, of class SystemInfo.
     */
    @Test
    public void testUserLanguage() {
        System.out.println("userLanguage: " + SystemInfo.userLanguage());
    }

}
