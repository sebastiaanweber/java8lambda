package nl.weber.optional;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();
        student = null;
        if (student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName); // return Optional<String>
        }
        return Optional.empty(); // Optional object with no value
    }


    public static void main(String[] args) {
//        String name = getStudentName();
//        if (name != null)
//            System.out.println("Name length " + name.length());

        Optional<String> stringOptional = getStudentNameOptional();

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get().length());
        } else {
            System.out.println("Name not found");
        }


    }
}
