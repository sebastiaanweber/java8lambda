package nl.weber.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers, int noLimit) {
        return integers.stream().limit(noLimit).reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream().skip(3).reduce((x, y) -> x + y);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(limit(integers, 2).get());

        System.out.println(skip(integers).get());
    }
}
