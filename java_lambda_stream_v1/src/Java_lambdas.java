import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java_lambdas {



    public static void main(String[] args){

        System.out.println("asdasda");

        List<Integer> listaNumero = Arrays.asList(1,2,3,4,5,6);

        for(int i = 0; i < listaNumero.size(); i++){
            System.out.println("--> " + listaNumero.get(i));
        }

        Iterator<Integer> i = listaNumero.iterator();
        while(i.hasNext()){
            System.out.println("iterator " + i.next());
        }

        for(Integer ii:listaNumero){
            System.out.println("ii " + ii);
        }

        listaNumero.forEach(iii -> System.out.println("iii " + iii));

        //declarativa vs funcional


    }

}
