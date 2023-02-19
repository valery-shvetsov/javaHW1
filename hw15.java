/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, 
 * в противном случае – false.
 */

// проверить, что сумма a и b лежит между 10 и 20
//    return false;



public class hw15 {
  
        private static boolean isSumBetween10And20(int a, int b) {
            int sum=a+b;
            if (sum<=20 && sum>=10){;
                return true;
            }else{return false;
            }    
        }

        public static void main(String[] args) {

            boolean result1=isSumBetween10And20(5,15);
            //System.out.println(result);
            System.out.printf( "результат = %s", result1);
            System.out.println();
            boolean result2=isSumBetween10And20(7,15);
            System.out.printf( "результат = %s", result2);
        }    
    
}

