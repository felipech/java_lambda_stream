package stream;


import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEjemplo {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//aca el stream de studiantes
                .map(Student::getActivities) //transformamo a strean de listas de string
                .flatMap(List::stream)//aca usamos el map para convertir a stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long contadorActividadesPorEstudiante(){

        long nroActividades = StudentDataBase.getAllStudents().stream()//aca el stream de studiantes
                .map(Student::getActivities) //transformamo a strean de listas de string
                .flatMap(List::stream)//aca usamos el map para convertir a stream<String>
                .distinct()
                .count();

        return nroActividades;
    }


    public static void main(String[] args) {
        System.out.println(printStudentActivities());

        System.out.println(contadorActividadesPorEstudiante());
    }
}
