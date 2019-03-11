package nl.weber.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
//        System.out.println(intStream.count());
        intStream.forEach(value -> System.out.println(value+","));

        IntStream.rangeClosed(1,50).forEach(value -> System.out.println(value + ","));

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.println(value));
    }


}
