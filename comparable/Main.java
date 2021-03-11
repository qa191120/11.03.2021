package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, 1.87f, "Dana"));
        people.add(new Person(2, 1.55f, "Nira"));
        people.add(new Person(1, 1.92f, "Moshe"));
        people.add(new Person(4, 1.90f, "Ranny"));

        System.out.println("======== before sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        Collections.sort(people);

        System.out.println("======== after sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        /*
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
         */


    }

}
