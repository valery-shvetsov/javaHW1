 /** Найти общий префикс среди слов из одного массива.
     * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
     */

public class hw1_10 {
    public static void main(String[] args) { 
        String[] array = {"aaba", "aab", "aab"};
  
        if (array.length ==0) System.out.println("");

            String prefix = array[0];

        for (String str : array){
            while (str.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isBlank()) 
                System.out.println("");
            }
        }
    System.out.println(prefix);

}
}


