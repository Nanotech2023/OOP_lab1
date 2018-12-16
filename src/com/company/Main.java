import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            List<Fraction> fractionList = new ArrayList<>();
            FractionList FractionList3 = new FractionList(fractionList);
            for (int i = 0; i < numbers.size(); i += 2) {
                FractionList3.addFraction(new Fraction(numbers.get(i), numbers.get(i + 1)));
            }
            System.out.println("Список дробей из файла");
            for (Fraction elem : FractionList3.list) {
                System.out.println(elem);
            }
            System.out.println("Максимальная дробь");
            System.out.println(FractionList3.maxFraction());
            System.out.println("Минимальная дробь");
            System.out.println(FractionList3.minFraction());
            System.out.println("Количество дробей, больших 5");
            System.out.println(FractionList3.countGreaterThan(new Fraction(5, 1)));
            System.out.println("Количество дробей, меньших 5");
            System.out.println(FractionList3.countLessThan(new Fraction(5, 1)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
        System.out.println("Список дробей");
        for (Fraction elem : listOfFractions2.list) {
            System.out.println(elem);
        }

        System.out.println("Максимальная дробь");
        System.out.println(listOfFractions2.maxFraction());
        System.out.println("Минимальная дробь");
        System.out.println(listOfFractions2.minFraction());
        System.out.println("Количество дробей, больших 3");
        System.out.println(listOfFractions2.countGreaterThan(new Fraction(3, 1)));
        System.out.println("Количество дробей, меньших 3");
        System.out.println(listOfFractions2.countLessThan(new Fraction(3, 1)));

        /* ---------------------------------------------------------------------------------------------------------- */

        FractionList listOfFractions3 = new FractionList(fractionList);
        listOfFractions3.addFraction(new Fraction(3, 4));
        listOfFractions3.addFraction(new Fraction(-2, 3));
        listOfFractions3.addFraction(new Fraction(4, 8));
        System.out.println("Список дробей");
        for (Fraction elem : listOfFractions3.list) {
            System.out.println(elem);
        }
        Polynomial polynomial2 = new Polynomial(listOfFractions2);
        Polynomial polynomial3 = new Polynomial(listOfFractions3);
        Polynomial polynomial4 = Polynomial.sum(polynomial3, polynomial2);
        System.out.println("Сумма полиномов");
        System.out.println(polynomial4);
    }
}
