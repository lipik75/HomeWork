package Countys;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {
    public int compare(Country c1, Country c2) {
        if (c1.getArea() > c2.getArea()) {
            return 1;
        }
        if (c1.getArea() < c2.getArea()) {
            return 2;
        }
        else
            return 0;
    }
}

