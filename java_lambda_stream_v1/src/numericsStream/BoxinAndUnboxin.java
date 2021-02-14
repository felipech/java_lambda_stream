package numericsStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxinAndUnboxin {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        //convierte el tipo de la clase al tipo primitivo --> ejemplo integer a int

        return integerList.stream().mapToInt(Integer::intValue).sum();

    }

    public static void main(String[] args) {

        System.out.println("Boxing de int a Integer" + boxing());

        System.out.println("unBoxing de Integer a int " + unBoxing(boxing()));
    }

}
