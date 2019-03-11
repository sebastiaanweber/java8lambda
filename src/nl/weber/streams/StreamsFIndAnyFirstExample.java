package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Optional;

public class StreamsFIndAnyFirstExample {


    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
        .filter(student -> student.getGpa() >= 3.9)
        .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }


    public static void main(String[] args) {

        Optional<Student> studentOptional = findAnyStudent();

        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }

        Optional<Student> studentOptional2 = findFirstStudent();

        if(studentOptional2.isPresent()) {
            System.out.println(studentOptional2.get());
        }
    }
}
