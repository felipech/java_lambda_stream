package varios;

import java.util.*;

public class ProductosDuplicados {

    public static void main(String[] args) {

        OmsObject omsObject = new OmsObject();
        omsObject.setSku("12312454513");
        omsObject.setCantidad(2);

        OmsObject omsObject1 = new OmsObject();
        omsObject1.setSku("12771454513");
        omsObject1.setCantidad(1);

        OmsObject omsObject2 = new OmsObject();
        omsObject2.setSku("12312454513");
        omsObject2.setCantidad(3);

        OmsObject omsObject3 = new OmsObject();
        omsObject3.setSku("12318854513");
        omsObject3.setCantidad(2);

        OmsObject omsObject5 = new OmsObject();
        omsObject5.setSku("12312454513");
        omsObject5.setCantidad(1);
        OmsObject omsObject6 = new OmsObject();
        omsObject6.setSku("12312454513");
        omsObject6.setCantidad(6);

        OmsObject omsObject7 = new OmsObject();
        omsObject7.setSku("12771454513");
        omsObject7.setCantidad(3);

        List<OmsObject> omsObjectList = new ArrayList<>();

        omsObjectList.add(omsObject);
        omsObjectList.add(omsObject1);
        omsObjectList.add(omsObject2);
        omsObjectList.add(omsObject3);
        omsObjectList.add(omsObject5);
        omsObjectList.add(omsObject6);
        omsObjectList.add(omsObject7);

        List<OmsObject> omsObjectListUpdated = new LinkedList<>();
        Map<String, OmsObject> listSku = new HashMap<>();
        System.out.println("******inicio********");
        for (OmsObject om: omsObjectList){
            System.out.println("sku " + om.getSku() + " cantidad " + om.getCantidad());
        }

        System.out.println("******termino********");

        omsObjectList.forEach(omsObject4 -> {

            if(!listSku.containsKey(omsObject4.getSku())){
                listSku.put(omsObject4.getSku(), omsObject4);
                omsObjectListUpdated.add(omsObject4);
            }else {

                if(omsObject4.getCantidad() > listSku.get(omsObject4.getSku()).getCantidad()){
                    listSku.remove(omsObject4.getSku());
                    listSku.put(omsObject4.getSku(), omsObject4);
                }
            }

        });
        List<OmsObject> listaFinal = new ArrayList<>();
        for (Map.Entry<String, OmsObject> entry : listSku.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue().getCantidad());
            listaFinal.add(entry.getValue());
        }


        System.out.println("******Inicio-2********");
        listaFinal.forEach(omsObject4 -> {
            System.out.println("resultado Final " + omsObject4.getSku() + " cantidad " + omsObject4.getCantidad());
        });
        System.out.println("******termino-2********");




    }

}
