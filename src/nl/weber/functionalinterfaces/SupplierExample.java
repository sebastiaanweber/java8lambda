package nl.weber.functionalinterfaces;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Bas", 3, 3.9, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student: " + studentSupplier.get());

        System.out.println("Students: " + listSupplier.get());
    }
}
