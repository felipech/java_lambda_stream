package varios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyAtoiMethod {


    public static int myAtoiFuncion(String inputEjemplo){
        int maximo = 2147483647;
        int minimo = -2147483648;

        boolean negativo  = false;

        Predicate<Character> esUnNumero = (nro) -> nro >= 48 && nro <= 57;
        Predicate<Character> esSignoMatematico = (nro) -> nro == '-' || nro == '+';

        //limpiamos todos los espacion que estan en el frente del string

        String inputSinEspaciosAdelante = inputEjemplo.trim();

        //verificamos que el string no sea solo un string vacio o con espacio
        if(inputEjemplo.equals("")){
            return 0;
        }
        //el string tiene que tener al menos un nro sino no se puede convertir
        if(!inputSinEspaciosAdelante.contains("1") && !inputSinEspaciosAdelante.contains("2") &&
                !inputSinEspaciosAdelante.contains("3") && !inputSinEspaciosAdelante.contains("4") &&
                !inputSinEspaciosAdelante.contains("5") && !inputSinEspaciosAdelante.contains("6") &&
                !inputSinEspaciosAdelante.contains("7") && !inputSinEspaciosAdelante.contains("8") &&
                !inputSinEspaciosAdelante.contains("9"))
            return 0;

        if(inputSinEspaciosAdelante.length() > 1 && inputSinEspaciosAdelante.toCharArray()[0] == '-' && (inputSinEspaciosAdelante.toCharArray()[1] == '1' ||
                inputSinEspaciosAdelante.toCharArray()[1] == '2' || inputSinEspaciosAdelante.toCharArray()[1] == '3' ||
                inputSinEspaciosAdelante.toCharArray()[1] == '4' || inputSinEspaciosAdelante.toCharArray()[1] == '5' ||
                inputSinEspaciosAdelante.toCharArray()[1] == '6' || inputSinEspaciosAdelante.toCharArray()[1] == '7' ||
                inputSinEspaciosAdelante.toCharArray()[1] == '9' ) ){
            negativo = true;
        }
        if(inputSinEspaciosAdelante.toCharArray()[0] == '-'){
            negativo = true;
        }

        int x = 0;
        if(negativo)x = 1;

        char [] nro = inputSinEspaciosAdelante.toCharArray();

        if( (esSignoMatematico.test(nro[0])) && (esSignoMatematico.test(nro[1])) ){
            return 0;
        }
        if(!(esSignoMatematico.test(nro[0])) && !(esUnNumero.test(nro[0]))){
            return 0;
        }
        StringBuilder sr = new StringBuilder();


        if(!esUnNumero.test(nro[0]) && !esUnNumero.test(nro[1])){
            return 0;
        }
        for( int i = x ; i < inputSinEspaciosAdelante.length() ; i++){

            if(sr.length() != 0 && !(esUnNumero.test(nro[i]))){
                break;
            }

            if(nro[i] != '0' && sr.length() == 0 &&  nro[i] >= 49 && nro[i] <= 57 ){

                sr.append(nro[i]);

            }else if(sr.length() != 0 && (esUnNumero.test(nro[i]))){

                sr.append(nro[i]);
            }else if(sr.length() == 0 && i >= 1 && !(esUnNumero.test(nro[i]))){
                //System.out.println("Test ---> " + nro[i]);

                return 0;
            }

        }
        //System.out.println("String original " + inputEjemplo.trim() );
        //System.out.println("String builder " + sr.toString());
        int resultado;
        try {
            resultado = Integer.parseInt(sr.toString());
        }catch (Exception e){
            if(negativo){
                return minimo;
            }else {
                return maximo;
            }
        }

        if(negativo){
            resultado = resultado * -1;
        }
        return resultado;

    }


    public static void main(String[] args) {


        String inputEjemplo = "3.14159";

        //test -- letcode
        List<String> listaPruebas = new ArrayList<>();

        listaPruebas.add("3.14159");
        listaPruebas.add("42");
        listaPruebas.add("-42");
        listaPruebas.add("   -42");
        listaPruebas.add("4193 with words");
        listaPruebas.add("words and 987");
        listaPruebas.add("-91283472332");
        listaPruebas.add("  0000000000012345678");
        listaPruebas.add("-+12");
        listaPruebas.add("+1");
        listaPruebas.add("");
        listaPruebas.add(".1");
        listaPruebas.add("00000-42a1234");
        listaPruebas.add("-000000000000001");
        listaPruebas.add("  -0012a42");
        listaPruebas.add("0-1");

        for(String s : listaPruebas){
            System.out.println(myAtoiFuncion(s));
        }




    }
}
