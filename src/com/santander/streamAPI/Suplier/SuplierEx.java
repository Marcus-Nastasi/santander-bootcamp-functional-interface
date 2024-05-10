package com.santander.streamAPI.Suplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierEx {

    public static void main(String[] args) {
        Supplier<String> wellcome = () -> "Hello, wellcome to the Suplier test!";

        List<String> wellcomeList = Stream.generate(wellcome).limit(5).collect(Collectors.toList());

        wellcomeList.forEach(w -> System.out.println(w));
    }
}
