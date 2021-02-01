package stream;

import Datos.Student;
import Datos.StudentDataBase;

public class StreamMapReduceEjemplo {

    private static int nroDeNotebooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, (a,b) -> a+b);
    }
    private static int nroDeNotebooksReferencia(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    private static int nroDeNotebooksConFilter(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student) -> student.getGradeLevel() > 3)
                .filter((student) -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }


    public static void main(String[] args) {

        System.out.println("Nro total " + nroDeNotebooks());
        System.out.println("Nro total con referencia " + nroDeNotebooksReferencia());
        System.out.println("Nro con filtro " + nroDeNotebooksConFilter());
    }
}
