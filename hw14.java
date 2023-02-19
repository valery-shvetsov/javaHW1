import java.util.Arrays;
import java.util.Random;

/** 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
*/

public class hw14 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100); // random [0, 100)
        }
        System.out.println(Arrays.toString(array));
        int max=0;
        int min=100;
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
                array[i]=0; 
            }
        }
           
    System.out.printf("минимальный элемент %s", min);
    System.out.println();
    System.out.printf("максимальный элемент %s", max);  
    }
}        

