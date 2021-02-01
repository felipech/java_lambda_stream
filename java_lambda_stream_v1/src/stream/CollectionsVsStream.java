package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsVsStream {

    static Predicate<Student> filtroPorGrado = (student) -> student.getGradeLevel() >= 3;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("nombre1");
        arrayList.add("nombre2");
        arrayList.add("nombre3");

        for (String name: arrayList) System.out.println("nombre: " + name);

        System.out.println("valores " + arrayList);
        arrayList.remove(0);

        System.out.println("valores despues del remove " + arrayList);

        Map<String, List<String>> mapaStudent = StudentDataBase.getAllStudents().stream()
                .peek((student -> System.out.println("sin filtro " + student.getName())))
                .filter(filtroPorGrado)
                .peek((student -> System.out.println("con filtro" + student.getName())))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));


    }

}
