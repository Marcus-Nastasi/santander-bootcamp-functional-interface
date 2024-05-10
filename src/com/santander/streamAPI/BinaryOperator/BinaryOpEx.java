package com.santander.streamAPI.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOpEx {

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(1.99, 2.35, 3.40, 4.0, 5.75);

        //BinaryOperator<Double> sumList = (n1, n2) -> n1 + n2;

        double res = doubleList.stream().reduce(0.0, Double::sum); // identity equals accumulator.

        System.out.printf("%.2f", res);
    }
}


