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

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

import static org.tjc.common.utils.MemoryMetricsConverters.toMostRelevantString;

/**
 *
 * @author tjclancy
 */
public final class OS {
    private OS() {
    }

    public static String arch() {
        return getOperatingSystemMXBean().getArch();
    }

    public static String name() {
        return getOperatingSystemMXBean().getName();
    }

    public static String version() {
        return getOperatingSystemMXBean().getVersion();
    }

    public static int availableProcessors() {
        return getOperatingSystemMXBean().getAvailableProcessors();
    }

    public static double systemLoadAverage() {
        return getOperatingSystemMXBean().getSystemLoadAverage();
    }

    public static long committedVirtualMemorySize() {
        return getOperatingSystemMXBean().getCommittedVirtualMemorySize();
    }

    public static long freePhysicalMemorySize() {
        return getOperatingSystemMXBean().getFreePhysicalMemorySize();
    }

    public static long freeSwapSpaceSize() {
        return getOperatingSystemMXBean().getFreeSwapSpaceSize();
    }

    public static double processCpuLoad() {
        return getOperatingSystemMXBean().getProcessCpuLoad();
    }

    public static long processCpuTime() {
        return getOperatingSystemMXBean().getProcessCpuTime();
    }

    public static double systemCpuLoad() {
        return getOperatingSystemMXBean().getSystemCpuLoad();
    }

    public static long totalPhysicalMemorySize() {
        return getOperatingSystemMXBean().getTotalPhysicalMemorySize();
    }

    public static long totalSwapSpaceSize() {
        return getOperatingSystemMXBean().getTotalSwapSpaceSize();
    }

    public static String asString() {
        StringBuilder stringBulder = new StringBuilder();

        stringBulder
            .append("OS Management Stats:").append("\n")
            .append("============= ======").append("\n")
            .append("Architecture       : ").append(arch()).append("\n")
            .append("Name               : ").append(name()).append("\n")
            .append("Version            : ").append(version()).append("\n")
            .append("Processors         : ").append(availableProcessors()).append("\n\n")
            .append("  Load Stats:").append("\n")
            .append("  - ---------").append("\n")
            .append("  System Load Average: ").append(systemLoadAverage()).append("\n")
            .append("  Process CPU Load   : ").append(processCpuLoad()).append("\n")
            .append("  Process CPU Time   : ").append(processCpuTime()).append("\n")
            .append("  System CPU Load    : ").append(systemCpuLoad()).append("\n\n")
            .append("  Memory Stats:").append("\n")
            .append("  -------------").append("\n")
            .append("  Committed Virtual Memory Size: ").append(
            toMostRelevantString(committedVirtualMemorySize())).append("\n")
            .append("  Free Physical Memory Size    : ").append(
            toMostRelevantString(freePhysicalMemorySize())).append("\n")
            .append("  Free Swap Space Size         : ").append(
            toMostRelevantString(freeSwapSpaceSize())).append("\n")
            .append("  Total Physical Memory Size   : ").append(
            toMostRelevantString(totalPhysicalMemorySize())).append("\n")
            .append("  Total Swap Space Size        : ").append(
            toMostRelevantString(committedVirtualMemorySize())).append("\n");

        return stringBulder.toString();
    }

    private static com.sun.management.OperatingSystemMXBean getOperatingSystemMXBean() {
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        return (com.sun.management.OperatingSystemMXBean) os;
    }

}
