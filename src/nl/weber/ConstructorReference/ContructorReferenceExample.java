package nl.weber.ConstructorReference;

import nl.data.Student;

import javax.rmi.CORBA.Stub;
import java.util.function.Function;
import java.util.function.Supplier;

public class ContructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {

        System.out.println(studentSupplier.get());

        System.out.println(studentFunction.apply("Bas"));



    }

}
