package org.tjc.common.utils.test;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author tjclancy
 */
public class BaseUnitTestTest {

    public BaseUnitTestTest() {
    }

    /**
     * Test of writeBanner method, of class UnitTestSupport.
     */
    @Test
    public void testWriteBanner() {
        UnitTestSupport.writeBanner("someFunctionName()");
    }

    /**
     * Test of banner method, of class UnitTestSupport.
     */
    @Test
    public void testBanner() {
        System.out.println(UnitTestSupport.banner("someFunctionName()"));
    }

    /**
     * Test of fill method, of class UnitTestSupport.
     */
    @Test
    public void testFill() {
        String result = UnitTestSupport.fill("*", 10);
        String expected = "**********";
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_Object() {

    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_String() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_boolean() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_char() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_charArr() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_double() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_float() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_int() {
    }

    /**
     * Test of writeln method, of class UnitTestSupport.
     */
    @Test
    public void testWriteln_long() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_Object() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_String() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_boolean() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_char() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_charArr() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_double() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_float() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_int() {
    }

    /**
     * Test of write method, of class UnitTestSupport.
     */
    @Test
    public void testWrite_long() {
    }

    /**
     * Test of writef method, of class UnitTestSupport.
     */
    @Test
    public void testWritef() {
    }

    /**
     * Test of writefln method, of class UnitTestSupport.
     */
    @Test
    public void testWritefln() {
    }

    /**
     * Test of writeMessage method, of class UnitTestSupport.
     */
    @Test
    public void testWriteMessage() {
    }

}
