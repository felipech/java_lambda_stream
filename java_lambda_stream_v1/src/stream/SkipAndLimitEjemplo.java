package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SkipAndLimitEjemplo {

    public static Optional<Integer> sumaConLimite(List<Integer> listaNumeros){

        return listaNumeros.stream()
                .limit(3)//limita el nro del stream
                .reduce((a,b) -> a+b);
    }

    public static Optional<Integer> skipEjemplo(List<Integer> listaNumeros){

        return listaNumeros.stream()
                .skip(3)//salta los primeros elementos indicados
                .reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {
        List<Integer> listaInteger = Arrays.asList(12,5,1,5,8,7);

        if(sumaConLimite(listaInteger).isPresent()){
            System.out.println("Suma con limite : " + sumaConLimite(listaInteger).get());
        }else{
            System.out.println("Error la lista esta vacia");
        }

        if(skipEjemplo(listaInteger).isPresent()){
            System.out.println("Suma con skip : " + skipEjemplo(listaInteger).get());
        }else{
            System.out.println("Error la lista esta vacia");
        }

    }
}
