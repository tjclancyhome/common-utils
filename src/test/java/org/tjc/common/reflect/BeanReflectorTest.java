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
package org.tjc.common.reflect;

//import org.apache.commons.beanutils.ConvertUtils;
import org.junit.jupiter.api.Test;
import org.tjc.common.utils.config.ConfigImpl;

/**
 *
 * @author tjclancy
 */
public class BeanReflectorTest {

    private Class<?> c;

    /**
     * Test of getBeanClass method, of class BeanReflector.
     */
    @Test
    public void testGetBeanClass() {
        BeanReflector br = new BeanReflector(c);
        System.out.println(br.getBeanClass());

    }

    @Test
    public void testGetSetterMethods() {
    }

    /**
     * Test of introspect method, of class BeanReflector.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testIntrospect() throws Exception {
        BeanReflector br = new BeanReflector(ConfigImpl.class);
        br.introspect();
    }

    /**
     * Test of getPropertyNames method, of class BeanReflector.
     */
    @Test
    public void testGetPropertyNames() {
    }

}
