package nl.weber.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("Deafult");

    public static void main(String[] args) {
        System.out.println("Result = " + function.apply("testers"));
        System.out.println("Result and then = " + function.andThen(addSomeString).apply("testers"));
        System.out.println("Result compose = " + function.compose(addSomeString).apply("testers"));

    }
}
