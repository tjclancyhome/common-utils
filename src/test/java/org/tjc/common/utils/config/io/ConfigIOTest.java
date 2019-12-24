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
package org.tjc.common.utils.config.io;

import java.io.PrintWriter;
import java.net.URL;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.tjc.common.BaseTest;
import org.tjc.common.utils.config.Config;
import org.tjc.common.utils.config.ConfigFactory;
import org.tjc.common.utils.config.PropertiesConfigLoader;
import org.tjc.common.utils.config.io.ConfigIO;
import org.tjc.common.utils.config.io.ConfigIOTest;

/**
 *
 * @author tjclancy
 */
public class ConfigIOTest extends BaseTest {

    private final URL configFileLocation;

    public ConfigIOTest() {
        configFileLocation = ConfigIOTest.class.getResource("/application.properties");
    }

    @AfterEach
    public void tearDown() {
        System.out.println();
    }

    /**
     * Test of print method, of class ConfigUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPrint_Config() throws Exception {
        printBanner("testPrint_Config()");

        Config config = ConfigFactory.newConfig(new PropertiesConfigLoader(configFileLocation));
        ConfigIO.print(config);
    }

    /**
     * Test of print method, of class ConfigUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPrint_PrintStream_Config() throws Exception {
        printBanner("testPrint_PrintStream_Config()");

        Config config = ConfigFactory.newConfig(new PropertiesConfigLoader(configFileLocation));
        ConfigIO.print(System.out, config);
    }

    /**
     * Test of print method, of class ConfigUtils.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPrint_PrintWriter_Config() throws Exception {
        printBanner("testPrint_PrintWriter_Config()");

        Config config = ConfigFactory.newConfig(new PropertiesConfigLoader(configFileLocation));
        PrintWriter writer = new PrintWriter(System.out);
        ConfigIO.print(writer, config);
    }

}
