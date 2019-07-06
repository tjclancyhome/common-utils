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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

/**
 * This class uses the Eclipse Collections library that I had discovered today (1/29/2018)
 *
 * @author tjclancy
 * @param <T>
 */
public class Chooser<T> {
    private final ImmutableList<T> choiceList;

    /**
     *
     * @param choices
     */
    private Chooser(Collection<T> choices) {
        this.choiceList = ImmutableList.copyOf(choices);
    }

    /**
     * Some people like 'with' while others like 'of' so here we have both.
     *
     * @param <T>
     * @param choices
     *
     * @return
     */
    public static <T> Chooser of(Collection<T> choices) {
        return new Chooser(choices);
    }

    /**
     * Some people like 'with' while others like 'of' so here we have both.
     *
     * @param <T>
     * @param choices
     *
     * @return
     */
    public static <T> Chooser of(T... choices) {
        return new Chooser(asList(choices));
    }

    /**
     * Some people like 'with' while others like 'of' so here we have both.
     *
     * @param <T>
     * @param choices
     *
     * @return
     */
    public static <T> Chooser with(Collection<T> choices) {
        return Chooser.of(choices);
    }

    /**
     * Some people like 'with' while others like 'of' so here we have both.
     *
     * @param <T>
     * @param choices
     *
     * @return
     */
    public static <T> Chooser with(T... choices) {
        return Chooser.of(asList(choices));
    }

    /**
     *
     * @return
     */
    public List getChoiceList() {
        return Lists.newArrayList(choiceList);
    }

    /**
     * Using ThreadLicalRandom, this method chooses and returns a random choice.
     *
     * @return
     */
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

}
