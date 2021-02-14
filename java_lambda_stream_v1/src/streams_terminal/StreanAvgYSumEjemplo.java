package streams_terminal;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.stream.Collectors;

public class StreanAvgYSumEjemplo {

    public static int sum_ejemplo(){

        return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static Double avg_Ejemplo(){

        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {

        System.out.println(sum_ejemplo());

        System.out.println(avg_Ejemplo());
    }

}
