package nl.weber.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }

    public static Optional<String> of() {
        Optional<String> stringOptional = Optional.of("Hello");
        return stringOptional;
    }

    public static Optional<String> empty() {
        return Optional.empty();
    }


    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of());
        System.out.println(empty());
    }
}
