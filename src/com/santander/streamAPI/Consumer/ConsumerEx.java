package com.santander.streamAPI.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<Integer> impressEven = n -> {
          if (n % 2 == 0) System.out.println(n);
        };

        integerList.forEach(impressEven);
    }
}

