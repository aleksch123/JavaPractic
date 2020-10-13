import java.io.IOException;
import java.time.LocalTime;
import java.util.Calendar;

public class day1ex1 {

    public static void main(String[] args) throws Exception {


        
        printWelcome(getSystemTime(), "Алексей");


    }

    public static void printWelcome(int now, String userName) throws Exception {

        if (now >= 0 && now <= 4) {
            System.out.println("Доброй ночи, " + userName);
        }
        else if (now >= 5 && now <= 9) {
            System.out.println("Доброе утро, " + userName);
        }
        else if (now >= 10 && now <= 16) {
            System.out.println("Добрый день, " + userName);
        }
        else if (now >= 17 && now <= 23) {
            System.out.println("Добрый вечер, " + userName);
        }
        else{
            throw new Exception("Время "+now+" вне указанных рамок");
        }
    }




    public static int getSystemTime() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        return hour;
    }


}
