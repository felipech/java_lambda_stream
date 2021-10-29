package defaultMethodsInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsInterfacesEjemplo {

    public static void defaultMethodsEjemplo(){

        List<String> ejemploDefault = Arrays.asList("Felipe", "Andres", "Sofia", "Carolina");

        ejemploDefault.sort(Comparator.naturalOrder());

        System.out.println("Lista Ordenada " + ejemploDefault);

    }

    public static void main(String[] args) {
        defaultMethodsEjemplo();
    }

}
