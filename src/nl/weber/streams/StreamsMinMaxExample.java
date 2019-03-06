package nl.weber.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream().reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream().reduce((x, y) -> x < y ? x : y);
    }


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> maxValue = findMaxValueOptional(integerList);
        System.out.println("Max: " + maxValue.get());

        Optional<Integer> minValue = findMinValueOptional(integerList);
        System.out.println("Min: " + minValue.get());
    }
}
