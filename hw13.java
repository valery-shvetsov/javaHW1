/**
* 3. Создать квадратный двумерный целочисленный массив 
* (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
 * (можно только одну из диагоналей, если обе сложно). 
 * Определить элементы одной из диагоналей можно по следующему принципу: 
 * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]; 
*/

import java.util.Scanner;
    public class hw13 {    
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите размер массива: ");
            boolean flag = iScanner.hasNextInt();
            System.out.println(flag);
            int a = iScanner.nextInt();
            System.out.printf("квадратный массив \n", a);
            iScanner.close();

            int[][] array = new int [a][a];
            for (int i = 0; i <= array.length-1; i++) {
                for (int j = 0; j <= array.length-1; j++) {
                    if (i==j){
                        array[i][j]=1;
                        }else{array[i][j]=0;
                        }    
                    System.out.printf("%d",array[i][j]);
                }
            System.out.println();
        } 
    }
}
