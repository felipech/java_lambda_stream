package functionInterface;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

//se hacen pruebas ahora de function interface con los datos de la clase student
public class FuncionStudent {

    // va a recibir una lista de estudiantes y va a retornar un map con el nombre y el grado(notas promedios) de cada estudiante en la lista
    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {

        Map<String, Double> studentGradMap = new HashMap<>();
        students.forEach(student -> {
            //se puede filtrar usando funciones predicados, usamos el metodo que hay en la clase PredicateAndConsumer
            if(PredicateAndConsumer.p1.test(student)){
                studentGradMap.put(student.getName(),student.getGpa());
            }

        });
        return studentGradMap;
    });

    public static void main(String[] args) {
        System.out.println("Resultado: ");
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }

}
