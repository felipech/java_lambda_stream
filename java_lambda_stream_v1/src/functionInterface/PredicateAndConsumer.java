package functionInterface;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {


    //un predicate para cada 1, recibe un parametro
    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    //ahora con bipredicate
    BiPredicate<Integer, Double> biPredicate = (gradeLvl, gpa) -> gradeLvl >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> stringListBiConsumer = (name, activities) -> System.out.println("name " + name + " : " + activities);

    //para un predicado cada uno
    Consumer<Student> studentConsumer = (student -> {
        if (p1.and(p2).test(student)){
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    //ahora lo mismo pero usando bipredicate
    Consumer<Student> studentConsumer1 = (student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())){
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> students){

        students.forEach(studentConsumer);

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumer().printNameAndActivities(studentList);
    }
}
