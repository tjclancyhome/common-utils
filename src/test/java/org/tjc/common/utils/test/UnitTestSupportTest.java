/*
 * The MIT License Copyright 2018 tjclancy. Permission is hereby granted, free of charge, to any
 * person obtaining a copy of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions: The
 * above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package org.tjc.common.utils.test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.tjc.common.utils.MemoryMetricsConverters.toMostRelevantString;
import static org.tjc.common.utils.test.UnitTestSupport.SHOW_OUTPUT_SYS_PROPERTY;
import static org.tjc.common.utils.test.UnitTestSupport.listSystemProperties;
import static org.tjc.common.utils.test.UnitTestSupport.methodName;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;
import static org.tjc.common.utils.test.UnitTestSupport.writeBanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.util.Arrays;
import org.junit.Test;

/**
 *
 * @author tjclancy
 */
public class UnitTestSupportTest {

    public UnitTestSupportTest() {
        setShowOutput(true);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_0args() {
        writeBanner(methodName());
        UnitTestSupport.writeln();
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_Object() {
        writeBanner(methodName());
        Object o = null;
        UnitTestSupport.writeln(o);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_String() {
        writeBanner(methodName());
        String s = "";
        UnitTestSupport.writeln(s);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_boolean() {
        writeBanner(methodName());
        boolean b = false;
        UnitTestSupport.writeln(b);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_char() {
        writeBanner(methodName());
        char c = ' ';
        UnitTestSupport.writeln(c);
        UnitTestSupport.writeMessage("");
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_charArr() {
        writeBanner(methodName());
        char[] a = new char[10];
        UnitTestSupport.writeln(a);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_double() {
        writeBanner(methodName());
        double d = 0.0;
        UnitTestSupport.writeln(d);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_float() {
        writeBanner(methodName());
        float f = 0.0F;
        UnitTestSupport.writeln(f);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_int() {
        writeBanner(methodName());
        int i = 0;
        UnitTestSupport.writeln(i);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_long() {
        writeBanner(methodName());
        long l = 0L;
        UnitTestSupport.writeln(l);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_Object() {
        writeBanner(methodName());
        Object o = null;
        UnitTestSupport.write(o);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_String() {
        writeBanner(methodName());
        String s = "";
        UnitTestSupport.write(s);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_boolean() {
        writeBanner(methodName());
        boolean b = false;
        UnitTestSupport.write(b);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_char() {
        writeBanner(methodName());
        char c = ' ';
        UnitTestSupport.write(c);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_charArr() {
        writeBanner(methodName());
        char[] a = new char[10];
        UnitTestSupport.write(a);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_double() {
        writeBanner(methodName());
        double d = 0.0;
        UnitTestSupport.write(d);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_float() {
        writeBanner(methodName());
        float f = 0.0F;
        UnitTestSupport.write(f);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_int() {
        writeBanner(methodName());
        int i = 0;
        UnitTestSupport.write(i);
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_long() {
        writeBanner(methodName());
        long l = 0L;
        UnitTestSupport.write(l);
    }

    /**
     * Test of writef method, of class UnitTestSupport.
     */
    @Test
    public void testWritef() {
        writeBanner(methodName());
        String format = "";
        Object[] args = null;
        UnitTestSupport.writef(format, args);
    }

    /**
     * Test of writefln method, of class UnitTestSupport.
     */
    @Test
    public void testWritefln() {
        writeBanner(methodName());
        String format = "";
        Object[] args = null;
        UnitTestSupport.writefln(format, args);
    }

    /**
     * Test of writeMessage method, of class UnitTestSupport.
     */
    @Test
    public void testWriteMessage() {
        writeBanner(methodName());
        String pattern = "";
        Object[] args = null;
        UnitTestSupport.writeMessage(pattern, args);
    }

    /**
     * Test of writeBanner method, of class UnitTestSupport.
     */
    @Test
    public void testWriteBanner() {
        writeBanner(methodName());
        String message = "";
        UnitTestSupport.writeBanner(message);
    }

    /**
     * Test of banner method, of class UnitTestSupport.
     */
    @Test
    public void testBanner() {
        writeBanner(methodName());
        String message = "";
        String expResult = "";
        String result = UnitTestSupport.banner(message);
        System.out.println("result: " + result);

        assertThat(result).isNotEqualTo(expResult);
    }

    /**
     * Test of fill method, of class UnitTestSupport.
     */
    @Test
    public void testFill() {
        writeBanner(methodName());
        String fillValue = "";
        int count = 0;
        String expResult = "";
        String result = UnitTestSupport.fill(fillValue, count);
        // assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of isShowOutput method, of class UnitTestSupport.
     */
    @Test
    public void testIsShowOutput() {
        writeBanner(methodName());
        boolean expResult = false;
// boolean result = UnitTestSupport.isShowOutput();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of isHideOutput method, of class UnitTestSupport.
     */
    @Test
    public void testIsHideOutput() {
        writeBanner(methodName());
        boolean expResult = false;
        boolean result = UnitTestSupport.isHideOutput();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of setShowOutput method, of class UnitTestSupport.
     */
    @Test
    public void testSetShowOutput() {
        writeBanner(methodName());
        boolean showOutput = false;
        UnitTestSupport.setShowOutput(showOutput);
    }

    /**
     * Test of filesOnlyFilter method, of class UnitTestSupport.
     */
    @Test
    public void testFilesOnlyFilter() {
        writeBanner(methodName());
        DirectoryStream.Filter<Path> expResult = null;
        DirectoryStream.Filter<Path> result = UnitTestSupport.filesOnlyFilter();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of readLines method, of class UnitTestSupport.
     */
    @Test
    public void testReadLines() throws Exception {
        writeBanner(methodName());
        Path file = null;
        List<String> expResult = null;
// List<String> result = UnitTestSupport.readLines(file);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of countLines method, of class UnitTestSupport.
     */
    @Test
    public void testCountLines() throws Exception {
        writeBanner(methodName());
        Path file = null;
        long expResult = 0L;
// long result = UnitTestSupport.countLines(file);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of streamPaths method, of class UnitTestSupport.
     */
    @Test
    public void testStreamPaths() throws Exception {
        writeBanner(methodName());
        Path path = null;
        Stream<Path> expResult = null;
// Stream<Path> result = UnitTestSupport.streamPaths(path);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of streamLines method, of class UnitTestSupport.
     */
    @Test
    public void testStreamLines() throws Exception {
        writeBanner(methodName());
        Path file = null;
        Stream<String> expResult = null;
// Stream<String> result = UnitTestSupport.streamLines(file);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of bufferedReaderFrom method, of class UnitTestSupport.
     */
    @Test
    public void testBufferedReaderFrom() {
        writeBanner(methodName());
        InputStream is = null;
        BufferedReader expResult = null;
// BufferedReader result = UnitTestSupport.bufferedReaderFrom(is);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of fileToString method, of class UnitTestSupport.
     */
    @Test
    public void testFileToString() throws Exception {
        writeBanner(methodName());
        Path path = null;
        String expResult = "";
// String result = UnitTestSupport.fileToString(path);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of fileExists method, of class UnitTestSupport.
     */
    @Test
    public void testFileExists_String() {
        writeBanner(methodName());
        String fileName = "";
        boolean expResult = false;
        boolean result = UnitTestSupport.fileExists(fileName);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of fileExists method, of class UnitTestSupport.
     */
    @Test
    public void testFileExists_Path() {
        writeBanner(methodName());
        Path path = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.fileExists(path);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of fileExists method, of class UnitTestSupport.
     */
    @Test
    public void testFileExists_File() {
        writeBanner(methodName());
        File file = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.fileExists(file);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of filesExist method, of class UnitTestSupport.
     */
    @Test
    public void testFilesExist_Collection() {
        writeBanner(methodName());
        Collection<File> files = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.filesExist(files);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of filesExist method, of class UnitTestSupport.
     */
    @Test
    public void testFilesExist_FileArr() {
        writeBanner(methodName());
        File[] files = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.filesExist(files);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of filesExist method, of class UnitTestSupport.
     */
    @Test
    public void testFilesExist_Stream() {
        writeBanner(methodName());
        Stream<File> files = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.filesExist(files);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of pathsExist method, of class UnitTestSupport.
     */
    @Test
    public void testPathsExist_Collection() {
        writeBanner(methodName());
        Collection<Path> paths = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.pathsExist(paths);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of pathsExist method, of class UnitTestSupport.
     */
    @Test
    public void testPathsExist_PathArr() {
        writeBanner(methodName());
        Path[] paths = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.pathsExist(paths);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of pathsExist method, of class UnitTestSupport.
     */
    @Test
    public void testPathsExist_Stream() {
        writeBanner(methodName());
        Stream<Path> paths = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.pathsExist(paths);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of fileNamesIn method, of class UnitTestSupport.
     */
    @Test
    public void testFileNamesIn() throws Exception {
        writeBanner(methodName());
        String directory = "";
        boolean recursive = false;
        List<String> expResult = null;
        List<String> result = UnitTestSupport.fileNamesIn(directory, recursive);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of filesIn method, of class UnitTestSupport.
     */
    @Test
    public void testFilesIn() throws Exception {
        writeBanner(methodName());
        Path start = null;
        boolean recursive = false;
        List<Path> expResult = null;
// List<Path> result = UnitTestSupport.filesIn(start, recursive);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of filesInFileTree method, of class UnitTestSupport.
     */
    @Test
    public void testFilesInFileTree() throws Exception {
        writeBanner(methodName());
        Path start = null;
        List<Path> expResult = null;
// List<Path> result = UnitTestSupport.filesInFileTree(start);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of pathIsFile method, of class UnitTestSupport.
     */
    @Test
    public void testPathIsFile() {
        writeBanner(methodName());
        Path p = null;
        boolean expResult = false;
// boolean result = UnitTestSupport.pathIsFile(p);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of getMethodName method, of class UnitTestSupport.
     */
    @Test
    public void testGetMethodName() {
        writeBanner(methodName());
        String expResult = "";
// String result = UnitTestSupport.getMethodName();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of methodName method, of class UnitTestSupport.
     */
    @Test
    public void testMethodName() {
        writeBanner(methodName());
        String expResult = "";
        String result = UnitTestSupport.methodName();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of listOf method, of class UnitTestSupport.
     */
    @Test
    public void testListOf_GenericType() {
        writeBanner(methodName());
        Object[] members = null;
        List expResult = null;
// List result = UnitTestSupport.listOf(members);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of listOf method, of class UnitTestSupport.
     */
    @Test
    public void testListOf_0args() {
        writeBanner(methodName());
        List expResult = null;
        List result = UnitTestSupport.listOf();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of emptyList method, of class UnitTestSupport.
     */
    @Test
    public void testEmptyList() {
        writeBanner(methodName());
        List expResult = null;
        List result = UnitTestSupport.emptyList();
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of equals method, of class UnitTestSupport.
     */
    @Test
    public void testEquals() {
        writeBanner(methodName());
        Object o = null;
        UnitTestSupport instance = null;
        boolean expResult = false;
// boolean result = instance.equals(o);
// assertThat(result).isEqualTo(expResult);
    }

    /**
     * Test of hashCode method, of class UnitTestSupport.
     */
    @Test
    public void testHashCode() {
        writeBanner(methodName());
    }

    /**
     * Test of toString method, of class UnitTestSupport.
     */
    @Test
    public void testToString() {
        writeBanner(methodName());
    }

    /**
     * Test of copy method, of class UnitTestSupport.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCopy() throws Exception {
        writeBanner(methodName());
        String src = "";
        String dst = "";
// UnitTestSupport.copy(src, dst);
    }

    /**
     * Test of visitFiles method, of class UnitTestSupport.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testVisitFiles() throws Exception {
        writeBanner(methodName());
        Path path = Paths.get("target");
        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                throws IOException {
                UnitTestSupport.writeMessage("visiting file: {0}, attrs: {1}",
                    file,
                    stringify(attrs));
                return FileVisitResult.CONTINUE;
            }

        };
        Path result = UnitTestSupport.visitFiles(path, visitor);
        UnitTestSupport.writeln(result);
    }

    private static String stringify(BasicFileAttributes attrs) {
        return MessageFormat.format(
            "creationTime: {0}, size: {1}, isDirectory: {2}, isOther: {3}, isRegularFile: {4}, lastAccessTime: {5}, lastModifiedTime: {6}",
            attrs.creationTime(),
            toMostRelevantString(attrs.size()),
            attrs.isDirectory(),
            attrs.isOther(),
            attrs.isRegularFile(),
            attrs.lastAccessTime(),
            attrs.lastModifiedTime());
    }

    /**
     * Test of listSystemProperties method, of class UnitTestSupport.
     */
    @Test
    public void testListSystemProperties() {
        writeBanner(methodName());
        listSystemProperties(System.out);
        String value = System.getProperty("unitTestSupport.showOutput");
        System.out.println("value: " + value);
    }

    /**
     * Test of systemPropertiesContainsKey method, of class UnitTestSupport.
     */
    @Test
    public void testSystemPropertiesContainsKey() {
        writeBanner(methodName());

        Boolean b = UnitTestSupport.systemPropertiesContainsKey(SHOW_OUTPUT_SYS_PROPERTY);
        System.out.println("system propertcontains " + SHOW_OUTPUT_SYS_PROPERTY + ": " + b);

    }

    /**
     * Test of multiLineBanner method, of class UnitTestSupport.
     */
    @Test
    public void testMultiLineBanner_StringArr() {
        writeBanner(methodName());

        String expected = "*******************\n" + "* test            *\n" +
            "* this is a spec. *\n" + "*******************\n";

        String[] messages = Arrays.array("test", "this is a spec.");
        String banner = UnitTestSupport.multiLineBanner(messages);
        assertThat(banner).isEqualTo(expected);

        System.out.println(banner);
    }

    /**
     * Test of multiLineBanner method, of class UnitTestSupport.
     */
    @Test
    public void testMultiLineBanner_List() {
        writeBanner(methodName());

        String expected = "*******************\n" + "* test            *\n" +
            "* this is a spec. *\n" + "*******************\n";

        List<String> messages = asList("test", "this is a spec.");
        String banner = UnitTestSupport.multiLineBanner(messages);
        assertThat(banner).isEqualTo(expected);
        System.out.println(banner);
    }

    /**
     * Test of fill method, of class UnitTestSupport.
     */
    @Test
    public void testFill_String_int() {
        writeBanner(methodName());

        String expected = "hellohellohello";
        String filled = UnitTestSupport.fill("hello", 3);
        assertThat(filled).isEqualTo(expected);
    }

    /**
     * Test of fill method, of class UnitTestSupport.
     */
    @Test
    public void testFill_char_int() {
        writeBanner(methodName());

        String expected = "          ";
        String filled = UnitTestSupport.fill(' ', 10);
        assertThat(filled).isEqualTo(expected);
    }

    /**
     * Test of maxLength method, of class UnitTestSupport.
     */
    @Test
    public void testMaxLength_StringArr() {
        writeBanner(methodName());

        int expected = 9;
        int maxLength = UnitTestSupport.maxLength(
            new String[] {
                "this", "is", "an", "extremely", "simple", "test"
            });
        /*
         * 'extremely' is the largest with 9 chars.
         */
        assertThat(maxLength).isEqualTo(expected);
        System.out.println(maxLength);

    }

    /**
     * Test of maxLength method, of class UnitTestSupport.
     */
    @Test
    public void testMaxLength_Collection() {
        writeBanner(methodName());

        int expected = 9;
        int maxLength = UnitTestSupport.maxLength(
            asList("this", "is", "an", "extremely", "simple", "test"));
        /*
         * 'extremely' is the largest with 9 chars.
         */
        assertThat(maxLength).isEqualTo(expected);
    }

    @Test
    public void testUnitTestSupport_Strings_swap() {
        writeBanner(methodName());

        String original = "abcde";
        String expected = "ebcda";
        String swapped = UnitTestSupport.Strings.swap(original, 0, original.length() - 1);
        assertThat(original).isEqualTo("abcde");
        assertThat(swapped).isEqualTo(expected);
    }

}
