package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorEjemplo {


    //como modificar la forma en que se ordena la lista
    public static List<Student> estudiantesOrdenadosPorNombre(){
        List<Student> listaOrdenada = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        return listaOrdenada;
    }

    //como modificar la forma en que se ordena la lista
    public static List<Student> estudiantesOrdenadosPorGrade(){
        List<Student> listaOrdenada = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel))
                .collect(Collectors.toList());

        return listaOrdenada;
    }

    public static void main(String[] args) {

        System.out.println("Lista ordenada por nombre: ");
        estudiantesOrdenadosPorNombre().forEach(System.out::println);
        System.out.println("Lista ordenada por Grade: ");
        estudiantesOrdenadosPorGrade().forEach(System.out::println);



    }
}
