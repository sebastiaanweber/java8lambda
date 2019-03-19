package nl.weber.optional;

import nl.data.Bike;
import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {


    // filter
    public static void optionalFilter() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.
                filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));
    }

    // map
    public static void optionalMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()) {
            Optional<String> name = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(name);
        }

    }

    // flatmap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println(s));
    }


    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
