public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    Fraction(Integer m, Integer n) {
        this.numerator = m / Utils.GCD(m, n);
        this.denominator = n / Utils.GCD(m, n);
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    Fraction addFraction(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator + fraction.numerator * denominator,
                denominator * fraction.denominator);
    }

    @Override
    public String toString() {
        if (denominator == numerator) {
            return "1";
        } else if (denominator == 1) {
            return String.valueOf(numerator);
        } else if (numerator == 0) {
            return "0";
        }
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public int compareTo(Fraction o) {
        return numerator * o.denominator - o.numerator * denominator;
    }
}
