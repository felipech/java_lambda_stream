package numericsStream;

import java.util.stream.IntStream;

public class NumericRangeEjemplo {


    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);

        System.out.println(intStream.count());
        //rango normal sin incluir el ultimo
        IntStream.range(1,50).forEach((x) -> System.out.print(x+","));
        System.out.println();
        //rango con el ultimo numero incluido
        System.out.println(IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach((x) -> System.out.print(x+","));




    }
}
