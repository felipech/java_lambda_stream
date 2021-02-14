package stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FactoryMethodsStreamEjemplo {



    public static void main(String[] args) {

        //convierte a un string del tipo indicado
        Stream<String> stringStream = Stream.of("asdasd","ddsda", "nombre");

        stringStream.forEach(System.out::println);

        System.out.println("Iterando sobre una funcion dada");
        Stream.iterate(1, x-> x*2).limit(15).forEach(System.out::println);



        System.out.println("generando nros random");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(15).forEach(System.out::println);


    }

}
