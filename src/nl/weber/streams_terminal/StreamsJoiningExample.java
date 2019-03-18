package nl.weber.streams_terminal;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // return Stream<String>
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // return Stream<String>
                .collect(Collectors.joining(";"));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // return Stream<String>
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }
}
