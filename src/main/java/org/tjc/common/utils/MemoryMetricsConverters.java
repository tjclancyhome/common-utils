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

import static org.tjc.common.utils.MemoryMetricsConverters.MemDivisor.GB;
import static org.tjc.common.utils.MemoryMetricsConverters.MemDivisor.KB;
import static org.tjc.common.utils.MemoryMetricsConverters.MemDivisor.MB;
import static org.tjc.common.utils.MemoryMetricsConverters.MemDivisor.TB;

/**
 *
 * @author tjclancy
 */
public class MemoryMetricsConverters {

    /**
     * Found a simpilar algorithm for doing this at the following URL.
     *
     * @see
     * <a href="https://programming.guide/java/formatting-byte-size-to-human-readable-format.html">Java:
     * Formatting byte size to human readable format</a>.
     *
     * @param bytes The number of bytes to convert.
     * @param si If si (base10) is true then the units equal 1000 otherwise its 1024
     *
     * @return
     */
    public static String humanReadableByteCount(long bytes, boolean si) {
        return humanReadableByteCount(bytes, (si ? Base.BASE10 : Base.BASE2));
//        int unit = si ? 1000 : 1024;
//        if (bytes < unit) {
//            return bytes + " B";
//        }
//        int exp = (int) (Math.log(bytes) / Math.log(unit));
//        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
//        return String.format("%.1f%sB", bytes / Math.pow(unit, exp), pre);
    }

    /**
     * Instead of passing in a boolean named si (which seems confusing)
     *
     * @param bytes
     * @param m
     *
     * @return
     */
    public static String humanReadableByteCount(long bytes, Base m) {
        //int unit = si ? 1000 : 1024;
        int unit = m.getBase();
        boolean si = m.equals(Base.BASE10);

        if (bytes < unit) {
            return bytes + "B";
        }
        int exp = (int) (Math.log(bytes) / Math.log(unit));
//        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
        String pre = (si ? "KMGTPE" : "KMGTPE").charAt(exp - 1) + ""; //(si ? "" : "");
        return String.format("%.1f%s", bytes / Math.pow(unit, exp), pre);
    }

    /**
     * Calls humanReadableByteCount with si set to true.
     *
     * @param bytes The number of bytes to convert.
     *
     * @return
     */
    public static String humanReadableByteCount(long bytes) {
        return humanReadableByteCount(bytes, Base.BASE10);
    }

    /**
     *
     */
    public static enum MemDivisor {
        KB(1024.0D),
        MB(1024.0D * 1024.0D),
        GB(1024.0D * 1024.0D * 1024.0D),
        TB(1024.0D * 1024.0D * 1024.0D * 1024.0D);

        private final double divisor;

        MemDivisor(double divisor) {

            this.divisor = divisor;
        }

        public double getDivisor() {
            return divisor;
        }

        public double fromBytes(double bytes) {
            return bytes / divisor;
        }
    }

    public static double bytesToKB(double bytes) {
        return KB.fromBytes(bytes);
    }

    public static double bytesToMB(double bytes) {
        return MB.fromBytes(bytes);
    }

    public static double bytesToGB(double bytes) {
        return GB.fromBytes(bytes);
    }

    public static double bytesToTB(double bytes) {
        return TB.fromBytes(bytes);
    }

    public static String toMostRelevantString(double bytes) {

        if (bytes == -1.00) {
            return "0 bytes";
        }

        double value = bytesToTB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1fT", value);
        }

        value = bytesToGB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1fG", value);
        }

        value = bytesToMB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1fM", value);
        }

        value = bytesToKB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1fK", value);
        }

        return String.format("%sB", (int) bytes);
    }

    private MemoryMetricsConverters() {
    }

}
