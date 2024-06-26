package java_8_interview_programme;

import java_8_interview_programme.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentProgrammingQuestions {


    public static void main(String[] args) {

    //TODO Q1. find the students section wise

        List<Student> studentList = Arrays.asList(new Student("John", 22, "A"),
                new Student("Jane", 21, "B"),
                new Student("Bob", 23, "A"),
                new Student("Alice", 20, "C"),
                new Student("Raj", 21, "B"),
                new Student("Rohit", 21, "B"),
                new Student("Jane", 21, "C"));


        Map<String, List<Student>> studentsBySection = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSection, Collectors.toList()));
        for (Map.Entry<String, List<Student>> entry : studentsBySection.entrySet()) {
            String section = entry.getKey();
            List<Student> studentInSection = entry.getValue();
            System.out.println("Section " + section + ": ");
            for (Student student : studentInSection) {
                System.out.println(student.getName());
            }
        }
    // TODO Collectors.ToList that collects the values for each group into a list
    //  studentsBySection is a map where the keys are the section names,and values are list of students in that section
    //  Finally , we iterate over the entities in the studentBySection, printing the section name and the names of students in that section for each entry


        System.out.println(" ");
        System.out.println(studentsBySection);
        System.out.println(" ");
        for (String key : studentsBySection.keySet()) {
            System.out.println("Section wise students are: " + studentsBySection.get(key));

        }

    //TODO The method students.stream() returns a Stream of Students objects, which is then passed to the collect method.
    // The Collectors.groupingBy method takes a function that returns the section of each student, which is Student::getSection in this case.
    // Finally, the collect method collects all the students in the Stream into the Map, Grouping them by their section using the gropingBy method.
    // The resulting Map will have a String key representing the section, and a List of Student objects as the value,
    // representing all students in that section


        //TODO Q2. count total number of students with B Section

        long count = studentList.stream()
                .filter(s -> s.getSection().equals("B"))
                .count();

        System.out.println("Total number of students with B section are " + count);


    }
}
