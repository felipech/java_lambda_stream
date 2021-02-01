package functionInterface;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionEjemplo {

    //pruebas con BiFunction
    //recibe la lista de estudiantes y el predicado definido en la clase predcateaandconsumer y da como resultado un map con el nombre y gpa de los estudiantes
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String,Double> mapStudent = new HashMap<>();

        students.forEach(student -> {
            if (studentPredicate.test(student)){
                mapStudent.put(student.getName(),student.getGpa());
            }
        });

        return mapStudent;
    };

    public static void main(String[] args) {
        System.out.println("Resultado: ");
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateAndConsumer.p1));
    }
}
