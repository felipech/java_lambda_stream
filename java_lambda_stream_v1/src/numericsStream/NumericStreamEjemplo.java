package numericsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamEjemplo {

    public static int sumaDeNros(List<Integer> integerList){

        return integerList.stream()
                .reduce(0,(val1,val2) -> val1+val2);
    }

    public static int[] twoSum(int[] nums, int target) {

        System.out.println("lista int []");

        int suma = 0;
        int [] indices = new int[2];

        for(int x = 0; x < nums.length; x++){
            for(int i = 1; i < nums.length; i++){
                suma = nums[x] + nums[i];
                if(suma == target && x != i){
                    indices[0] = x;
                    indices[1] = i;
                    break;
                }

            }
            if(suma == target)break;
        }


       return indices;

    }


    public static int sumaDeNrosIntStream(){


        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,78,8);

        System.out.println("Forma Normal " + sumaDeNros(integerList));

        System.out.println("usando IntStream " + sumaDeNrosIntStream());

        int [] nums = new int[] {3,3};
        int [] respuesta = twoSum(nums,6);

        Arrays.stream(respuesta).forEach(System.out::println);
    }
}
