package nl.weber.functionalinterfaces;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
    Predicate<Student> p3 = (s) -> s.getName().equals("Dave");

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>= 3 && gpa >= 3.9;


    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2.and(p3)).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    // use bipredicate
    Consumer<Student> studentConsumerBiPredicate = (student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });


    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumerBiPredicate); //studentConsumer or studentConsumerBiPredicate
    }

    public static void main(String[] args) {
        List<Student> studentsList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentsList);


    }
}
