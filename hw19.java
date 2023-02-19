import java.util.Arrays;
import java.util.Scanner;

// должен вернуть массив длины len, каждое значение которого равно initialValue
public class hw19 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int len = iScanner.nextInt();
        System.out.printf("Введите значение массива: ");
        int initalValue = iScanner.nextInt();
        iScanner.close();  

        int[]array = new int [len];
        array=createArray (len, initalValue);
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray(int lenf, int initalValuef) {
        int[]arrayf = new int [lenf];
        for (int i = 0; i <= lenf-1; i++) {
            arrayf[i]=initalValuef;
        }
        return arrayf;
    }
}