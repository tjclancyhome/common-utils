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
package org.tjc.common.utils;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author tjclancy
 */
public class ChooserTest {

    private static final List<String> CHOICES = List.of("Apple", "Banana", "Pear", "Peach", "Cherry");

    public ChooserTest() {
    }

    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of choose method, of class Chooser.
     */
    @Test
    public void testChooseFromCollectionCtor() {
        Set<String> choices = new HashSet<>();
        choices.add("Apple");
        choices.add("Banana");
        choices.add("Pear");
        choices.add("Peach");
        choices.add("Cherry");

        Chooser instance = Chooser.of(choices);
        assertNotNull(instance);

        for (int i = 0; i < 5; i++) {
            MessageFormat.format("choice: {0}", instance.choose());
        }
    }

    @Test
    public void testChooseFromArrayCtor() {
        Chooser instance = Chooser.of(CHOICES);
        assertNotNull(instance);

        for (int i = 0; i < 5; i++) {
            MessageFormat.format("choice: {0}", instance.choose());
        }
    }

    /**
     * Test of getChoiceList method, of class Chooser.
     */
    @Test()
    public void testGetChoiseList() {
        Chooser<String> instance = Chooser.of(CHOICES);
        assertNotNull(instance);
        String choice = instance.choose();
        assertTrue(CHOICES.contains(choice));
    }

    /**
     * Test of choose method, of class Chooser.
     */
    @Ignore
    @Test
    public void testChoose() {
    }

    /**
     * Test of of method, of class Chooser.
     */
    @Ignore
    @Test
    public void testOf_Collection() {
    }

    /**
     * Test of of method, of class Chooser.
     */
    @Ignore
    @Test
    public void testOf_GenericType() {
    }

    /**
     * Test of with method, of class Chooser.
     */
    @Ignore
    @Test
    public void testWith_Collection() {
    }

    /**
     * Test of with method, of class Chooser.
     */
    @Ignore
    @Test
    public void testWith_GenericType() {
    }

}
