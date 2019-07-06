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

import java.beans.Expression;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;
import static org.tjc.common.utils.test.UnitTestSupport.getMethodName;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;
import static org.tjc.common.utils.test.UnitTestSupport.writeBanner;
import static org.tjc.common.utils.test.UnitTestSupport.writeMessage;
import static org.tjc.common.utils.test.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class TestJDKReflection {

    @Before
    public void setup() {
        setShowOutput(true);
    }

    @Test
    public void testGetMethods() {
        writeBanner(getMethodName());

        Class<Class> clazz = Class.class;
        List<Method> methods = asList(clazz.getMethods());
        methods.forEach(m -> writeln(m));
        writeln();
    }

    @Test
    public void testGetDeclaredFields() {
        writeBanner(getMethodName());

        Class<Class> clazz = Class.class;
        List<Field> fields = asList(clazz.getDeclaredFields());
        fields.forEach(f -> writeln(f));
        writeln();
    }

    @Test
    public void testGetGetters() {
        writeBanner(getMethodName());

        Class<Expression> clazz = Expression.class;
        List<Method> methods = asList(clazz.getMethods());
        List<Method> getters = methods.stream().filter(m
            -> //(m.getName().startsWith("get") || m.getName().startsWith("is") || m.getName().startsWith("has"))
            m.getParameterCount() == 0
            && !m.getReturnType().getTypeName().equals("void"))
            .collect(Collectors.toList());
        getters.forEach(m -> writeln(m.getName()));
        writeln();
    }

    @Test
    public void testSetters() {
        writeBanner(getMethodName());

        Class<Expression> clazz = Expression.class;
        List<Method> methods = asList(clazz.getMethods());
        List<Method> setters = methods.stream().filter(m
            -> m.getName().startsWith("set")
            && m.getParameterCount() > 0
            && m.getReturnType().getTypeName().equals("void"))
            .collect(Collectors.toList());
        setters.forEach(m -> writeln(m.getName()));
        writeln();
    }

    @Test
    public void testConstructors() {
        writeBanner(getMethodName());

        Class<Expression> clazz = Expression.class;
        List<Constructor<?>> ctors = asList(clazz.getConstructors());
        ctors.forEach(c -> {
            writeln(c);
            if (c.getParameterCount() > 0) {
                List<Parameter> parms = asList(c.getParameters());
                parms.forEach(p -> writeMessage("    {0}", p));
            }
        });
        writeln();
    }
}
