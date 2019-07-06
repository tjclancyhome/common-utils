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
package org.tjc.common.utils.test;

import static java.util.Arrays.asList;
import org.junit.Before;
import org.junit.Test;
import static org.tjc.common.utils.test.UnitTestSupport.methodName;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;
import static org.tjc.common.utils.test.UnitTestSupport.writeBanner;
import static org.tjc.common.utils.test.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class BannerTest {

    public BannerTest() {
    }

    @Before
    public void setup() {
        setShowOutput(true);
    }

//    /**
//     * Test of builder method, of class Banner.
//     */
//    @Test
//    public void testBuilder() {
//        writeBanner(methodName());
//
//        Banner.BannerBuilder bb = Banner.builder();
//        writeln("before: " + bb.toString());
//
//        Banner banner = bb
//            //.borderChar('*')
//            //.headerBarChar('-')
//            .title("testFoo")
//            .message("message 1")
//            .message("message 2")
//            .message("message 3")
//            .build();
//
//        writeln("after: " + banner.toString());
//    }

    /**
     * Test of getBorderChar method, of class Banner.
     */
    @Test
    public void testGetBorderChar() {
        writeBanner(methodName());
    }

    /**
     * Test of getHeaderBarChar method, of class Banner.
     */
    @Test
    public void testGetHeaderBarChar() {
        writeBanner(methodName());
    }

    /**
     * Test of getTitle method, of class Banner.
     */
    @Test
    public void testGetTitle() {
        writeBanner(methodName());
    }

    /**
     * Test of getMessages method, of class Banner.
     */
    @Test
    public void testGetMessages() {
        writeBanner(methodName());
    }

//    /**
//     * Test of generateBanner method, of class Banner.
//     */
//    @Test
//    public void testGenerateBanner() {
//        Banner.BannerBuilder builder = Banner.builder();
//
//        Banner banner = builder
//            .title("testFoo")
//            .message("message 1")
//            .message("message 2")
//            .message("message 3")
//            .build();
//        String result = banner.generateBanner();
//        writeln(result);
//
//        result = UnitTestSupport.multiLineBanner(
//            asList("title", "message 1", "message 2"));
//        writeln(result);
//    }

    /**
     * Test of toString method, of class Banner.
     */
    @Test
    public void testToString() {
        writeBanner(methodName());
    }

}
