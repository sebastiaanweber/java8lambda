package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {

        return StudentDataBase
                .getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc() {

        return StudentDataBase
                .getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Student sorted by name");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Student sorted by Gpa");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }

}
