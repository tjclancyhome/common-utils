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
package org.tjc.common.json;

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
public class JsonFormatterTest {

    private static final String JSON_DOC = "{\"data\": {\"authMethods\": [\"local\", \"Active Directory\"]},\"status\": 200,\"message\": null,\"isSuccessful\": true}\n"
        + "";

    public JsonFormatterTest() {
    }

    @Before
    public void setup() {
        setShowOutput(true);
    }

    /**
     * Test of formatJson method, of class JsonFormatter.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFormatJson_String() throws Exception {
        writeBanner(methodName());
        String jsonDoc = JSON_DOC;
        String result = JsonFormatter.formatJson(jsonDoc);
        writeln(result);
    }

    /**
     * Test of formatJson method, of class JsonFormatter.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFormatJson_Object() throws Exception {
        writeBanner(methodName());
    }

}
