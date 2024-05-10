package com.santander.streamAPI.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Function<Integer, Integer> duplicate = number -> number * 2;

        //List<Integer> duplicatedNumbers = integerList.stream().map(duplicate).toList();

        List<Integer> duplicatedNumbers = integerList.stream().map(n -> n * 2).toList();

        duplicatedNumbers.forEach(System.out::println);
    }
}

