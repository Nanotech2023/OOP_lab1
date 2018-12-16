import java.util.List;

public class Polynomial {
    private List<Fraction> coefficients;

    Polynomial(FractionList fractionList) {
        coefficients = fractionList.list;
    }

    static Polynomial sum(Polynomial polynomial1, Polynomial polynomial2) {
        Polynomial result = null;
        if (polynomial1.coefficients.size() > polynomial2.coefficients.size()) {
            result = polynomial1;
        } else {
            result = polynomial2;
        }
        for (int i = 0; i < Math.min(polynomial1.coefficients.size(), polynomial2.coefficients.size()); i++) {
            result.coefficients.set(i, polynomial1.coefficients.get(i).addFraction(polynomial2.coefficients.get(i)));
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder polynomial = new StringBuilder();
        for (int i = coefficients.size() - 1; i > 0; i--) {
            Fraction fraction = coefficients.get(i);
            if (!fraction.toString().equals("1") && !fraction.toString().equals("0")) {
                polynomial.append(new Fraction(Math.abs(fraction.getNumerator()), Math.abs(fraction.getDenominator())));
            }
            if (!fraction.toString().equals("0")) {
                polynomial.append("x^").append(i);
            }
            if (coefficients.get(i).compareTo(new Fraction(0, 1)) > 0) {
                polynomial.append(" + ");
            } else {
                polynomial.append(" - ");
            }
        }
        polynomial.append(coefficients.get(0));
        return String.format("Polynomial{%s}", polynomial);
    }
}
