package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamEjemplo {

    public static List<Student> studentList (){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student)-> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        studentList().forEach(System.out::println);
    }
}
