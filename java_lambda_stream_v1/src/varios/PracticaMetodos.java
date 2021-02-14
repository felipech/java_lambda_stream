package varios;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class PracticaMetodos {

    public static class ListNode {
      int val;
      ListNode next;

      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
    public String concatList(ListNode l1){
        String nro1 = "";
        while (l1 != null){
            nro1 = nro1.concat(String.valueOf(l1.val));
            l1 = l1.next;
        }
        return nro1;
    }

    public BigDecimal reversarNro(String nro1){
        String reverso = "";
        for (int i = nro1.toCharArray().length-1; i >= 0;i--){
            System.out.println(nro1.toCharArray()[i]);
            reverso = reverso.concat(String.valueOf(nro1.toCharArray()[i]));

        }
        return new BigDecimal(reverso);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String primerNro = concatList(l1);
        String segundoNro = concatList(l2);

        BigDecimal nro1 = reversarNro(primerNro);
        BigDecimal nro2 = reversarNro(segundoNro);
        BigDecimal suma = nro1.add(nro2);

        String nroFinal = String.valueOf(suma);

        //System.out.println(nroFinal);
        //ListNode listNode3 = new ListNode();
        ListNode listNode3 = null;
        for(int ii = 0; ii < nroFinal.length();ii++){

            listNode3 = new ListNode(Integer.parseInt(String.valueOf(nroFinal.toCharArray()[ii])), listNode3);
            System.out.println("lista " + listNode3.val);
        }

        return listNode3;
    }

    public int sumarDosNroConReserva(ListNode l1, ListNode l2){

        int reserva = 0;
        int suma = 0;



        return 0;
    }

    public String concat(ListNode l1){
        String nro1 = "";
        while (l1 != null){
            nro1 = nro1.concat(String.valueOf(l1.val));
            l1 = l1.next;
        }
        return nro1;
    }

    public int reversarNro1(String nro1){
        String reverso = "";
        for (int i = nro1.toCharArray().length-1; i >= 0;i--){
            System.out.println(nro1.toCharArray()[i]);
            reverso = reverso.concat(String.valueOf(nro1.toCharArray()[i]));

        }
        return Integer.parseInt(reverso);
    }

    public static ListNode llenarLista(String nroFinal){

        ListNode listNode3 = null;
        int [][] nros = new int[nroFinal.length()][nroFinal.length()];


        for(int ii = 0; ii < nroFinal.length();ii++){

            listNode3 = new ListNode(Integer.parseInt(String.valueOf(nroFinal.toCharArray()[ii])), listNode3);
            System.out.println("lista " + listNode3.val);
        }

        return listNode3;
    }

    public static void main(String[] args) {



        ListNode l1 = llenarLista("243");
        ListNode l2 = llenarLista("564");




        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(4, listNode2);
        ListNode listNode = new ListNode(2, listNode1);


        String nro1 = "";
        while (listNode != null){
            nro1 = nro1.concat(String.valueOf(listNode.val));

            listNode = listNode.next;
        }

        String reverso = "";
        for (int i = nro1.toCharArray().length-1; i >= 0;i--){
            System.out.println(nro1.toCharArray()[i]);
            reverso = reverso.concat(String.valueOf(nro1.toCharArray()[i]));

        }
        System.out.println("reverso " + reverso);
        ListNode listNode3 = new ListNode();
        BigDecimal bigDecimal = new BigDecimal(reverso);


        for(int ii = reverso.length() - 1; ii >= 0;ii--){



            listNode3 = new ListNode(Integer.parseInt(String.valueOf(reverso.toCharArray()[ii])), listNode3);
            System.out.println("lista " + listNode3.val);

        }


    }
}
