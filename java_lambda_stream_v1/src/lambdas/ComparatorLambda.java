package lambdas;

import java.util.Comparator;

public class ComparatorLambda {




    public static void main(String[] args) {
        //comparator normal
        //pasar el tipo de dato que se quiere comparar
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }

        };

        System.out.println("comparator : " + comparator.compare(4,3));


        //comparator con lambda

        Comparator<Integer> comparator1 = (nro1, nro2) ->  nro1.compareTo(nro2);



    }

}
