package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FactorialIterationalTest {

    @Test
    public void shouldReturn6ForNEqual3() {
        //given
        Factorial factorial = new FactorialIterational();
        final int n = 3;
        final BigDecimal expectedResult = new BigDecimal(6);

        //when
        BigDecimal result = factorial.compute(n);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn120ForNEqual5() {
        //given
        Factorial factorial = new FactorialIterational();
        final int n = 5;
        final BigDecimal expectedResult = new BigDecimal(120);

        //when
        BigDecimal result = factorial.compute(n);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldThrowExceptionWhenNLessThan0() {
        //given
        Factorial factorial = new FactorialIterational();
        final int n = -3;

        //when
        try {
            factorial.compute(n);
            Assert.fail("Exception was not thrown!");
        } catch (ArgumentLessThanZeroException e) {
            e.printStackTrace();
        }

        //then
    }

    // expected w adnotacji @Test oznacza, że test ma zakończyć się powodzeniem
    // jeśli z dowolnego miejsca zostanie wyrzucony wyjątek
    @Test(expected = ArgumentLessThanZeroException.class)
    public void shouldThrowExceptionWhenNEqualsMinus5() {

        //given
        Factorial factorial = new FactorialIterational();
        final int n = -5;

        //when
        factorial.compute(n);
    }
}