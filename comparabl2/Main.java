package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, 1.87f, "Dana", new Date(2000, 1 , 3)));
        people.add(new Person(2, 1.55f, "Nira"));
        people.add(new Person(1, 1.92f, "Moshe"));
        people.add(new Person(4, 1.90f, "Ranny"));

        System.out.println("======== before sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        Collections.sort(people); // tries to sort by Comparable

        // sort by comparator -- height
        Collections.sort(people, new PersonCompareByHeight());

        System.out.println("======== after sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        // targil 1:
        // 1. sort by height
        // 2. *etgar: sort by id (add identical id) , if id the same
        //                    additional sort by height
        // 3. *etgar: sort by name

        // targil 2:
        // 1. create PersonCompareById
        // 2. create PersonCompareByName
        // 3. create PersonCompareByBirthDate
        // 4. change the default (Comparable) to Birthday ...
        // sort by each one and print the sorted list
        // *etgar: fix deprecated date?

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(30);
        numbers.add(-12);
        Collections.sort(numbers);

        for (int index = 0; index < numbers.size(); index++)
        {
            System.out.println(numbers.get(index));
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("CC");
        names.add("ZZ");
        names.add("dd");
        names.add("AA");
        Collections.sort(names);

        //int x = 5; // value type behavior
        //Person p = new ... "danny"; // reference type behavior
        //p = p + 1;
        //String s = "i am a string";
        //s = s + "a";

        for (int index = 0; index < names.size(); index++)
        {
            System.out.println(names.get(index));
        }
    }

}
