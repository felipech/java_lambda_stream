package numericsStream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAgregateMinMaxEjemplo {


    public static void main(String[] args) {

        int result = IntStream.rangeClosed(1,50).sum();

        System.out.println(result);


        OptionalInt res = IntStream.rangeClosed(1,50).max();
        System.out.println(IntStream.rangeClosed(0,0).count());
        System.out.println(res.isPresent() ? res.getAsInt(): 0);

        if(res.isPresent()){
            System.out.println(res.getAsInt());
        }

    }


}
