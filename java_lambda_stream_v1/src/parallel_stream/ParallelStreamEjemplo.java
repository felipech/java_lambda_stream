package parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEjemplo {

    public static long checkPerformanceResult(Supplier<Integer> sup, int nuumeroDeVeces){

        long starTime = System.currentTimeMillis();
        for(int i = 0; i < nuumeroDeVeces; i++){
            sup.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - starTime;

    }

    public static int sum_Sequential_Stream(){
        return IntStream.rangeClosed(1,1000000)
                .sum();
    }

    public static int sum_Parallel_Stream(){
        return IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println( "Paralelo " + checkPerformanceResult(ParallelStreamEjemplo::sum_Parallel_Stream, 20) );
        System.out.println( "Secuencial " + checkPerformanceResult(ParallelStreamEjemplo::sum_Sequential_Stream, 20) );
    }
}
