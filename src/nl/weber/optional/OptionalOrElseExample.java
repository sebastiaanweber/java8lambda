package nl.weber.optional;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }


    private static Supplier<String> stringSupplier = new Supplier<String>() {
        public String get() {
            return "Supplier Deafult";
        }
    };

    //orElseGet
    public static String optionalOrElseGet() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(stringSupplier);
        return name;
    }


    //orElseThrow
    public static String orElseThrow() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data"));
        return name;
    }


    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(orElseThrow());

    }
}
