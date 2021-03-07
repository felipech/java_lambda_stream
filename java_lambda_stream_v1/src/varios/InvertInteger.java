package varios;

import java.util.LinkedList;
import java.util.List;

public class InvertInteger {


    public static void main(String[] args) {

        int xx = 42;

        int maximo = 2147483647;
        int minimo = -2147483648;
        String nro1 = "  0000000000012345678".trim();
        //Integer conversion = x;


        boolean negativo  = false;
        boolean letraPrimero = false;

        if(nro1.equals("")) System.out.println("vacio ");



        if(!nro1.contains("1") && !nro1.contains("2") && !nro1.contains("3") && !nro1.contains("4") && !nro1.contains("5") && !nro1.contains("6") && !nro1.contains("7") && !nro1.contains("8") && !nro1.contains("9")){
            System.out.println("cero ");
        }

        if(nro1.contains("-")){

            negativo = true;
        }

        char [] nro = nro1.toCharArray();
        StringBuilder sr = new StringBuilder();

        //limpiar nro

        for(int zzz = 0; zzz < nro1.length(); zzz++){
            if((nro[zzz] >= 49 && nro[zzz] <= 57)){
                sr.append(nro[zzz]);
            }
        }
        nro1 = sr.toString();
        System.out.println("Nro limpio " + nro1);
        sr.delete(0, sr.length());

        System.out.println("sr sin nada " + sr.toString());
        int x = 0;
        if(negativo){
            x = 1;
        }

        for( int i = x ; i < nro1.length() ; i++){
            System.out.println(nro[i]);
            if(!(nro[i] >= 49 && nro[i] <= 57)  && sr.length() == 0 && nro[i] != 32 && nro[i] != '-' && nro[i] != '+') {
                System.out.println(i +  " ---- 0");
                break;
            }
            if(sr.length() != 0 && nro[i] == '.'){

                break;
            }
            if(i == 1 && !(nro[i] >= 49 && nro[i] <= 57) ){
                System.out.println("2 signos"  );
            }
            if(nro[i] != '0' && sr.length() == 0 &&  nro[i] >= 49 && nro[i] <= 57 ){

                sr.append(nro[i]);

            }else if(sr.length() != 0 && (nro[i] >= 48 && nro[i] <= 57 ) ){
                sr.append(nro[i]);
            }

        }
        Integer resultado = 0;
        try {
            resultado = Integer.parseInt(sr.toString());
        }catch (Exception e){
            if(negativo){
                System.out.println(minimo);
            }else {
                System.out.println(maximo);
            }
        }

        if(negativo){
            resultado = resultado*-1;
        }

        System.out.println("FInal " + resultado);


    }
}
