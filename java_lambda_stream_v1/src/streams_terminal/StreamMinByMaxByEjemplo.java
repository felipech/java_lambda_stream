package streams_terminal;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinByMaxByEjemplo {

    public static Optional<Student> minBy_Ejemplo(){

        return StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

    }

    public static Optional<Student> maxBy_Ejemplo(){

        return StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

    }

    public static void main(String[] args) {

        System.out.println(minBy_Ejemplo());

        System.out.println(maxBy_Ejemplo());
    }
}
