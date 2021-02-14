package streams_terminal;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMappingEjemplo {



    public static void main(String[] args) {
        List<String> listaUsandoMapping =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(listaUsandoMapping);

        Set<String> setUsandoMapping =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.println(setUsandoMapping);

    }
}
