package com.example;

import java.util.Comparator;

public class PersonCompareByHeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getM_height().compareTo(o2.getM_height());
    }
}
