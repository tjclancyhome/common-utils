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

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import static java.util.Arrays.asList;
import java.util.List;

/**
 *
 * @author tjclancy
 * @param <T>
 */
public class BeanReflector<T> {

    private static final String GETTER_PREFIX = "get";
    private static final String IS_GETTER_PREFIX = "is";

    private final Class<T> beanClass;

    public BeanReflector(Class<T> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<T> getBeanClass() {
        return beanClass;
    }

    public void introspect() throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
        System.out.printf("### beanDescriptor      : %s%n", beanInfo.getBeanDescriptor());
        System.out.printf("### defaultEventIndex   : %s%n", beanInfo.getDefaultEventIndex());
        System.out.printf("### defaultPropertyIndex: %s%n", beanInfo.getDefaultPropertyIndex());
        System.out.printf("### eventSetDescriptors : %s%n", asList(beanInfo.getEventSetDescriptors()));
        List<MethodDescriptor> mds = asList(beanInfo.getMethodDescriptors());
        System.out.printf("### methodDescriptors   :%n");
        mds.forEach(md -> System.out.println("###   " + md.getName()));
        List<PropertyDescriptor> pds = asList(beanInfo.getPropertyDescriptors());
        System.out.printf("### propertyDescriptors :%n");
        pds.forEach(pd -> System.out.println("###   " + pd.getName()));


    }

    public List<String> getPropertyNames() {
        return null;
    }

//    public List<Method> getGetterMethods() {
//        return Stream.of(beanClass.getDeclaredMethods())
//            .filter(m -> isGetter(m))
//            .collect(Collectors.toList());
//    }
//    public List<Method> getSetterMethods() {
//        return Stream.of(beanClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("set") && !m.getName().equals("set") && m.getParameterCount() > 0 && m.
//                getReturnType().equals(Void.TYPE))
//                .collect(Collectors.toList());
//    }
    private boolean isGetter(Method m) {
        boolean result;

        String name = m.getName();
        Class<?> returnType = m.getReturnType();
        int parameterCount = m.getParameterCount();

        result = (name.startsWith(GETTER_PREFIX) && !name.equals(GETTER_PREFIX) && !returnType
            .equals(Void.TYPE));
        if (!result) {
            result = (name.startsWith(IS_GETTER_PREFIX) && !name.equals(IS_GETTER_PREFIX) && returnType
                .equals(
                    Boolean.TYPE));
        }
        if (result) {
            result = parameterCount == 0;
        }
        return result;
    }

}
