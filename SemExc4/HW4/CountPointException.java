package HW4;

public class CountPointException extends Exception{
    public CountPointException() {
        super("Дни, месяцы и год в дате рождения должны быть разделены точками в виде ДД.ММ.ГГГГ");
    }
    
}
