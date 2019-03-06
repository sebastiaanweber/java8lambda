package nl.weber.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

//    static Function<String, String> toUpperCaseLamda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperCaseLamda = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLamda.apply("Lambda"));
    }
}
