package varios;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {


    public static void main(String[] args) {


        Integer numATransformar = 400;
        Integer numNuevo = numATransformar;
        StringBuilder transformacion = new StringBuilder();
        /**
         * unidad largo 1
         * decena largo 2
         * centena largo 3
         * miles largo 4
         */

        int indexLetra = 0;
        for (int i = 0; i < numATransformar; i++) {
            if (numNuevo.toString().length() == 1) {
                if (numNuevo == 0) {
                    break;
                } else if (numNuevo < 4) {
                    //usar la "I"
                    //restar el valor del nro principal
                    
                    transformacion.append( "I");
                    //transformacion.insert(i, "I");
                    numNuevo = numNuevo - 1;
                } else if (numNuevo == 4) {
                    // usar un "I" y "V"
                    //transformacion.append( "IV");
                    transformacion.insert(indexLetra, "IV");
                    numNuevo = numNuevo - 4;
                    indexLetra = indexLetra + 2;
                } else if (numNuevo == 5) {
                    //usar la "V"
                    //restar el valor del nro principal
                    //transformacion.append("V");
                    transformacion.insert(indexLetra,"V");
                    numNuevo = numNuevo - 5;
                    indexLetra++;
                    //System.out.println("num nuevo " + numNuevo);
                } else if (numNuevo < 9) {
                    //usar la "I"
                    transformacion.append("I");
                    //transformacion.insert(i,"I");
                    numNuevo = numNuevo - 1;
                    //System.out.println("num nuevo " + numNuevo);
                } else if (numNuevo == 9) {
                    //usar la "I" y la "X"
                    //transformacion.append("IX");
                    transformacion.insert(indexLetra,"IX");
                    numNuevo = numNuevo - 9;
                    indexLetra = indexLetra + 2;
                }
            }else if(numNuevo.toString().length() == 2){
                if(numNuevo >= 10 && numNuevo < 40){
                    transformacion.insert(indexLetra, "X");
                    numNuevo = numNuevo - 10;
                    indexLetra++;
                    //System.out.println("num nuevo " + numNuevo);
                }else if(numNuevo >= 40 && numNuevo < 50){
                    transformacion.insert(indexLetra, "XL");
                    numNuevo = numNuevo - 40;
                    indexLetra = indexLetra + 2;
                }else if (numNuevo >= 50 && numNuevo < 90){
                    transformacion.insert(indexLetra, "L");
                    numNuevo = numNuevo - 50;
                    indexLetra++;
                }else if(numNuevo >= 90){
                    transformacion.insert(indexLetra, "XC");
                    numNuevo = numNuevo - 90;
                    indexLetra = indexLetra + 2;
                }
            }else if (numNuevo.toString().length() == 3){
                if(numNuevo >= 100 && numNuevo < 400){
                    transformacion.insert(indexLetra, "C");
                    numNuevo = numNuevo - 100;
                    indexLetra++;
                }else if(numNuevo >= 400 && numNuevo < 500) {
                    transformacion.insert(indexLetra, "CD");
                    numNuevo = numNuevo - 400;
                    indexLetra = indexLetra + 2;
                }else if (numNuevo >= 500 && numNuevo < 900){
                    transformacion.insert(indexLetra, "D");
                    numNuevo = numNuevo - 500;
                    indexLetra++;
                }else if(numNuevo >= 900) {
                    transformacion.insert(indexLetra, "CM");
                    numNuevo = numNuevo - 900;
                    indexLetra = indexLetra + 2;
                }
            }else {
                if (numNuevo >= 1000){
                    transformacion.insert(indexLetra, "M");
                    numNuevo = numNuevo - 1000;
                    indexLetra++;
                }
            }
        }


        System.out.println("resultado " + transformacion.toString());
/*
        }else if (numATransformar.toString().length() == 2){

        }else if (numATransformar.toString().length() == 3){

        }else {

        }
*/


        System.out.println(numATransformar.toString().length());
        char[] nrm = numATransformar.toString().toCharArray();

        for (Character c : nrm) {
            System.out.println("-> " + c);
        }


    }
}
