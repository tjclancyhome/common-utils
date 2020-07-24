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

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.unittest.BaseUnitTest;

import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class PathUtilsTest extends BaseUnitTest {

    @BeforeEach
    public void forEach() {
        forceShowOutput();
    }

    @AfterEach
    public void afterEach() {
        writeln();
        restoreShowOutput();
    }

    /**
     * Test of pathOf method, of class PathUtils.
     */
    @Test
    public void testPathOf_String() {
        writeBanner(methodName());
        Path p = PathUtils.pathOf("src/main/resources/data/names.csv");
        writeln("does path {0} exist: {1}", p, Files.exists(p));

    }

    /**
     * Test of pathOf method, of class PathUtils.
     *
     * @throws java.net.URISyntaxException If there is a problem with the syntax the path string.
     */
    @Test
    public void testPathOf_URI() throws URISyntaxException {
        writeBanner(methodName());
        URL url = PathUtilsTest.class.getResource("/data/names.csv");
        Path p = PathUtils.pathOf(url.toURI());
        writeln("does path {0} exist: {1}", p, Files.exists(p));
    }

    /**
     * Test of getFileAttributes method, of class PathUtils.
     */
    @Test
    public void testGetFileAttributes() {
        writeBanner(methodName());
        Path p = Path.of("src/main/resources/data/names.csv");
        writeln("does path {0} exist: {1}", p, Files.exists(p));
        writeln("file attributes of {0} are: {1}", p, PathUtils.getFileAttributes(p));
    }

}
