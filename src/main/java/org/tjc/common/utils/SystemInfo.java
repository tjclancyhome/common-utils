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

import static java.lang.System.getProperty;

/**
 *
 * @author tjclancy
 * @deprecated Use SystemProps instead.
 */
@Deprecated
public final class SystemInfo {

    public static String awtToolkit() {
        return getProperty("awt.toolkit");
    }

    public static String fileEncoding() {
        return getProperty("file.encoding");
    }

    public static String fileSeparator() {
        return getProperty("file.separator");
    }

    public static String javaAwtGraphicsenv() {
        return getProperty("java.awt.graphicsenv");
    }

    public static String javaClassPath() {
        return getProperty("java.class.path");
    }

    public static String javaClassVersion() {
        return getProperty("java.class.version");
    }

    public static String javaHome() {
        return getProperty("java.home");
    }

    public static String javaIoTmpdir() {
        return getProperty("java.io.tmpdir");
    }

    public static String javaLibraryPath() {
        return getProperty("java.library.path");
    }

    public static String javaRuntimeName() {
        return getProperty("java.runtime.name");
    }

    public static String javaRuntimeVersion() {
        return getProperty("java.runtime.version");
    }

    public static String javaSpecificationName() {
        return getProperty("java.specification.name");
    }

    public static String javaSpecificationVendor() {
        return getProperty("java.specification.vendor");
    }

    public static String javaSpecificationVersion() {
        return getProperty("java.specification.version");
    }

    public static String javaVendor() {
        return getProperty("java.vendor");
    }

    public static String javaVendorUrl() {
        return getProperty("java.vendor.url");
    }

    public static String javaVendorUrlBug() {
        return getProperty("java.vendor.url.bug");
    }

    public static String javaVersion() {
        return getProperty("java.version");
    }

    public static String javaVersionDate() {
        return getProperty("java.version.date");
    }

    public static String javaVmCompressedOopsMode() {
        return getProperty("java.vm.compressedOopsMode");
    }

    public static String javaVmInfo() {
        return getProperty("java.vm.info");
    }

    public static String javaVmName() {
        return getProperty("java.vm.name");
    }

    public static String javaVmSpecificationName() {
        return getProperty("java.vm.specification.name");
    }

    public static String javaVmSpecificationVendor() {
        return getProperty("java.vm.specification.vendor");
    }

    public static String javaVmSpecificationVersion() {
        return getProperty("java.vm.specification.version");
    }

    public static String javaVmVendor() {
        return getProperty("java.vm.vendor");
    }

    public static String javaVmVersion() {
        return getProperty("java.vm.version");
    }

    public static String jdkDebug() {
        return getProperty("jdk.debug");
    }

    public static String lineSeparator() {
        return getProperty("line.separator");
    }

    public static String osArch() {
        return getProperty("os.arch");
    }

    public static String osName() {
        return getProperty("os.name");
    }

    public static String osVersion() {
        return getProperty("os.version");
    }

    public static String pathSeparator() {
        return getProperty("path.separator");
    }

    public static String sunArchDataModel() {
        return getProperty("sun.arch.data.model");
    }

    public static String sunBootLibraryPath() {
        return getProperty("sun.boot.library.path");
    }

    public static String sunCpuEndian() {
        return getProperty("sun.cpu.endian");
    }

    public static String sunIoUnicodeEncoding() {
        return getProperty("sun.io.unicode.encoding");
    }

    public static String sunJavaCommand() {
        return getProperty("sun.java.command");
    }

    public static String sunJavaLauncher() {
        return getProperty("sun.java.launcher");
    }

    public static String sunJnuEncoding() {
        return getProperty("sun.jnu.encoding");
    }

    public static String sunManagementCompiler() {
        return getProperty("sun.management.compiler");
    }

    public static String userCountry() {
        return getProperty("user.country");
    }

    public static String userDir() {
        return getProperty("user.dir");
    }

    public static String userHome() {
        return getProperty("user.home");
    }

    public static String userLanguage() {
        return getProperty("user.language");
    }

    public static String userName() {
        return getProperty("user.name");
    }

    public static String property(String propName) {
        return getProperty(propName);
    }

    public static boolean propertyExists(String propName) {
        var exists = getProperty(propName);
        return exists != null;
    }

}
