package streams_terminal;

import Datos.StudentDataBase;

import java.util.stream.Collectors;

public class StreamCountingEjemplo {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
        .collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println(count());
    }
}
