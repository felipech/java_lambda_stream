package ConstructorReferenceEjemplo;

import Datos.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceEjem {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {

        System.out.println("Resultado: " + studentSupplier.get());

        System.out.println("Resultado: " + studentFunction.apply("Felipe"));
    }

}
