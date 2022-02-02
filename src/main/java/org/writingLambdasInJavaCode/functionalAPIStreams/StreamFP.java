package org.writingLambdasInJavaCode.functionalAPIStreams;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamFP {
    public static void main(String[] args) {
        /**
         * The main() method first creates a stream of pseudorandom integers starting at 0 and ending at 10.
         * The stream is limited to exactly 10 integers. The filter() first-class function receives a lambda
         * as its predicate argument. The predicate removes odd integers from the stream. Finally, the
         * forEach() first-class function prints each even integer to the standard output via
         * the System.out::println method reference.
         * */
        new Random()
                .ints(0, 11)
                .limit(10)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        /**
         * The main() method next creates an integer stream that produces a sequential range of integers starting
         * at 0 and ending at 10. The mapToObj() first-class function receives a lambda that maps an integer
         * to the equivalent string at the integer index in the cities array. The city name is then sent
         * to the standard output via the forEach() first-class function and its System.out::println method reference.
         * */
        String[] cities = {
                "New York",
                "London",
                "Paris",
                "Berlin",
                "BrasÌlia",
                "Tokyo",
                "Beijing",
                "Jerusalem",
                "Cairo",
                "Riyadh",
                "Moscow"
        };
        IntStream
                .range(0, 11)
                .mapToObj(i -> cities[i])
                .forEach(System.out::println);
/**
 * Lastly, main() demonstrates the reduce() first-class function. An integer stream that produces the same range
 * of integers as in the previous example is reduced to a sum of their values, which is subsequently output.
 * */
        System.out.println(IntStream.range(0, 10).reduce(0, (x, y) -> x + y));
        System.out.println(IntStream.range(0, 10).reduce(0, Integer::sum));
    }

    /**
     * Each of limit(), filter(), range(), and mapToObj() are intermediate operations,
     * whereas forEach() and reduce() are terminal operations.
     * */
}
