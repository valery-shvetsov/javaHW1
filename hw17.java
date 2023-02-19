import java.util.Scanner;

// напечатать строку source repeat раз

public class hw17 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String source = iScanner.nextLine();
        System.out.printf("Введите количество повторений: ");
        int repetnumber  = iScanner.nextInt();
        iScanner.close();  
        printString(source,repetnumber);
        
    }        
    private static void printString(String source, int repeat) { 
        for (int i = 0; i <= repeat; i++) {
            System.out.println(source);
        }    
    }
}
