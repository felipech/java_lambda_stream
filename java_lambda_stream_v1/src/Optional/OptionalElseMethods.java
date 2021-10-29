package Optional;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Optional;

public class OptionalElseMethods {

    public static String orElseMetodo(){

        Optional<Student> student = Optional.ofNullable(null);
        String name = student.map(Student::getName).orElse("defectp");
        return name;

    }
    public static String orElseGetMetodo(){

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = student.map(Student::getName).orElseGet(() -> "nombre defecto");
        return name;

    }

    public static String orElseThrowMetodo(){

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = student.map(Student::getName).orElseThrow(() -> new RuntimeException("No hay datos"));
        return name;

    }


    public static void main(String[] args) {
        System.out.println(orElseGetMetodo());
        System.out.println(orElseGetMetodo());
        System.out.println(orElseThrowMetodo());
    }
}
