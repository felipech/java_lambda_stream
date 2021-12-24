package menejoString;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulation {

    private static String secondFormRemoveCharsSpecials(String input) {

        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇº&'";

        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC   ";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }
        return output;
    }


    public static Function<Character, String> convertirAscii = (letra) -> {
        Map<Character, String> asciii = new HashMap<>();
        asciii.put('á',"a");
        asciii.put('à',"a");
        asciii.put('ä',"a");
        asciii.put('é',"e");
        asciii.put('è',"e");
        asciii.put('ë',"e");
        asciii.put('í',"i");
        asciii.put('ì',"i");
        asciii.put('ï',"i");
        asciii.put('ó',"o");
        asciii.put('ò',"o");
        asciii.put('ö',"o");
        asciii.put('ú',"u");
        asciii.put('ù',"u");
        asciii.put('u',"u");
        asciii.put('ñ',"n");
        asciii.put('Á',"A");
        asciii.put('À',"A");
        asciii.put('Ä',"A");
        asciii.put('É',"E");
        asciii.put('È',"E");
        asciii.put('Ë',"E");
        asciii.put('Í',"I");
        asciii.put('Ì',"I");
        asciii.put('Ï',"I");
        asciii.put('Ó',"O");
        asciii.put('Ò',"O");
        asciii.put('Ö',"O");
        asciii.put('Ú',"U");
        asciii.put('Ù',"U");
        asciii.put('Ü',"U");
        asciii.put('Ñ',"N");
        asciii.put('ç',"c");
        asciii.put('Ç',"C");
        asciii.put('º',"");
        asciii.put('\'',"");
        asciii.put('&',"");
        asciii.put('\"',"");
        if(asciii.containsKey(letra)){
            return asciii.get(letra);
        }
        return letra.toString();
    };

    /**
     * Funcion para sacar caracteres especiales de un string
     * @param input string que se quiere limpiar
     * */
    public static String removeCharsSpecials(String input) {
        try{
            return input.chars().mapToObj(ch -> convertirAscii.apply((char) ch)).collect(Collectors.joining());
        }catch (Exception e){
            //forma en caso de error
            return secondFormRemoveCharsSpecials(input);
        }
    }



    public static void main(String[] args) {

        /*System.out.println(java.lang.Thread.activeCount());
        String srttttt = "CALLE TRES & VEINTE 187",fix = "";
        System.out.println("srttttt --> " + fix);
        System.out.println(" 1 - " + removeCharsSpecials("JAIME GUZMAN 102 ROSARIO INT CASARENGO(EN GOOGLE MAPS SALE COMO \"CALLE B\")"));
        System.out.println(" 2 - " + secondFormRemoveCharsSpecials("CERRO O'HIGGINS 2774"));*/

        String vale = "Vale;Vista";
        String[] splitValeVista = vale.split(";");
        System.out.println(splitValeVista[0]   + " ----- " + splitValeVista[1]);

        System.out.println("Resultado " + vale.equals("Vale Vista"));


    }

}
