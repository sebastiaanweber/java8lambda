package nl.weber.defaults;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultsMethodsExample2 {

    private static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    private static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGpa);
    private static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);


    private static void sortByName(List<Student> studentList) {
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    private static void sortByGpa(List<Student> studentList) {
        studentList.sort(gradeComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {
        System.out.println("Chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
//        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//        sortByGpa(studentList);

//        comparatorChaining(studentList);

        sortWithNullValues(studentList);
    }

}
