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
package org.tjc.common.utils.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.Builder;
import lombok.Singular;
import static org.tjc.common.utils.test.UnitTestSupport.fill;
import static org.tjc.common.utils.test.UnitTestSupport.maxLength;

/**
 * Class used to create a formatted banner within test case methods. Some
 * examples:
 * <p>
 *
 * <pre>
 * ***********
 * * testFoo *
 * ***********
 * *************
 * * testFoo   *
 * *------------
 * * Message 1 *
 * * Message 2 *
 * *************
 * </pre>
 *
 * @author tjclancy
 *
 */
@Builder
public class Banner {

    private static final char DEFAULT_BORDER_CHAR = '*';
    private static final char DEFAULT_SEPARATOR_CHAR = '-';

    private final Character borderChar;
    private final Character separatorChar;
    private final String title;
    @Singular
    private final List<String> messages;

    Banner(Character borderChar, Character headerBarChar, String title,
        List<String> messages) {
        Objects.requireNonNull(title, "The 'title' argument is null.");
        Objects.requireNonNull(messages, "The 'messages' argument is null.");

        this.borderChar = (borderChar != null ? borderChar : DEFAULT_BORDER_CHAR);
        this.separatorChar = (headerBarChar != null ? headerBarChar : DEFAULT_SEPARATOR_CHAR);
        this.title = title;
        this.messages = new ArrayList<>(messages);
    }

    /**
     *
     * @return
     */
    public Character getBorderChar() {
        return borderChar;
    }

    /**
     *
     * @return
     */
    public Character getSeparatorChar() {
        return separatorChar;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public List<String> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    /**
     *
     * @return
     */
    public String generateBanner() {
        StringBuilder sb = new StringBuilder();
        int maxLength = maxLength(messages);
        String border = fill("*", maxLength + 4);
        sb.append(border).append("\n");
        if (title != null && !title.isEmpty()) {
            formatMessage(sb, maxLength, title);
            formatSeparator(sb, maxLength, separatorChar);
        }
        messages.forEach((s) -> {
            formatMessage(sb, maxLength, s);
        });
        sb.append(border).append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Banner{" + "borderChar: " + borderChar + ", headerBarChar: " + separatorChar + ", title: "
            + title + ", messages: " + messages + '}';
    }

    private static void formatMessage(StringBuilder sb, int len, String s) {
        sb.append("* ").append(s).append(fill(" ", len - s.length())).append(" *").append("\n");
    }

    private static void formatSeparator(StringBuilder sb, int len, char sepChar) {
        sb.append("*").append(" ").append(fill(sepChar, len)).append(" ").append("*").append("\n");
    }

}
