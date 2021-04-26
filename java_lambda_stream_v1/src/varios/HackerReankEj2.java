package varios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HackerReankEj2 {

    public static int formula(int a, int b, int n){

        int resultado = 0;

        return 0;
    }


    public static void hexaToString(String hexStr){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }

        System.out.println(output);
        //return output.toString();
    }


    public static void main(String[] args) throws FileNotFoundException {

        String nombreArchivo = "java_lambda_stream_v1/src/inputEjemplo.txt";
        Scanner scanner = new Scanner(new File(nombreArchivo));

        scanner.nextLine();
        int a = 0, b = 0, n = 0;

        while (scanner.hasNext()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            System.out.println("a " + a + " b " + b + " n " + n);


        }


        hexaToString("303034313030");

    }
}
