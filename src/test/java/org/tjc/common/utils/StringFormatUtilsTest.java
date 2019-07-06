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

import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.tjc.common.utils.StringFormatUtils.trueOrFalse;
import static org.tjc.common.utils.StringFormatUtils.yesOrNo;
import static org.tjc.common.utils.test.UnitTestSupport.getMethodName;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;
import static org.tjc.common.utils.test.UnitTestSupport.writeBanner;
import static org.tjc.common.utils.test.UnitTestSupport.writeMessage;
import static org.tjc.common.utils.test.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class StringFormatUtilsTest {

    @Before
    public void setup() {
        setShowOutput(true);
    }

    @After
    public void tearDown() {
        setShowOutput(false);
    }

    /**
     * Test of yesOrNo method, of class StringFormatUtils.
     */
    @Test
    public void testYesOrNo() {
        writeBanner(getMethodName());

        assertThat(yesOrNo(true)).isEqualTo("yes");
        assertThat(yesOrNo(false)).isEqualTo("no");
        writeMessage("should be 'yes': {0}", yesOrNo(true));
        writeMessage("should be 'no' : {0}", yesOrNo(false));
        writeln();
    }

    /**
     * Test of trueOrFalse method, of class StringFormatUtils.
     */
    @Test
    public void testTrueOrFalse() {
        writeBanner(getMethodName());

        assertThat(trueOrFalse(true)).isEqualTo("true");
        assertThat(trueOrFalse(false)).isEqualTo("false");
        writeMessage("should be 'true' : {0}", trueOrFalse(true));
        writeMessage("should be 'false': {0}", trueOrFalse(false));
    }

}
