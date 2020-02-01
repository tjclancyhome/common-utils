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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.tjc.common.BaseTest;
import org.tjc.common.utils.config.io.ConfigIO;

/**
 *
 * @author tjclancy
 */
public class ConfigFactoryTest extends BaseTest {

    public ConfigFactoryTest() {
    }

    @AfterEach
    public void tearDown() {
        System.out.println();
    }

    /**
     * Test of newConfig method, of class ConfigFactory.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testNewConfig() throws Exception {
        printBanner("testNewConfig()");

        PropertiesConfigLoader loader = new PropertiesConfigLoader(getClass().getResource(
            "/application.properties"));
        Config config = ConfigFactory.newConfig(loader);
        assertFalse(config.isEmpty());
        ConfigIO.print(config);
    }

    /**
     * Test of newConfig method, of class ConfigFactory.
     */
    @Test
    public void testNewConfig_ConfigLoader() throws Exception {
    }

}
