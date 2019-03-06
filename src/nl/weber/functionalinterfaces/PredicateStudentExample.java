package nl.weber.functionalinterfaces;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample<psvm> {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.and(p2).negate().test(student)) { // or , and, negate
                System.out.println(student);
            }
        }));


    }

    public static void main(String[] args) {
//        filterStudentByGradeLevel();
//        filterStudentByGpa();
        filterStudents();
    }

}
