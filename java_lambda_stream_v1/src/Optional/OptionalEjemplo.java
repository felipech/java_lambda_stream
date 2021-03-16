package Optional;

import Datos.Student;
import Datos.StudentDataBase;
import java.util.Optional;

public class OptionalEjemplo {

    public static Optional<String> getStudentNameOptional(){

        Optional<Student>  studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();

    }

    public static void main(String[] args) {

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());

        }else {
            System.out.println("No se encontro el nombre del studiante");
        }


    }
}
