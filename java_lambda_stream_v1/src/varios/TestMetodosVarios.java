package varios;

import java.util.ArrayList;
import java.util.List;

public class TestMetodosVarios {

    public static void main(String[] args) {

        List<String> idCierreList = new ArrayList<>();
        /*
        * 3489
3523
3526
3552
3563

        *
        * */
       /* idCierreList.add(3489L);
        idCierreList.add(3523L);
        idCierreList.add(3526L);
        idCierreList.add(3563L);
*/
        idCierreList.add("");

        String[] objectIdCierre = idCierreList.toString().substring(1, idCierreList.toString().length() -1).split(", ");
        if(objectIdCierre.length > 0){

        } if(!idCierreList.get(0).equals(" ") && !idCierreList.get(0).equals("")){
            Long.valueOf(idCierreList.get(0));
        }

        for(String str: objectIdCierre){
            System.out.println("----> " + str + " largo " + objectIdCierre.length + " largo lista " + idCierreList.size());
        }


    }
}
