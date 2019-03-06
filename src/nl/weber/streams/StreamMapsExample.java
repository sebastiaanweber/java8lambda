package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapsExample {

    static List<String> namesList() {
        List<String> studentList = StudentDataBase
                .getAllStudents()
                .stream()
                // student as an input -> output student name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return studentList;
    }

    static Set<String> namesSet() {
        Set<String> studentListSet = StudentDataBase
                .getAllStudents()
                .stream()
                // student as an input -> output student name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        return studentListSet;
    }

    public static void main(String[] args) {
        System.out.println(namesSet());
    }
}
