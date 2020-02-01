/*
 * The MIT License
 *
 * Copyright 2020 tjclancy.
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
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.setShowOutput;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class SystemPropsTest {

    public SystemPropsTest() {
    }

    @BeforeEach
    public void beforeEach() {
        setShowOutput(true);
    }

    @AfterEach
    public void afterEach() {
        writeln("");
        setShowOutput(false);
    }

    /**
     * Test of awtToolkit method, of class SystemProps.
     */
    @Test
    public void testAwtToolkit() {
        writeBanner(methodName());
        writeln(SystemProps.awtToolkit());
    }

    /**
     * Test of fileEncoding method, of class SystemProps.
     */
    @Test
    public void testFileEncoding() {
        writeBanner(methodName());
        writeln(SystemProps.fileEncoding());
    }

    /**
     * Test of fileSeparator method, of class SystemProps.
     */
    @Test
    public void testFileSeparator() {
        writeBanner(methodName());
        writeln(SystemProps.fileSeparator());
    }

    /**
     * Test of javaAwtGraphicsenv method, of class SystemProps.
     */
    @Test
    public void testJavaAwtGraphicsenv() {
        writeBanner(methodName());
        writeln(SystemProps.javaAwtGraphicsenv());
    }

    /**
     * Test of javaClassPath method, of class SystemProps.
     */
    @Test
    public void testJavaClassPath() {
        writeBanner(methodName());
        writeln(SystemProps.javaClassPath());
    }

    /**
     * Test of javaClassVersion method, of class SystemProps.
     */
    @Test
    public void testJavaClassVersion() {
        writeBanner(methodName());
        writeln(SystemProps.javaClassVersion());
    }

    /**
     * Test of javaHome method, of class SystemProps.
     */
    @Test
    public void testJavaHome() {
        writeBanner(methodName());
        writeln(SystemProps.javaHome());
    }

    /**
     * Test of javaIoTmpdir method, of class SystemProps.
     */
    @Test
    public void testJavaIoTmpdir() {
        writeBanner(methodName());
        writeln(SystemProps.javaIoTmpdir());
    }

    /**
     * Test of javaLibraryPath method, of class SystemProps.
     */
    @Test
    public void testJavaLibraryPath() {
        writeBanner(methodName());
        writeln(SystemProps.javaLibraryPath());
    }

    /**
     * Test of javaRuntimeName method, of class SystemProps.
     */
    @Test
    public void testJavaRuntimeName() {
        writeBanner(methodName());
        writeln(SystemProps.javaRuntimeName());
    }

    /**
     * Test of javaRuntimeVersion method, of class SystemProps.
     */
    @Test
    public void testJavaRuntimeVersion() {
        writeBanner(methodName());
        writeln(SystemProps.javaRuntimeVersion());
    }

    /**
     * Test of javaSpecificationName method, of class SystemProps.
     */
    @Test
    public void testJavaSpecificationName() {
        writeBanner(methodName());
        writeln(SystemProps.javaSpecificationName());
    }

    /**
     * Test of javaSpecificationVendor method, of class SystemProps.
     */
    @Test
    public void testJavaSpecificationVendor() {
        writeBanner(methodName());
    }

    /**
     * Test of javaSpecificationVersion method, of class SystemProps.
     */
    @Test
    public void testJavaSpecificationVersion() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVendor method, of class SystemProps.
     */
    @Test
    public void testJavaVendor() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVendorUrl method, of class SystemProps.
     */
    @Test
    public void testJavaVendorUrl() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVendorUrlBug method, of class SystemProps.
     */
    @Test
    public void testJavaVendorUrlBug() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVersion method, of class SystemProps.
     */
    @Test
    public void testJavaVersion() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVersionDate method, of class SystemProps.
     */
    @Test
    public void testJavaVersionDate() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmCompressedOopsMode method, of class SystemProps.
     */
    @Test
    public void testJavaVmCompressedOopsMode() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmInfo method, of class SystemProps.
     */
    @Test
    public void testJavaVmInfo() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmName method, of class SystemProps.
     */
    @Test
    public void testJavaVmName() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmSpecificationName method, of class SystemProps.
     */
    @Test
    public void testJavaVmSpecificationName() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmSpecificationVendor method, of class SystemProps.
     */
    @Test
    public void testJavaVmSpecificationVendor() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmSpecificationVersion method, of class SystemProps.
     */
    @Test
    public void testJavaVmSpecificationVersion() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmVendor method, of class SystemProps.
     */
    @Test
    public void testJavaVmVendor() {
        writeBanner(methodName());
    }

    /**
     * Test of javaVmVersion method, of class SystemProps.
     */
    @Test
    public void testJavaVmVersion() {
        writeBanner(methodName());
    }

    /**
     * Test of jdkDebug method, of class SystemProps.
     */
    @Test
    public void testJdkDebug() {
        writeBanner(methodName());
    }

    /**
     * Test of lineSeparator method, of class SystemProps.
     */
    @Test
    public void testLineSeparator() {
        writeBanner(methodName());
    }

    /**
     * Test of osArch method, of class SystemProps.
     */
    @Test
    public void testOsArch() {
        writeBanner(methodName());
    }

    /**
     * Test of osName method, of class SystemProps.
     */
    @Test
    public void testOsName() {
        writeBanner(methodName());
    }

    /**
     * Test of osVersion method, of class SystemProps.
     */
    @Test
    public void testOsVersion() {
        writeBanner(methodName());
    }

    /**
     * Test of pathSeparator method, of class SystemProps.
     */
    @Test
    public void testPathSeparator() {
        writeBanner(methodName());
    }

    /**
     * Test of sunArchDataModel method, of class SystemProps.
     */
    @Test
    public void testSunArchDataModel() {
        writeBanner(methodName());
    }

    /**
     * Test of sunBootLibraryPath method, of class SystemProps.
     */
    @Test
    public void testSunBootLibraryPath() {
        writeBanner(methodName());
    }

    /**
     * Test of sunCpuEndian method, of class SystemProps.
     */
    @Test
    public void testSunCpuEndian() {
        writeBanner(methodName());
    }

    /**
     * Test of sunIoUnicodeEncoding method, of class SystemProps.
     */
    @Test
    public void testSunIoUnicodeEncoding() {
        writeBanner(methodName());
    }

    /**
     * Test of sunJavaCommand method, of class SystemProps.
     */
    @Test
    public void testSunJavaCommand() {
        writeBanner(methodName());
    }

    /**
     * Test of sunJavaLauncher method, of class SystemProps.
     */
    @Test
    public void testSunJavaLauncher() {
        writeBanner(methodName());
    }

    /**
     * Test of sunJnuEncoding method, of class SystemProps.
     */
    @Test
    public void testSunJnuEncoding() {
        writeBanner(methodName());
    }

    /**
     * Test of sunManagementCompiler method, of class SystemProps.
     */
    @Test
    public void testSunManagementCompiler() {
        writeBanner(methodName());
    }

    /**
     * Test of userCountry method, of class SystemProps.
     */
    @Test
    public void testUserCountry() {
        writeBanner(methodName());
    }

    /**
     * Test of userDir method, of class SystemProps.
     */
    @Test
    public void testUserDir() {
        writeBanner(methodName());
    }

    /**
     * Test of userHome method, of class SystemProps.
     */
    @Test
    public void testUserHome() {
        writeBanner(methodName());
    }

    /**
     * Test of userLanguage method, of class SystemProps.
     */
    @Test
    public void testUserLanguage() {
        writeBanner(methodName());
    }

    /**
     * Test of userName method, of class SystemProps.
     */
    @Test
    public void testUserName() {
        writeBanner(methodName());
    }

}
