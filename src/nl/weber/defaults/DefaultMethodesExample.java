package nl.weber.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodesExample {

    public static void main(String[] args) {
        /**
         * Sort the list names in alphabetic order
         */

        List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");

        /**
         * Prior Java 8
         */
//
//        Collections.sort(stringList);
//        System.out.println(stringList);

        /**
         * Java 8
         */

        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
    }
}
