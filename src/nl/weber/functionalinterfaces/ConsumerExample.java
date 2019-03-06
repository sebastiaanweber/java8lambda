package nl.weber.functionalinterfaces;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(c2);
    }

    public static void printNameAndActivities(){
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(c3.andThen(c4)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach((student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        }));
    }


    public static void main(String[] args) {

        /**
         * example
         */
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
