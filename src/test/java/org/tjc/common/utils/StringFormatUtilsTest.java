/*
 * The MIT License
 *
 * Copyright 2017 tjclancy.
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

import java.text.MessageFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.unittest.BaseUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;
import static org.tjc.common.utils.StringFormatUtils.trueOrFalse;
import static org.tjc.common.utils.StringFormatUtils.yesOrNo;

/**
 *
 * @author tjclancy
 */
public class StringFormatUtilsTest extends BaseUnitTest {

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
     * Test of yesOrNo method, of class StringFormatUtils.
     */
    @Test
    public void testYesOrNo() {
        writeBanner(methodName());
        assertEquals(yesOrNo(true), "yes");
        assertEquals(yesOrNo(false), "no");
        System.out.println(MessageFormat.format("should be 'yes': {0}", yesOrNo(true)));
        System.out.println(MessageFormat.format("should be 'no' : {0}", yesOrNo(false)));
    }

    /**
     * Test of trueOrFalse method, of class StringFormatUtils.
     */
    @Test
    public void testTrueOrFalse() {
        writeBanner(methodName());
        assertEquals(trueOrFalse(true), "true");
        assertEquals(trueOrFalse(false), "false");
        System.out.println(MessageFormat.format("should be 'true' : {0}", trueOrFalse(true)));
        System.out.println(MessageFormat.format("should be 'false': {0}", trueOrFalse(false)));
    }

    /**
     * Test of underline method, of class StringFormatUtils.
     */
    @Test
    public void testUnderline_String() {
        writeBanner(methodName());

        String str = "This should be underlined with = characters.";
        String underlined = StringFormatUtils.underline(str);
        writeln("underlined:\n{0}", underlined);
    }

    /**
     * Test of underline method, of class StringFormatUtils.
     */
    @Test
    public void testUnderline_String_char() {
        writeBanner(methodName());
        String str = "This should be underlined with - characters.";
        String underlined = StringFormatUtils.underline(str, '-');
        writeln("underlined:\n{0}", underlined);
    }

    /**
     * Test of fill method, of class StringFormatUtils.
     */
    @Test
    public void testFill_String_int() {
        writeBanner(methodName());
    }

    /**
     * Test of fill method, of class StringFormatUtils.
     */
    @Test
    public void testFill_char_int() {
        writeBanner(methodName());
    }
}
