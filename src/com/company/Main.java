import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(3, 8);
        Fraction fraction3 = new Fraction(1, 2);
        List<Fraction> fractionList = new ArrayList<>();
        FractionList listOfFractions2 = new FractionList(fractionList);
        listOfFractions2.addFraction(fraction3);
        listOfFractions2.addFraction(fraction);
        listOfFractions2.addFraction(new Fraction(-1, 3));
        listOfFractions2.addFraction(new Fraction(1, 4));
        listOfFractions2.addFraction(new Fraction(4, 2));
        listOfFractions2.addFraction(new Fraction(-13, 3));
        listOfFractions2.addFraction(new Fraction(8, 1));
        System.out.println(listOfFractions2.maxFraction());
        System.out.println(listOfFractions2.minFraction());
        System.out.println(listOfFractions2.countGreaterThan(new Fraction(3, 1)));
        System.out.println(listOfFractions2.countLessThan(new Fraction(3, 1)));
        for (Fraction elem : listOfFractions2.list) {
            System.out.println(elem);
        }

        /* ---------------------------------------------------------------------------------------------------------- */

        FractionList listOfFractions3 = new FractionList(fractionList);
        listOfFractions3.addFraction(new Fraction(3, 4));
        listOfFractions3.addFraction(new Fraction(-2, 3));
        listOfFractions3.addFraction(new Fraction(4, 8));
        for (Fraction elem : listOfFractions3.list) {
            System.out.println(elem);
        }
        Polynomial polynomial2 = new Polynomial(listOfFractions2);
        Polynomial polynomial3 = new Polynomial(listOfFractions3);
        Polynomial polynomial4 = Polynomial.sum(polynomial3, polynomial2);
        System.out.println(polynomial4);
    }
}
