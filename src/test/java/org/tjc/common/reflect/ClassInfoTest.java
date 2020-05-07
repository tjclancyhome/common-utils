/*
 * The MIT License
 *
 * Copyright 2020 tjclancy.
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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.tjc.common.unittest.BaseUnitTest;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.tjc.common.unittest.UnitTestSupport.methodName;
import static org.tjc.common.unittest.UnitTestSupport.writeBanner;
import static org.tjc.common.unittest.UnitTestSupport.writeln;

/**
 *
 * @author tjclancy
 */
public class ClassInfoTest extends BaseUnitTest {

    public ClassInfoTest() {
    }

    @BeforeEach
    public void setup() {
        this.forceShowOutput();
    }

    @AfterEach
    public void tearDown() {
        writeln();
        this.restoreShowOutput();
    }

    @Test
    public void smokeTest() {
        Person person = new Person();

        writeln("----------------------------------------------------");
        writeln("Showing declared methods of person: {0}", person);
        writeln("----------------------------------------------------");
        Method[] declaredMethodsArray = person.getClass().getDeclaredMethods();
        writeln("declaredMethodsArray.length: {0}", declaredMethodsArray.length);
        List<Method> declaredMethods = List.of(declaredMethodsArray);
        declaredMethods.forEach(m -> writeln("declared method: {0}", m.getName()));
        writeln();

        writeln("----------------------------------------------------");
        writeln("Showing all methods of person: {0}", person);
        writeln("----------------------------------------------------");
        Method[] methodsArray = person.getClass().getMethods();
        writeln("methodsArray.length: {0}", methodsArray.length);
        List<Method> methods = List.of(methodsArray);
        methods.forEach(m -> writeln("method: {0}", m.getName()));
        writeln();

        writeln("----------------------------------------------------");
        writeln("Showing declared classes of person: {0}", person);
        writeln("----------------------------------------------------");
        Class<?>[] declaredClassesArray = person.getClass().getDeclaredClasses();
        writeln("declaredClassesArray.length: {0}", declaredClassesArray.length);
        List<Class> declaredClasses = List.of(declaredClassesArray);
        declaredClasses.forEach(clazz -> writeln("declared class: {0}", clazz.getName()));
        writeln();

        writeln("----------------------------------------------------");
        writeln("Showing all classes of person: {0}", person);
        writeln("----------------------------------------------------");
        Class<?>[] classesArray = person.getClass().getClasses();
        writeln("classesArray.length: {0}", classesArray.length);
        List<Class> classes = List.of(classesArray);
        classes.forEach(clazz -> writeln("class: {0}", clazz.getName()));
        writeln();

        writeln("----------------------------------------------------");
        writeln("Showing declared fields of person: {0}", person);
        writeln("----------------------------------------------------");
        Field[] declaredFieldsArray = person.getClass().getDeclaredFields();
        writeln("declaredFieldsArray.length: {0}", declaredFieldsArray.length);
        List<Field> declaredFields = List.of(declaredFieldsArray);
        declaredFields.forEach(field -> writeln("declared field: {0}", field.getName()));
        writeln();

        writeln("----------------------------------------------------");
        writeln("Showing all fields of person: {0}", person);
        writeln("----------------------------------------------------");
        Field[] fieldsArray = person.getClass().getFields();
        writeln("fieldsArray.length: {0}", fieldsArray.length);
        List<Field> fields = List.of(fieldsArray);
        fields.forEach(field -> writeln("field: {0}", field.getName()));
        writeln();

    }

    /**
     * Test of getMethods method, of class ClassInfo.
     */
    @Test
    public void testGetMethods() {
        writeBanner(methodName());

        ClassInfo<Person> classInfo = new ClassInfo<>(Person.class);
        List<Method> methods = classInfo.getMethods();
        methods.forEach(m -> writeln("reader method: {0}", m));
    }

    /**
     * Test of getReaderMethods method, of class ClassInfo.
     */
    @Test
    public void testGetReaderMethods() {
        writeBanner(methodName());

        Set<String> readerMethods = Set.of("getLastName", "getAge", "isDemocrat", "getFirstName");

        ClassInfo<Person> classInfo = new ClassInfo<>(Person.class);
        List<Method> methods = classInfo.getReaderMethods();

        assertThat(methods.size()).isEqualTo(readerMethods.size());

        methods.forEach(m -> {
            assertThat(readerMethods).contains(m.getName());
        });
    }

    /**
     * Test of getMethodParameters method, of class ClassInfo.
     */
    @Test
    public void testGetMethodParameters() {
        writeBanner(methodName());
        ClassInfo<Person> classInfo = new ClassInfo<>(Person.class);
        List<Method> methods = classInfo.getMethods();
        methods.forEach(m -> {
            writeln("method: {0}", m.getName());
            List<Parameter> parameters = classInfo.getMethodParameters(m);
            parameters.forEach(p -> {
                writeln("    parameter: {0}", p);
            });
        });
    }

    /**
     * Test of invokeReader method, of class ClassInfo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testInvokeReaders() throws Exception {
        writeBanner(methodName());
        Person readerMethods = new Person();
        ClassInfo<Person> classInfo = new ClassInfo<>(Person.class);
        List<Method> methods = classInfo.getReaderMethods();
        methods.forEach(m -> {
            try {
                Object result = classInfo.invokeReader(readerMethods, m);
                writeln("result of invoking {0} on readerMethods instance: result: {1}", m, result);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                writeln("Caught exception attempting to invoke a reader method: ex: {0}", ex.getMessage());
            }
        });
    }

    /**
     * Test of hasMethod method, of class ClassInfo.
     */
    @Test
    @Disabled("Not implemented yet.")
    public void testHasMethod_Method() {
        writeBanner(methodName());
    }

    /**
     * Test of hasMethod method, of class ClassInfo.
     */
    @Test
    public void testHasMethod_String() {
        writeBanner(methodName());
        ClassInfo<Person> classInfo = new ClassInfo(Person.class);
        boolean hasFirstName = classInfo.hasMethod("getFirstName");
        writeln("hasFirstName: {0}", hasFirstName);
    }

    /**
     * Test of getMethodReturnType method, of class ClassInfo.
     */
    @Test
    @Disabled("Not implemented yet.")
    public void testGetMethodReturnType() {
        writeBanner(methodName());
    }

    /**
     * Test of invokeReader method, of class ClassInfo.
     *
     * @throws java.lang.Exception
     */
    @Test
    @Disabled("Not implemented yet.")
    public void testInvokeReader() throws Exception {
        writeBanner(methodName());
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;
        private boolean democrat;

        public Person() {
            firstName = "Thomas";
            lastName = "Clancy";
            age = 53;
            democrat = true;
        }

        public Person(String firstName, String lastName, int age, boolean democrat) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.democrat = democrat;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDemocrat() {
            return democrat;
        }

        public void setDemocrat(boolean democrat) {
            this.democrat = democrat;
        }

        @Override
        public String toString() {
            return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", democrat=" + democrat + '}';
        }

    }

}
