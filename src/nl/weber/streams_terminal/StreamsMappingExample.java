package nl.weber.streams_terminal;

import nl.data.Student;
import nl.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors
                        .mapping(Student::getName, Collectors.toList()));

        System.out.println(nameList);


        Set<String> nameListSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors
                        .mapping(Student::getName, Collectors.toSet()));

        System.out.println(nameListSet);
    }
}
