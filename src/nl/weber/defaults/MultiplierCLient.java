package nl.weber.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierCLient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1, 3, 5);

        System.out.println(multiplier.multiply(integerList));
        System.out.println(multiplier.size(integerList));
        System.out.println(Multiplier.isEmpty(integerList));

    }
}
