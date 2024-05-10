package com.santander.streamAPI.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("c", "c#", "java", "typescript", "javascript", "rust", "go");

        //Predicate<String> stringPredicate = w -> w.length() >= 5;

        System.out.println("higher or equals 5");
        langs.stream().filter(w -> w.length() >= 5).forEach(System.out::println);

        System.out.println("\nlower than 5");
        langs.stream().filter(w -> w.length() < 5).forEach(System.out::println);
    }
}


