import java.util.Scanner;

public class hw18 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();
        iScanner.close();  
        isLeapYear(year);
        boolean result=isLeapYear(year);
        System.out.println(result);
        
    }        
    private static boolean isLeapYear(int yearf) {
        int resultf=yearf%4;
        if (resultf == 0) {
            return true;
            }else{return false;
        }         
    }
}    

