//Необходимо написать проект, для розыгрыша в магазине игрушек. 
//Функционал должен содержать добавление новых игрушек и задания веса для выпадения игрушек.
// Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
// Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
// Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
// Организовать общую очередь
// Вызвать Get 10 раз и записать результат в файл

 package Raffle4;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static final String TEXT_RED = "\u001B[31m";
        public static final String TEXT_BLACK = "\u001B[30m";
        public static final String TEXT_GREEN = "\u001B[32m";
        public static final String TEXT_BLUE = "\u001B[34m";
        public static final String TEXT_RESET = "\u001B[0m";
        public static final String TEXT_PURPLE = "\u001B[35m";
        public static final String TEXT_CYAN = "\u001B[36m";
        public static final String TEXT_YELLOW = "\u001B[33m";
        public static final String TEXT_WHITE = "\u001B[37m";

        public static void main(String[] args) {
                String[] toyName = new String[] { "bear", "yula", "ball", "car", "doll", "boardGame", "gun", "bike",
                                "monopoly", "bunny"};
                int arraysize = 10;
                String action;
                ArrayList<Toy> toys = new ArrayList<Toy>();
                String[] toysStr  = new String[arraysize];
                int[] toyWeight = new int[] { 2, 2, 1, 3, 1, 1, 2, 8, 1, 1};
                int basketWeight = 0;
                int idlast=arraysize;
                Random rnd = new Random();
                int prizeNumber;
                int addToy;
                
                for (int i = 0; i <= arraysize - 1; i++) {
//                        Toy toy=new Toy(i+1, toyName[i], toyWeight[i]);
                        toys.add(new Toy(i+1, toyName[i], toyWeight[i]));
//                                toys.add(toy);
                        basketWeight = basketWeight + toyWeight[i];
                }
                System.out.println(toys);
                Basket basket = new Basket(basketWeight);
                boolean emptyBasket = true;
                Scanner iScanner = new Scanner(System.in);

                while (emptyBasket) {
                        System.out.println(basket);
//                        action = iScanner.next();
//                        iScanner.next();  
                        System.out.println("Просмотр корзины с призами");
                        for (int i = 0; i < toys.size(); i++) {
                                System.out.printf("%d ", i + 1);
                                System.out.println(toys.get(i));
                        }
//                        iScanner.next();  
                        // розыгыш приза
                        prizeNumber=rnd.nextInt(1,arraysize);
                        System.out.printf(TEXT_GREEN + "Приз");
                        System.out.println();
                        System.out.println(toys.get(prizeNumber)+ TEXT_RESET);
                        toys.remove(prizeNumber);

                        // for (int i = 0; i < toys.size(); i++) {
                        //         System.out.printf("%d ", i + 1);
                        //         System.out.println(toys.get(i));
                        // }
                        // добавление игрушки в корзину
                        System.out.printf(TEXT_YELLOW + "Добавляем игрушку в корзину" );
                        System.out.println();
                        idlast=idlast+1;
                        addToy=rnd.nextInt(10);
                        toys.add(new Toy(idlast, toyName[addToy], toyWeight[addToy]));
                        System.out.println(toys.get(arraysize-1)+ TEXT_RESET);

                        try(FileWriter writer = new FileWriter("Raffle4\\result.txt", true))
                    {
                       // запись всей строки
                        writer.write("Приз выдан, в корзину добавлена игрушка");
                        // запись по символам
                        writer.append('\n');   
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println("Ошибка записи");
//                        System.out.println(ex.getMessage());
                    } 

                        for (int i = 0; i < toys.size(); i++) {
//                                System.out.printf("%d ", i + 1);
//                                System.out.println(toys.get(i));
                                toysStr[i]=toys.get(i).toString();
//                                System.out.println(toysStr[i]);

                    try(FileWriter writer = new FileWriter("Raffle4\\result.txt", true))
                    {
                       // запись всей строки
                        writer.write(toysStr[i]);
                        // запись по символам
                        writer.append('\n');   
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println("Ошибка записи");
//                        System.out.println(ex.getMessage());
                    } 

                        }
                        System.out.println(TEXT_PURPLE + "Выберите действие");
                        System.out.println("1-Продолжить розыгрыш призов");
                        System.out.println("2-Выход" );
                        System.out.printf("Введите номер действия: "+ TEXT_RESET);

                        action = iScanner.next();
                        iScanner.nextLine();
                        int actionInt = Integer.parseInt(action);
                        System.out.println(actionInt);
                        if (actionInt == 1) {
                                System.out.println("Продолжаем розыгрыш");
                                // for (int i = 0; i < toys.size(); i++) {
                                //         System.out.printf("%d ", i + 1);
                                //         System.out.println(toys.get(i));
                                 } else {   
                                        System.exit(0);
                                // } else {
                                //         System.out.printf("Вы ввели неправильный номер действия: ");
                                //         System.exit(0);
                                 }        
                        }     

//                        iScanner.next();
                        emptyBasket = basket.isEmpty();
                
                iScanner.close();
        }
}
