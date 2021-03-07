package parallel_stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamEjemplo1 {

    /**
     * Cuando no usar parallel, cuando se hace unboxin o boxin no es recomendable usar parallel
     * ya que toma tiempo hacer esta operación.
     *
     * Tambien cuando hay objetos que pueden cambiar y se pueden accesar en ejecucion
     * parallel puede ocasionar que los resultados no sean correctos.
     *
     * */

    public static List<String> secuencialPrintStudentActivities(){
        long starTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//aca el stream de studiantes
                .map(Student::getActivities) //transformamo a strean de listas de string
                .flatMap(List::stream)//aca usamos el map para convertir a stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("Secuencial " + (endTime - starTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long starTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//aca el stream de studiantes
                .parallel()
                .map(Student::getActivities) //transformamos a stream de listas de string
                .flatMap(List::stream)//aca usamos el map para convertir a stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("paralelo " + (endTime - starTime));
        return studentActivities;
    }

    public static void main(String[] args) {

        System.out.println(secuencialPrintStudentActivities());
        System.out.println(parallelPrintStudentActivities());

    }

}
