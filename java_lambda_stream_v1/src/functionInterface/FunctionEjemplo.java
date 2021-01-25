package functionInterface;

import java.util.Locale;
import java.util.function.Function;

public class FunctionEjemplo {
    //prueba simple
    static Function<String, String> convierteMayuscula = (texto) -> texto.toUpperCase();

    //calculo simple
    static Function<String, Integer> cuentaLetras = (texto) -> {
        int contar=0;
        for (Character c: texto.toCharArray()) {
            if(c != 32){
                contar+=1;
            }
        }
        return contar;
    };


    static Function<String, String> agregarTexto = (texto) -> texto.concat(" agregacion");


    public static void main(String[] args) {

        System.out.println("Convierte la palabra:  " + convierteMayuscula.apply("Texto de prueba"));
        System.out.println("cuenta la letra:  " + cuentaLetras.apply("Texto de prueba"));

        //usando andThem
        System.out.println("Concatenando texto " + convierteMayuscula.andThen(agregarTexto).apply("Preuba de"));

        //compose, primero ejecuta la concatenacion y despues se la pasa a la funcion que convierte en mayusculas, por eso queda en uppercase
        System.out.println("Usando compose " + convierteMayuscula.compose(agregarTexto).apply("Preuba Compose"));
    }

}
