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
import org.junit.After;
import org.junit.Test;

/**
 *
 * @author tjclancy
 */
public class BeanReflectorTest {

    private Class<?> c;

    public BeanReflectorTest() {
    }

//    @Before
//    public void setUp() {
//        c = ConvertUtils.class;
//    }
    @After
    public void tearDown() {
    }

    /**
     * Test of getBeanClass method, of class BeanReflector.
     */
    @Test
    public void testGetBeanClass() {
        BeanReflector br = new BeanReflector(c);
        System.out.println(br.getBeanClass());

    }

    /**
     * Test of getGetterMethods method, of class BeanReflector.
     */
//    @Test
//    public void testGetGetterMethods() {
//        BeanReflector br = new BeanReflector(c);
//        br.getGetterMethods().forEach(m -> System.out.println(m));
//        System.out.println();
//    }
    /**
     * Test of getSetterMethods method, of class BeanReflector.
     */
    @Test
    public void testGetSetterMethods() {
//        BeanReflector br = new BeanReflector(c);
//        br.getSetterMethods().forEach(m -> System.out.println(m));
//        System.out.println();
    }

}
