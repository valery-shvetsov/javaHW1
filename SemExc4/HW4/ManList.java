package HW4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManList {
    public static void main(String[] args) throws IOException {
        //String profile="Stepanov Igor Andreevich 20.08.1999 81236547898 f";

        System.out.println("Введите данные профиля в виде :Фамилия Имя Отчество ЧЧ.ММ.ГГГГ 89876543212 m");
        Scanner scanner = new Scanner (System.in) ;
        String profile = scanner.nextLine();
        scanner.close(); 

        String[] profileLine = profile.split(" ");

        String surname=profileLine[0];

        String birthdate=profileLine[3];


        try {
            profileLength(profileLine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            stringCheck(profileLine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String[] date = birthdate.split(Pattern.quote("."));

        try {
            dateCheck(date, birthdate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //System.out.println(profile);

        

        String profilen=profile+"\n";
        String filename=surname+".txt";
        //System.out.println(filename);

        File file = new File(filename);
        file.createNewFile();
        Path path = Paths.get(filename);
        //System.out.println(path);
        try {
            Files.write(path, profilen.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Запись произведена");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void profileLength(String[] arr) throws FewLinesException, ToMenyLinesException {
        int length = arr.length;
        if (length <6) {
            throw new FewLinesException();
        }if (length >6) {
            throw new ToMenyLinesException();
        }  
    }

    public static void stringCheck(String[] arr) throws FirstElementException, SecondElementException, ThirdElementException, SixthElementException, FifthElementException, SixthElementMFException {

            if(isAlpha(arr[0])==false){
                throw new FirstElementException();
            }

            if(isAlpha(arr[1])==false){
                throw new SecondElementException();
            }

            if(isAlpha(arr[2])==false){
                throw new ThirdElementException();
            }

            if(isNumeric(arr[4])==false){
                throw new FifthElementException();
            }

            if(isAlpha(arr[5])==false){
                throw new SixthElementException();
            }
            String m=new String("m");
            String f=new String("f");

            if(!arr[5].equals(m)&&!arr[5].equals(f)){                     
                throw new SixthElementMFException();
            }
  
        }
    public static void dateCheck(String[] arr, String birthdate) throws Data1ElementException, Data2ElementException, Data3ElementException, CountPointException {

        int count = birthdate.length() - birthdate.replace(".", "").length();

        if (count!=2) {
            throw new CountPointException();
        }


            if(isNumeric(arr[0])==false){
                throw new Data1ElementException();
            }

            int day= Integer.parseInt(arr[0]);
            //System.out.println(day);
                if (day<=0||day>31){ 
                    throw new Data1ElementException();
            }

            if(isNumeric(arr[1])==false){ 
                throw new Data2ElementException();
            }

            int month= Integer.parseInt(arr[1]);

                if (month<=0||month>12){ 
                    throw new Data2ElementException();
            }

            if(isNumeric(arr[2])==false){ 
                throw new Data3ElementException();
            }
            int year= Integer.parseInt(arr[2]);

                if (year<1850||year>2023){ 
                    throw new Data3ElementException();
            }
    }
  
    public static boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }

    public static boolean isNumeric(String s) {
        return s != null && s.chars().allMatch(Character::isDigit);
    }    

}
