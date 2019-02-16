package pl.sda;

import java.math.BigDecimal;

public class FactorialRecursive implements Factorial {

    @Override
    public BigDecimal compute(int n) {
        BigDecimal result;

        validateN(n);

        if (n == 0 || n == 1) {
            result = new BigDecimal(1);
        } else {
            //Tworzenie zmiennej pomocniczej
            BigDecimal currentN = new BigDecimal(n);

            //rekurencja zakłada, że silnia dla n jest równa n * compute(n - 1)
            //mnożenie BigDecimali wymaga użycia metody multiply
            result = currentN.multiply(compute(n - 1));
        }

        return result;
    }

    private void validateN(int n) {
        if (n < 0) {
            throw new ArgumentLessThanZeroException("Argument must not be less than 0!");
        }
    }

}
