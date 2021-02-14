package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Optional;

public class FindFirstAndFindAnyEjemplo {

    public static Optional<Student> findAnyEjemplo(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstEjemplo(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 5)
                .findFirst();
    }
    public static void main(String[] args) {

        Optional<Student> studentOptional = findAnyEjemplo();
        if(studentOptional.isPresent()){
            System.out.println("estudiante cualquiera: " + studentOptional.get());
        }else{
            System.out.println("no se encontro nada");
        }

        Optional<Student> findFirstStudent = findFirstEjemplo();

        if(findFirstStudent.isPresent()){
            System.out.println("El primer estudiante con gpa mayor a 3.9 es: " + findFirstStudent.get());
        }else{
            System.out.println("No se encontro ningun estudiante");
        }
    }

}
