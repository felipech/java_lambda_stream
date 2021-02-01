package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapEjemplo {

    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)//este map convierte el tipo del stream no es como el mapa que ocupamos normalmente
                .map(String::toUpperCase)//aca el stream de string le aplicamos el metodo uppercase y finalmente se usa collect para agregar todo a una lista
                .collect(Collectors.toList());
    }

    public static Set<String> nameSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)//este map convierte el tipo del stream no es como el mapa que ocupamos normalmente
                .map(String::toUpperCase)//aca el stream de string le aplicamos el metodo uppercase y finalmente se usa collect para agregar todo a una lista
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        System.out.println(nameList());
        System.out.println(nameSet());

    }
}
