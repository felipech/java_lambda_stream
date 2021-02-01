package stream;

import Datos.Student;
import Datos.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStreamEjemplo {


    public static int calculaMultiplicacionConReduce(List<Integer> listaNros){

        return listaNros.stream()//el primer valor "identity" es el valor inicial que se usa para realizar la operacion
                //despues el b es el valor de la lista que se pasa en la "listaNros"
                //primera iteracion a = 1, b = 1 -> 1*1
                //segunda iteracion a = 1, b = 3 -> 1*3
                //tercera iteracion a = 3, b = 5 -> 3*5
                //cuarta iteracion  a = 15, b = 7 -> 15*7 ----> 105 y este es el valor que se retorna
                .reduce(1, (a,b) -> a*b );
    }

    public static int calculaSumaConReduce(List<Integer> listaNros){

        return listaNros.stream()//el primer valor "identity" es el valor inicial que se usa para realizar la operacion
                //despues el b es el valor de la lista que se pasa en la "listaNros"
                //primera iteracion a = 1, b = 1 -> 1*1
                //segunda iteracion a = 1, b = 3 -> 1*3
                //tercera iteracion a = 3, b = 5 -> 3*5
                //cuarta iteracion  a = 15, b = 7 -> 15*7 ----> 105 y este es el valor que se retorna
                .reduce(0, (a,b) -> a+b );
    }

    public static Optional<Student> optionalStudent(){

        return StudentDataBase.getAllStudents().stream()
                .reduce((val1 , val2 ) -> {
                    if(val1.getGpa() > val2.getGpa()){
                        return val1;
                    }else {
                        return val2;
                    }
                } );
    }

    public static void main(String[] args) {

        List<Integer> listaNros = Arrays.asList(1,3,5,7);

        System.out.println("Multi " + calculaMultiplicacionConReduce(listaNros));

        System.out.println("Suma " + calculaSumaConReduce(listaNros));

        if(optionalStudent().isPresent()){
            System.out.println("optional Return " + optionalStudent().get());
        }



    }
}
