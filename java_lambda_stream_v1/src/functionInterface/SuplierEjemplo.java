package functionInterface;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuplierEjemplo {



    public static void main(String[] args) {
        Supplier<Student> testSuplier = ()-> {
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        //un solo estudiante
        System.out.println("Resultado: " + testSuplier.get());

        //lista completa
        System.out.println("Resultado: " + listSupplier.get());
    }

}
