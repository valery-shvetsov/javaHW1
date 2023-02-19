public class hw16 {
    
    private static boolean isPositive(int x) {
        if (x>0){;
            return true;
        }else{return false;
        }    
    }

    public static void main(String[] args) {

        boolean result1=isPositive(1);
        //System.out.println(result);
        System.out.printf( "результат = %s", result1);
        System.out.println();
        boolean result2=isPositive(-1);
        System.out.printf( "результат = %s", result2);
    }    

}


