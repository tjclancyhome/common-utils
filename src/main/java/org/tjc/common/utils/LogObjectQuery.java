/*
 * The MIT License
 *
 * Copyright 2017 tjclancy.
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import static org.tjc.common.utils.StringFormatUtils.trueOrFalse;

/**
 *
 * @author tjclancy
 */
public final class LogObjectQuery {

    private static final String LOG_LEVEL_STATE_FORMAT = "%s: %s";

    public static class Slf4jQuery {

        public static List<String> getLogLevelsState(Logger log) {
            Objects.requireNonNull(log, "The logger argument is null.");

            List<String> levelsState = new ArrayList<>();

            levelsState.add(String.format(LOG_LEVEL_STATE_FORMAT, "isErrorEnabled", trueOrFalse(log.
                    isErrorEnabled())));
            levelsState.add(String.format(LOG_LEVEL_STATE_FORMAT, "isInfoEnabled ", trueOrFalse(log.
                    isInfoEnabled())));
            levelsState.add(String.format(LOG_LEVEL_STATE_FORMAT, "isWarnEnabled ", trueOrFalse(log.
                    isWarnEnabled())));
            levelsState.add(String.format(LOG_LEVEL_STATE_FORMAT, "isDebugEnabled", trueOrFalse(log.
                    isDebugEnabled())));
            levelsState.add(String.format(LOG_LEVEL_STATE_FORMAT, "isTraceEnabled", trueOrFalse(log.
                    isTraceEnabled())));

            return levelsState;
        }

        private Slf4jQuery() {
        }

    }

}
