package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main (String [] args){
        /*
         * imperativa
         *
         */
        int sum = 0;

        for(int i = 0; i < 101; i++){
            sum+=i;
        }
        System.out.println("suma usando imperative aproch " + sum);

        /*
        * Declarativa
        * */

        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();

        System.out.println("suma declarativa " + sum1);

        /*
        * ej 2
        * */

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //sacar los duplicados
        //impertativa

        List<Integer> listaUnica = new ArrayList<>();

        for(Integer in: integerList){
            if(!listaUnica.contains(in)){
                listaUnica.add(in);
            }

        }
        System.out.println("Lista unica sin duplicados " + listaUnica);

        //declarativa

        List<Integer> listaUnica1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista unica sin duplicados declarativa " + listaUnica1);

    }
}
