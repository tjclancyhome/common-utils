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
package org.tjc.common.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Arrays.asList;

/**
 * Simple class for reflecting on an object of type T. Can get a list of all reader and setter methods as well
 * as invoke methods on the object.
 *
 * @author tjclancy
 * @param <T> The type of class we want to reflect on.
 */
public class ClassInfo<T> {
    private static final Logger log = LoggerFactory.getLogger(ClassInfo.class);
    Class<T> clazz;

    public ClassInfo(Class<T> clazz) {
        Objects.requireNonNull(clazz, () -> "The 'clazz' argument is null.");
        this.clazz = clazz;
    }

    /**
     * Given the method object passed in, returns true if the method exists otherwise it returns false.
     *
     * @param method The method object to check.
     *
     * @return True if the method is found, false otherwise.
     */
    public boolean hasMethod(Method method) {
        return getMethods().contains(method);
    }

    /**
     * Given the simple method name (e.g. getFoo) returns true if the method exists otherwise it returns
     * false.
     *
     * @param methodName The string name of the method.
     *
     * @return True if the method is found, false otherwise.
     */
    public boolean hasMethod(String methodName) {
        return getMethods().stream()
            .filter((Method m) -> {
                return m.getName().equals(methodName);
            }).count() > 0;
    }

    public List<Method> getMethods() {
        return Stream.of(clazz.getDeclaredMethods()).collect(Collectors.toList());
    }

    public List<Method> getReaderMethods() {
        return Stream.of(clazz.getDeclaredMethods())
            .filter((Method m) -> {
                return (m.getName().startsWith("get") || m.getName().startsWith("is"))
                    && !(m.getReturnType() == Void.TYPE)
                    && m.getParameterCount() == 0;
            })
            .collect(Collectors.toList());
    }

    public List<Method> getSetterMethods() {
        return Stream.of(clazz.getDeclaredMethods())
            .filter((Method m) -> {
                return m.getName().startsWith("set")
                    && m.getReturnType() == Void.TYPE
                    && m.getParameterCount() == 1;
            })
            .collect(Collectors.toList());
    }

    public List<Parameter> getMethodParameters(Method method) {
        return asList(method.getParameters());
    }

    public Class<?> getMethodReturnType(Method method) {
        return method.getReturnType();
    }

    public Object invokeReader(T object, Method readerMethod) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return readerMethod.invoke(object);
    }

}
