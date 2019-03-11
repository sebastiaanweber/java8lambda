package nl.weber.numericstreams;

import com.sun.xml.internal.ws.handler.ServerSOAPHandlerTube;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {


    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10)
                // int
                .boxed()
                // Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integers) {
        // wrapper to primitive
        return integers.stream()
                .mapToInt(Integer::intValue) // gives intstream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());
        List<Integer> integerList = boxing();
        System.out.println(unBoxing(integerList));
    }
}
