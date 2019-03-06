package nl.weber.streams;

import nl.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
    }
}
