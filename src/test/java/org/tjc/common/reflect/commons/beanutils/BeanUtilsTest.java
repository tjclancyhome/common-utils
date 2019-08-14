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
package org.tjc.common.reflect.commons.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import org.junit.Test;

/**
 *
 * @author tjclancy
 */
public class BeanUtilsTest {

    @Test
    public void smokeTest() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Employee employee = createEmployee();

//        Object prop = PropertyUtils.getSimpleProperty(employee, "firstName");
//        System.out.println(prop);
//        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors(employee);
//        Stream.of(descriptors).forEach(d -> System.out.println(d.getReadMethod()));
//        System.out.println();
//        Stream.of(descriptors).forEach(d -> System.out.println(d.getWriteMethod()));
    }

    public Employee createEmployee() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1967, 1, 11);
        Calendar hireDate = Calendar.getInstance();
        hireDate.set(2018, 2, 19);

        Address address = new Address("273 Deerfield Drive", "Canonsburg", "PA", "15317");
        Employee employee = new Employee(
                "Thomas",
                "Clancy",
                "Joseph",
                birthDate.getTime(),
                address,
                50,
                hireDate.getTime(),
                "111-11-1111");

        return employee;
    }
}
