package nl.weber.parallelstream;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExmaple1 {

    public static List<String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // stream of string
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        return studentActivities;

    }

    public static List<String> parallelPrintStudentActivities() {

        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream) // stream of string
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        return studentActivities;
    }


    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();


    }

}
