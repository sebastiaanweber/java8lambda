package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        //student name and there activities in a map

        Predicate<Student> studentPredicateGrade = (s) -> s.getGradeLevel() >= 3;
        Predicate<Student> studentPredicateGpa = (s) -> s.getGradeLevel() >= 3.9;

        Map<String, List<String>> stringListMap = StudentDataBase
                .getAllStudents()
                .stream()
                .filter(studentPredicateGrade)
                .peek((student -> {
                    System.out.println(student.getName());
                }))
                .filter(studentPredicateGpa)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(stringListMap);






    }
}
