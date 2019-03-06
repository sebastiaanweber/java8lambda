package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> {
                    if(s1.getGpa() > s2.getGpa()) {
                        return s1;
                    } else {
                        return s2;
                    }
                });
    }

    public static Optional<Student> getHighestGPAStudentClean() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a, b) -> a * b);
    }


    public static Optional<Integer> performMultiplicationWithout(List<Integer> integerList) {
        return integerList.stream().reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integers));
        System.out.println(performMultiplicationWithout(integers).get());


        Optional<Student> student = getHighestGPAStudentClean();
        System.out.println(student);
    }


}
