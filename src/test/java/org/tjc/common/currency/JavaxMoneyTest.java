/*
 * The MIT License
 *
 * Copyright 2019 tjclancy.
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
package org.tjc.common.currency;

//import javax.money.CurrencyUnit;
//import javax.money.Monetary;
//import javax.money.MonetaryAmount;
//import javax.money.MonetaryContext;
//import javax.money.NumberValue;
//import javax.money.UnknownCurrencyException;
//import javax.money.convert.CurrencyConversion;
//import javax.money.convert.MonetaryConversions;
//import javax.money.format.AmountFormatQueryBuilder;
//import javax.money.format.MonetaryAmountFormat;
//import javax.money.format.MonetaryFormats;
import lombok.extern.slf4j.Slf4j;
//import org.javamoney.moneta.FastMoney;
//import org.javamoney.moneta.Money;
//import org.javamoney.moneta.format.CurrencyStyle;
import org.junit.Before;
import org.junit.Test;
import static org.tjc.common.utils.test.UnitTestSupport.setShowOutput;

/**
 *
 * @author tjclancy
 */
@Slf4j
public class JavaxMoneyTest {

    @Before
    public void setUp() {
        setShowOutput(true);
    }
    
    @Test
    public void testSmoke() {
        System.out.println("Test smoke!!!");
    }

//    @Test
//    public void smokeTest() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount monetaryAmount = Money.of(100.20, "USD");
//        CurrencyUnit currencyUnit = monetaryAmount.getCurrency();
//        NumberValue numberValue = monetaryAmount.getNumber();
//        int value = numberValue.intValue();
//
//        writeMessage("value         : {0}", value);
//        writeMonetaryAmount("monetaryAmount", monetaryAmount);
//        writeCurrencyUnit("currencyUnit", currencyUnit);
//    }
//
//    @Test
//    public void givenCurrencyCode_whenString_thanExist() {
//        writeBanner(getMethodName());
//
//        CurrencyUnit usd = Monetary.getCurrency("USD");
//
//        assertThat(usd).isNotNull();
//        assertThat("USD").isEqualTo(usd.getCurrencyCode());
//        assertThat(840).isEqualTo(usd.getNumericCode());
//        assertThat(2).isEqualTo(usd.getDefaultFractionDigits());
//
//        writeCurrencyUnit("usd", usd);
//    }
//
//    @Test(expected = UnknownCurrencyException.class)
//    public void givenCurrencyCode_whenNoneExist_thanThrowsError() {
//        writeBanner(getMethodName());
//        Monetary.getCurrency("AAA");
//    }
//
//    @Ignore
//    @Test
//    public void givenAmounts_whenStringified_thanEquals() {
//        writeBanner(getMethodName());
//
//        CurrencyUnit usd = Monetary.getCurrency("USD");
//        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory()
//                .setCurrency(usd).setNumber(200).create();
//        Money moneyof = Money.of(12, usd);
//        FastMoney fastmoneyof = FastMoney.of(2, usd);
//
//        log.debug("fstAmtUSD: {}", fstAmtUSD);
//        assertThat(usd.toString()).isEqualTo("USD");
//        assertThat(fstAmtUSD.toString()).isEqualTo("USD 200");
//        assertThat(moneyof.toString()).isEqualTo("USD 12");
//        assertThat(fastmoneyof.toString()).isEqualTo("USD 2.00000");
//
//        writeCurrencyUnit("usd", usd);
//        writeMonetaryAmount("fstAmtUSD", fstAmtUSD);
//        writeMoney("moneyof", moneyof);
//        writeFastMoney("fastmoneyof", fastmoneyof);
//    }
//
//    @Test
//    @SuppressWarnings("IncompatibleEquals")
//    public void givenCurrencies_whenCompared_thanNotequal() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount oneDolar = Monetary.getDefaultAmountFactory()
//                .setCurrency("USD").setNumber(1).create();
//        Money oneEuro = Money.of(1, "EUR");
//
//        assertThat(oneEuro.equals(FastMoney.of(1, "EUR"))).isFalse();
//        assertThat(oneDolar.equals(Money.of(1, "USD"))).isTrue();
//
//        writeMonetaryAmount("oneDollar", oneDolar);
//        writeMoney("oneEuro", oneEuro);
//    }
//
//    @Test
//    public void givenAmounts_whenSummed_thanCorrect() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount[] monetaryAmounts = new MonetaryAmount[]{
//            Money.of(100, "CHF"), Money.of(10.20, "CHF"), Money.of(1.15, "CHF")
//        };
//
//        Money sumAmtCHF = Money.of(0, "CHF");
//        for (MonetaryAmount monetaryAmount : monetaryAmounts) {
//            sumAmtCHF = sumAmtCHF.add(monetaryAmount);
//        }
//
//        assertThat(sumAmtCHF.toString()).isEqualTo("CHF 111.35");
//
//        writeMonetaryAmounts(monetaryAmounts);
//    }
//
//    @Ignore
//    @Test
//    public void givenArithmetic_whenStringified_thanEqualsAmount() {
//        writeBanner(getMethodName());
//
//        CurrencyUnit usd = Monetary.getCurrency("USD");
//
//        Money moneyof = Money.of(12, usd);
//        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory()
//                .setCurrency(usd).setNumber(200.50).create();
//        MonetaryAmount oneDolar = Monetary.getDefaultAmountFactory()
//                .setCurrency("USD").setNumber(1).create();
//        Money subtractedAmount = Money.of(1, "USD").subtract(fstAmtUSD);
//        MonetaryAmount multiplyAmount = oneDolar.multiply(0.25);
//        MonetaryAmount divideAmount = oneDolar.divide(0.25);
//
//        assertThat(usd.toString()).isEqualTo("USD");
//        assertThat(oneDolar.toString()).isEqualTo("USD 1");
//        assertThat(fstAmtUSD.toString()).isEqualTo("USD 200.5");
//        assertThat(moneyof.toString()).isEqualTo("USD 12");
//        assertThat(subtractedAmount.toString()).isEqualTo("USD -199.5");
//        assertThat(multiplyAmount.toString()).isEqualTo("USD 0.25");
//        assertThat(divideAmount.toString()).isEqualTo("USD 4");
//    }
//
//    @Ignore
//    @Test
//    public void givenAmount_whenRounded_thanEquals() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount fstAmtEUR = Monetary.getDefaultAmountFactory()
//                .setCurrency("EUR").setNumber(1.30473908).create();
//        MonetaryAmount roundEUR = fstAmtEUR.with(Monetary.getDefaultRounding());
//
//        assertThat(fstAmtEUR.toString()).isEqualTo("EUR 1.30473908");
//        assertThat(roundEUR.toString()).isEqualTo("EUR 1.3");
//    }
//
//    @Ignore
//    @Test
//    public void givenAmount_whenConversion_thenNotNull() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD")
//                .setNumber(1).create();
//
//        CurrencyConversion conversionEUR = MonetaryConversions.getConversion("EUR");
//
//        MonetaryAmount convertedAmountUSDtoEUR = oneDollar.with(conversionEUR);
//
//        assertThat(oneDollar.toString()).isEqualTo("USD 1");
//        assertThat(convertedAmountUSDtoEUR).isNotNull();
//    }
//
//    @Ignore
//    @Test
//    public void givenLocale_whenFormatted_thanEquals() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory()
//                .setCurrency("USD").setNumber(1).create();
//
//        MonetaryAmountFormat formatUSD = MonetaryFormats.getAmountFormat(Locale.US);
//        String usFormatted = formatUSD.format(oneDollar);
//
//        assertThat(oneDollar.toString()).isEqualTo("USD 1");
//        assertThat(formatUSD).isNotNull();
//        assertThat(usFormatted).isEqualTo("USD1.00");
//
//        writeMessage("usFormatted: {0}", usFormatted);
//        writeMonetaryAmount("oneDollar", oneDollar);
//    }
//
//    @Ignore
//    @Test
//    public void givenAmount_whenCustomFormat_thanEquals() {
//        writeBanner(getMethodName());
//
//        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory()
//                .setCurrency("USD").setNumber(1).create();
//
//        log.debug("oneDollar: {}", oneDollar.toString());
//        writeMonetaryAmount("oneDollar", oneDollar);
//
//        MonetaryAmountFormat customFormat = MonetaryFormats.getAmountFormat(AmountFormatQueryBuilder
//                .of(Locale.US).set(CurrencyStyle.NAME).set("pattern", "00000.00").build());
//
//        String customFormatted = customFormat.format(oneDollar);
//        log.debug("customFormatted: {}", customFormatted);
//
//        assertThat(customFormat).isNotNull();
//        assertThat(oneDollar.toString()).isEqualTo("USD 1");
//        assertThat(customFormatted).isEqualTo("00001.00 US Dollar");
//
//        // writeMessage("customFormatted: {0}", customFormatted);
//        // writeMonetaryAmount("oneDollar", oneDollar);
//    }
//
//    private static void writeCurrencyUnit(String variable, CurrencyUnit currencyUnit) {
//        writeln(fill("-", 50));
//        writeMessage("CurrencyUnit: variable: {0}", variable);
//        writeln(fill("-", 50));
//        writeMessage("  currencyUnit.currencyCode         : {0}", currencyUnit.getCurrencyCode());
//        writeMessage("  currencyUnit.context              : {0}",
//                stripEol(currencyUnit.getContext().toString()));
//        writeMessage("  currencyUnit.defaultFractionDigits: {0}",
//                currencyUnit.getDefaultFractionDigits());
//        writeMessage("  currencyUnit.numericCode          : {0}", currencyUnit.getNumericCode());
//        writeln();
//// writeln(fill("-", 50));
//    }
//
//    private static void writeMonetaryAmount(String variable, MonetaryAmount monetaryAmount) {
//        writeln(fill("-", 50));
//        writeMessage("MonetaryAmount: variable: {0}", variable);
//        writeln(fill("-", 50));
//        writeMessage("  monetaryAmount.context : {0}", stripEol(monetaryAmount.getContext()));
//        writeMessage("  monetaryAmount.currency: {0}", monetaryAmount.getCurrency());
//        writeMessage("  monetaryAmount.factory : {0}", monetaryAmount.getFactory());
//        writeMessage("  monetaryAmount.number  : {0}", monetaryAmount.getNumber());
//        writeln();
//// writeln(fill("-", 50));
//    }
//
//    private static void writeMonetaryAmounts(MonetaryAmount... monetaryAmounts) {
//        for (MonetaryAmount monetaryAmount : monetaryAmounts) {
//            writeMonetaryAmount("?", monetaryAmount);
//        }
//    }
//
//    private static void writeMoney(String variable, Money money) {
//        writeln(fill("-", 50));
//        writeMessage("Money: variable: {0}", variable);
//        writeln(fill("-", 50));
//        writeMessage("  money.context       : {0}", stripEol(money.getContext()));
//        writeMessage("  money.currency      : {0}", money.getCurrency());
//        writeMessage("  money.factory       : {0}", money.getFactory());
//        writeMessage("  money.number        : {0}", money.getNumber());
//        writeMessage("  money.numberStripped: {0}", money.getNumberStripped());
//        writeln();
//// writeln(fill("-", 50));
//    }
//
//    private static void writeFastMoney(String variable, FastMoney fastMoney) {
//        writeln(fill("-", 50));
//        writeMessage("FastMoney: variable: {0}", variable);
//        writeln(fill("-", 50));
//        writeMessage("  fastMoney.context       : {0}", stripEol(fastMoney.getContext()));
//        writeMessage("  fastMoney.currency      : {0}", fastMoney.getCurrency());
//        writeMessage("  fastMoney.factory       : {0}", fastMoney.getFactory());
//        writeMessage("  fastMoney.number        : {0}", fastMoney.getNumber());
//        writeMessage("  fastMoney.precision     : {0}", fastMoney.getPrecision());
//        writeMessage("  fastMoney.scale         : {0}", fastMoney.getScale());
//        writeln();
//// writeln(fill("-", 50));
//    }
//
//    private static String stripEol(String in) {
//        return in.replace("\n", "");
//    }
//
//    private static String stripEol(MonetaryContext in) {
//        return stripEol(in.toString());
//    }

}
