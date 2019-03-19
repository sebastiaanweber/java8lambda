package nl.weber.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        // isPresent
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent() ? optional.get() : "hi");

        // ifPresent
        optional.ifPresent(s -> System.out.println(s));

    }
}
