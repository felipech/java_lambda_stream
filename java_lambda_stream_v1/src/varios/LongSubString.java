package varios;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongSubString {

    /*
    *
    * String val = "ytluvvlydxbfyurqirezvhjtptohtrjtkwngrbgwyjbwdsomjsnfbwaqqqxligeseravujrvsut";

        int largo = 0;

        for(int i = 0; i < val.length(); i++){
            for(int x = i; x < val.length()+1; x++){

                String re = val.substring(i,x);
                List<Character> listaChar = new ArrayList<>();

                for(Character c: re.toCharArray()){
                    listaChar.add(c);
                }
                List<Character> listaUnica = listaChar.stream().distinct().collect(Collectors.toList());
                Optional<String> lll = listaUnica.stream().map(String::valueOf).reduce((zz, y) -> zz.concat(y));
                if(lll.isPresent()){
                    //System.out.println("lll " + lll.get());
                    if(val.contains(lll.get()) && lll.get().length() > largo && lll.isPresent() ) {
                        largo = lll.get().length();
                    }
                }


            }

        }
        System.out.println("largo final " + largo);
    * */

    public static String cadenaSinRepeticiones(String str){
        List<Character> lista = new ArrayList<>();
        for(Character c: str.toCharArray()){
            if(!lista.contains(c)){
                lista.add(c);
            }
        }

        Optional<String> fi = lista.stream().map((x)->x.toString()).reduce((x, y) -> x.concat(y));
        if(fi.isPresent()){
            return fi.get();
        }else{
            return "";
        }

    }

    public static void codenasIntermedias (String str){


    }

    /*public static void validar(String str){
        String sinRepeticiones = "";
        List<Character> list = cadenaSinRepeticiones(str);
        for(Character c: list){
            sinRepeticiones = sinRepeticiones.concat(c.toString());
        }
        System.out.println(sinRepeticiones);
        list.forEach(System.out::print);

    }*/


    public static int todasConvinaciones(String str, String original){
        int largo = 0;
        int l;
        for (int i = 0; i < str.length(); i++){
            for (int x = i+1; x < str.length()+1; x++){
                String s = str.substring(i,x);

                if (original.contains(s)){
                    l = s.length();
                    if(l > largo){
                        largo = l;
                    }
                    System.out.println("s -> " + s + " largo " + s.length());

                }
            }
        }
        //System.out.println("largo --> " + largo);
        return largo;


    }

    public static int funcionGeneral(String strOriginal){
        int largoString = strOriginal.length();

        if(largoString == 0){
            return 0;
        }else if(largoString == 1){
            return 1;
        }else {
            String str = cadenaSinRepeticiones(strOriginal);
            int larg = str.length();
            if(larg == 2){
                return 2;
            }else if(larg == 3){
                return 3;
            }
            //System.out.println(cadenaSinRepeticiones(val));

            return todasConvinaciones(str, strOriginal);
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int largo = nums1.length;
        int largo2 = nums2.length;

        if(largo2 == 0 && largo == 0){
            return 0;
        }

        int largoCombinado = largo+largo2;
        List<Integer> listaJunta = new ArrayList<>();

        for (int i = 0; i < largo; i++){
            listaJunta.add(nums1[i]);
        }

        for(int x  = 0; x < largo2; x++){
            listaJunta.add(nums2[x]);
        }
        List<Integer> listaJuntaOrdenada = listaJunta.stream().sorted().collect(Collectors.toList());

        double valor1;
        double valor2;
        double mediana;
        if(listaJuntaOrdenada.size() % 2 == 0){
            valor1 = listaJuntaOrdenada.get((largo+largo2)/2);
            valor2 = listaJuntaOrdenada.get(((largo+largo2)/2)-1);
            mediana = (valor1 + valor2) / 2;
            return mediana;
        }else{
            return (double)listaJuntaOrdenada.get((largo+largo2)/2);

        }

    }


    public static int lengthOfLongestSubstring2(String strOriginal) {
        String val = strOriginal;

        for (int ww = 0; ww < strOriginal.length();ww++){
            System.out.println(strOriginal.substring(ww));
        }
        ConcurrentHashMap<String, Integer> mapaConbinaciones = new ConcurrentHashMap<>();
        int largoInicial =  val.length();
        if(largoInicial == 0){
            return 0;
        }
        if(largoInicial == 1){
            return 1;
        }
        String cn = cadenaSinRepeticiones(val);
        int largoCn = cn.length();

        if(largoCn == 1){
            return 1;
        }
        if(largoCn == 2){
            return 2;
        }
        if(largoCn == 3 && val.contains(cn)){
            return 3;
        }


        for(int i = 0; i < largoInicial; i++){
            int finalI = i;

            Runnable runnable = () -> {
                for(int x = finalI; x < largoInicial+1; x++){
                    String re = val.substring(finalI,x);
                    //System.out.println("re parallelo" + re);
                    int lar = re.length();
                    if(lar != 0){
                        mapaConbinaciones.put(re,lar);
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }




        int largo1 = 0;
        for (Map.Entry<String,Integer> entry : mapaConbinaciones.entrySet()){

            String cnn = "";
            //System.out.println("x --> " + entry.getKey() + " y --> " + entry.getValue());
            List<Character> sds = new ArrayList<>();
            for(Character c: entry.getKey().toCharArray()){
                if(!sds.contains(c)){
                    sds.add(c);
                    cnn = cnn.concat(c.toString());
                }
            }
            if(entry.getKey().contains(cnn) && largo1 < cnn.length()){
                largo1 = cnn.length();
            }
        }


        return largo1;
    }

    public static void main(String[] args) {

        String val = "dvdf";

        //String str = validar(val);
        //String str = cadenaSinRepeticiones(val);
        //System.out.println(cadenaSinRepeticiones(val));
        //int ll = todasConvinaciones(str, val);
        //System.out.println(lengthOfLongestSubstring2(val));
        //todasConvinaciones();
        //System.out.println("largo final " + lengthOfLongestSubstring(val));

        int [] nums1 = new int []{1,3};//2
        int [] nums2 = new int []{2,7};//9/2-->
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
