package streams_terminal;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByEjemplo {

    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }
    public static void customGroupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "Average"));

        System.out.println(studentMap);
    }

    public static void twoGroupStudentByGender(){
        Map<Integer,Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "Average")));

        System.out.println(studentMap);
    }

    public static void twoGroupStudentByGender_2(){
        Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }


    public static void main(String[] args) {
        groupStudentByGender();

        customGroupStudentByGender();

        twoGroupStudentByGender();

        twoGroupStudentByGender_2();
    }
}
