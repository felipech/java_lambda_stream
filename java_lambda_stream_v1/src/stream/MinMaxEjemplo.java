package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxEjemplo {

    public static Integer findMaxValueNotOptional(List<Integer> lista){
        //siempre se tiene que validar que la lista no esta vacia
        return lista.stream()
                .reduce(0,(val1,val2) -> val1 > val2 ? val1 : val2);
    }

    public static Optional<Integer> findMaxValue(List<Integer> lista){
        //siempre se tiene que validar que la lista no esta vacia
        return lista.stream()
                .reduce((val1,val2) -> val1 > val2 ? val1 : val2);
    }

    public static Optional<Integer> findMinValue(List<Integer> lista){
        //siempre se tiene que validar que la lista no esta vacia
        return lista.stream()
                .reduce((val1,val2) -> val1 < val2 ? val1 : val2);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,35,63,34,2,4,5,776,7);

        if(findMaxValue(integerList).isPresent()){
            System.out.println("El maximo es: " + findMaxValue(integerList).get());
        }else{
            System.out.println("La lista esta vacia ");
        }

        if(findMinValue(integerList).isPresent()){
            System.out.println("El minimo es: " + findMinValue(integerList).get());
        }else {
            System.out.println("La lista esta vacia");
        }

    }
}
