package nl.weber.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    public static void main(String[] args) {

        int value = 4;

        Consumer<Integer> c2 = (i) -> {
//            value++; // not allowed
            System.out.println(value + i);
        };

//        value = 6;// also not allowed

        c2.accept(4);

    }
}
