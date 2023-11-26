package HW4;

public class Data3ElementException extends Exception{
    public Data3ElementException() {
        super("Год в дате рождения должн быть числом от 1850 до 2023");
    }
    
}
