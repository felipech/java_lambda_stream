package numericsStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class numericStreamMapEjemplo {

    //se puede devolver una lista en este caso por que es map to object, la lista es un objeto
    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5).mapToObj((i) -> {
            return new Integer(i);
        } ).collect(Collectors.toList());

    }
    //no se puede devolver una lista como el ejemplo de arriba por que long no es un objeto, seria interesante ver si se puede usar mop to object despues de map to long
    public static List<Long> mapToLong(){
        return IntStream.rangeClosed(1,5).mapToLong((i) -> i ).mapToObj((i) -> {return new Long(i);}).collect(Collectors.toList());

    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5).mapToDouble((i) -> i ).sum();

    }

    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
