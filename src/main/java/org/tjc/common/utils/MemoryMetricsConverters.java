
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

//    private static final Logger log = LoggerFactory.getLogger(MemoryMetricsConverters.class);
    /**
     * Found a simpilar algorithm for doing this at the following URL.
     *
     * @see
     * <a href="https://programming.guide/java/formatting-byte-size-to-human-readable-format.html">Java:
     * Formatting byte size to human readable format</a>.
     *
     * @param bytes
     * @param si
     *
     * @return
     */
    public static String humanReadableByteCount(long bytes, boolean si) {
        int unit = si ? 1000 : 1024;
        if (bytes < unit) {
            return bytes + " B";
        }
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }

    public static String humanReadableByteCount(long bytes) {
        return humanReadableByteCount(bytes, true);
    }

    public static enum MemDivisor {
        KB(1024.0D),
        MB(1024.0D * 1024.0D),
        GB(1024.0D * 1024.0D * 1024.0D),
        TB(1024.0D * 1024.0D * 1024.0D * 1024.0D);

        private final double divisor;

        MemDivisor(double divisor) {
//            log.debug("Constructing MemDivisor with divisor: {}", divisor);

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
            return String.format("%.1f TB", value);
        }

        value = bytesToGB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1f GB", value);
        }

        value = bytesToMB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1f MB", value);
        }

        value = bytesToKB(bytes);
        if (value >= 1 || value <= -1) {
            return String.format("%.1f KB", value);
        }

        return String.format("%s bytes", (int) bytes);
    }

    private MemoryMetricsConverters() {
    }

}
