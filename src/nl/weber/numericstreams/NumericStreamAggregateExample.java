package nl.weber.numericstreams;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        OptionalInt min = IntStream.rangeClosed(1,50).min();
        OptionalDouble avg = IntStream.rangeClosed(1,50).average();
        System.out.println(sum);
        System.out.println(max.getAsInt());
        System.out.println(avg.getAsDouble());
    }
}
