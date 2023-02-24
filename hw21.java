 // 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш

public class hw21 {
    public static void main(String[] args) {
        String source = "абба";
        String result = polindrom(source);
        System.out.println(result);
    }
    
    private static String polindrom(String sourcef) {
        String resultf="палиндром";
        for (int i = 0; i <= sourcef.length()/2; i++) {
            if (sourcef.charAt(i) != sourcef.charAt(sourcef.length()-i-1)) {
                resultf="не палиндром";
            }
        }
        return resultf;
    }


}


