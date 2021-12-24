package Enums;

import java.util.ArrayList;
import java.util.List;

public class EnumIteration {


    public static void main(String[] args) {

        List<String> listaTextosEnums = new ArrayList<>();

        EnumTextos enumTextos[] = EnumTextos.values();


        for(EnumTextos s : enumTextos){
            System.out.println(s.getGlosa());
        }


    }
}
