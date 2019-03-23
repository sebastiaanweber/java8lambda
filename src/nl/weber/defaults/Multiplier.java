package nl.weber.defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integers) {
        return integers.size();
    }

    static boolean isEmpty(List<Integer> integers) {
        return integers != null && integers.size() > 0;
    }

}
