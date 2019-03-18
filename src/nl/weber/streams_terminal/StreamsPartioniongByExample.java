package nl.weber.streams_terminal;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartioniongByExample {

    public static void partioningBy_1() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> partioningMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(partioningMap);
    }

    public static void partioningBy_2() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partioningMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));
        System.out.println(partioningMap);
    }



    public static void main(String[] args) {
//        partioningBy_1();
        partioningBy_2();
    }
}
