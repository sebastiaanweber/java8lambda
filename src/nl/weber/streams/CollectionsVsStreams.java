package nl.weber.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        names.remove(0);

        System.out.println(names);

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

    }
}
