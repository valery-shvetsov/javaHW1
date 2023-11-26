package HW4;

public class Data1ElementException extends Exception{
        public Data1ElementException() {
            super("Дни в дате рождения должны быть числом от 1 до 31");
        }
}
