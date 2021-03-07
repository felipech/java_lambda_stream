package varios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetcodeTestZigZag {

    public static void main(String[] args) {

        /*"PAY P ALI S HIR I NG"
           012 1 012 1 012 1 01
           AYPLISIRIG

           */

        /*

        "ABCD"
2
        * PAYP AL ISHI RI NG
        * 0123 21 0123 21 01
        * */
        HashMap<String, List<Integer>> agrupacion = new HashMap<>();

        String str1 = "ABCD";
        int [][] matrizAgrupacion = new int[2][str1.length()];
        //contador de rows
        int j = 0;
        boolean act = false;
        int row = 2;
        for(int i = 0; i < str1.length(); i++){
            //System.out.println(j);
            if(j < 0) j = j*-1;
            matrizAgrupacion[0][i] = str1.toCharArray()[i];
            matrizAgrupacion[1][i] = j;
            if(j == (row -1) ){
                j -= 1;
                //retrocediendo activado
                act = true;

            }else if(j < (row -1) && act ){
                j-=1;
                if(j == 0){
                    act = false;
                }
            }
            else{
                j++;
            }


        }

            //map con key el row y una lista de letras
            for(int z = 0; z < str1.length(); z++){

                System.out.println((char)matrizAgrupacion[0][z] + " - " + matrizAgrupacion[1][z]);

            }

            StringBuilder sr = new StringBuilder("");
            for(int ii = 0; ii < row; ii++){
                for(int z = 0; z < str1.length(); z++) {
                    if (matrizAgrupacion[1][z] == ii) {
                        sr.append( String.valueOf((char) matrizAgrupacion[0][z]));
                    }
                }
            }
        System.out.println(sr.toString());



        //System.out.println("PAYPALISHIRING".length());




    }

}
