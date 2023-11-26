package HW4;

public class Data2ElementException extends Exception{
    public Data2ElementException() {
        super("Месяцы в дате рождения должны быть числом от 1 до 12");
    }
    
}
