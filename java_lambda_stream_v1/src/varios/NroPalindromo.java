package varios;

import java.util.ArrayList;
import java.util.List;

public class NroPalindromo {

    public static boolean esPalindromo(){


        return false;
    }

    public static void main(String[] args) {
        int x = -10;
        int resto;
        int largo = 0;
        String nro = String.valueOf(x);

        boolean esPalind = false;
        boolean esNegativo = false;
        if(x % 2 == 0){
        }
        if(x < 0){
            esNegativo = true;
            largo = nro.length() -1;
        }else {
            largo = nro.length();
        }

        if(largo == 1){
            System.out.println("es palindromo");
        }
        int [] nroSeparado = new int[largo];
        for(int i = 0; i < largo; i++){
            resto = x % 10;
            nroSeparado[i] = resto;
            x = x / 10;
        }

        for (Integer as : nroSeparado ) System.out.println("Integer " + as);

        int zz = largo - 1;
        for(int ii = 0; ii < largo/2; ii++){
            if(esNegativo) {
                nroSeparado[ii] = nroSeparado[ii] * -1;
                esNegativo = false;
            }
            if(nroSeparado[ii] == nroSeparado[zz]){
                esPalind = true;
            }
            else {
                esPalind = false;
                break;
            }

            System.out.println(" ii " +nroSeparado[ii] + "  zz " + nroSeparado[zz]);
            zz--;
        }

        if (esPalind){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }


    }
}
