package nl.weber.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;

        Consumer<Integer> c1 = (i1) -> { // i not allowed scope
//            int i = 2 // i not allowed scope
            System.out.println(i);
        };
    }
}
