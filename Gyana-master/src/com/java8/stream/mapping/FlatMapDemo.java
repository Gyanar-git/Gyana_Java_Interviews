package com.java8.stream.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a","b","c"));
        list.add(Arrays.asList("d","e","f"));
        list.add(Arrays.asList("g","h","i"));
        list.add(Arrays.asList("j","k","l"));
        //Created a stream from the list.
        Stream<List<String>> stream1 = list.stream();
        //stream1.forEach(System.out::println);
        // Flattened the stream.
        Stream<String> stream2 = stream1.flatMap(s -> s.stream());
        //Applied filter on flattened stream.
        Stream<String> stream3 = stream2.filter(x -> "a".equals(x));

        stream3.forEach(System.out::println);

        list.stream()
                .flatMap(s -> s.stream())
                .filter(x -> "a".equals(x))
                .forEach(System.out::println);
    }
}
