package varios;

public class amstrong {


    public static void nroAmstrong(int nro){

        String conversion = String.valueOf(nro);
        double result = 0;
        for(int i = 0; i < conversion.length() ; i++){
            int c = Integer.parseInt(conversion.substring(i,i+1));
            result = Math.pow(c,conversion.length()) + result;
        }
        if (result == nro){
            System.out.println("es un nro de amnstrong");
        }else {
            System.out.println("no es un nro de amnstrong");
        }
    }

    public static void nroAmstrong2(int nro){



    }

    public static void main(String[] args) {

        nroAmstrong(370);
        nroAmstrong2(1000);


    }
}
