package oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsMain {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        Set<Double> uniqueNumbers = new HashSet<>();
        numbers.add(11.0);
        numbers.add(11.5);
        numbers.add(10.4);
        numbers.add(5.6);
        numbers.add(4.0);
        numbers.add(4.0);
//        System.out.println(numbers);

        uniqueNumbers.add(1.1);
        uniqueNumbers.add(1.2);
        uniqueNumbers.add(1.3);
        uniqueNumbers.add(1.4);
        uniqueNumbers.add(1.5);
        uniqueNumbers.add(1.0);
        uniqueNumbers.add(1.0);

//        System.out.println(uniqueNumbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Double number: uniqueNumbers) {
            System.out.println(number);
        }

        System.out.println(uniqueNumbers.contains(1.1));
        System.out.println(uniqueNumbers.contains(1.9));


    }
}
