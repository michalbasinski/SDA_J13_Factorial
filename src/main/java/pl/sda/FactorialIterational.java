package pl.sda;

import java.math.BigDecimal;

public class FactorialIterational implements Factorial {

    @Override
    public BigDecimal compute(int n) {
        validateN(n);

        BigDecimal result = new BigDecimal(1);

        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }

        return result;
    }

    private void validateN(int n) {
        // metoda wyrzuca wyjątek, jeśli próbujemy wywołać obliczanie silnii dla argumentu mniejszego
        // niż 0
        if (n < 0) {
            throw new ArgumentLessThanZeroException("Argument must not be less than 0!");
        }
    }

}
