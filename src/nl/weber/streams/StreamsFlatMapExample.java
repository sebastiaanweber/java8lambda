package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // stream of string
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }


    public static Long getStudentActivitiesCount() {

        Long noOfStudentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return noOfStudentActivities;
    }

    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());

    }
}
