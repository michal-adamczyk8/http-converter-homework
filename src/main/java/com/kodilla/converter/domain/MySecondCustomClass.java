package com.kodilla.converter.domain;

import java.util.stream.Stream;

public class MySecondCustomClass {

    private String[] values;

    public MySecondCustomClass(String[] values) {
        this.values = values;
    }

    public void printValues() {
        System.out.println("!!!!!!!!!!");
        Stream.of(values).forEach(System.out::println);
    }

    public String[] getValues() {
        return values;
    }
}
