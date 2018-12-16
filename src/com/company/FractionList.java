import java.util.*;

public class FractionList {
    List<Fraction> list;
    private Fraction cachedMin, cachedMax;

    FractionList(List<Fraction> list) {
        this.list = list;
    }

    void addFraction(Fraction fraction) {
        list.add(fraction);
        if (cachedMax != null) {
            if (fraction.compareTo(cachedMax) > 0) {
                cachedMax = fraction;
            }
        }
        if (cachedMin != null) {
            if (fraction.compareTo(cachedMin) < 0) {
                cachedMin = fraction;
            }
        }
    }

    Fraction minFraction() {
        if (cachedMin == null) {
            cachedMin = Collections.min(list);
        }
        return cachedMin;
    }

    Fraction maxFraction() {
        if (cachedMax == null) {
            cachedMax = Collections.max(list);
        }
        return cachedMax;
    }

    int countGreaterThan(Fraction fraction) {
        int count = 0;
        for (Fraction aList : list) {
            if (aList.compareTo(fraction) > 0) {
                count++;
            }
        }
        return count;
    }

    int countLessThan(Fraction fraction) {
        int count = 0;
        for (Fraction aList : list) {
            if (aList.compareTo(fraction) < 0) {
                count++;
            }
        }
        return count;
    }
}