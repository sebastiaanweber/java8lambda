package nl.weber.streams;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    private static int noOfNotebooks() {
        int noOfNoteBooks = StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel() >= 3))
                .map(Student::getNoteBooks)
//                .reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
        return noOfNoteBooks;
    }


    private static Optional<Integer> noOfNotebooksOptional() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel() >= 3))
                .map(Student::getNoteBooks).reduce(Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
        System.out.println(noOfNotebooksOptional().get());
    }
}
