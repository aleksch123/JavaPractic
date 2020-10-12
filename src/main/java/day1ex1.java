import java.io.IOException;
import java.time.LocalTime;

public class day1ex1 {

    public static void main(String[] args) throws IOException {


        LocalTime now = LocalTime.now();
        printWelcome(now, "Алексей");


    }

    public static void printWelcome(LocalTime now, String userName) {

        LocalTime startNight = LocalTime.parse("00:00:00");
        LocalTime endNight = LocalTime.parse("04:00:00");
        LocalTime startMorning = LocalTime.parse("05:00:00");
        LocalTime endMorning = LocalTime.parse("09:00:00");
        LocalTime startDay = LocalTime.parse("10:00:00");
        LocalTime endDay = LocalTime.parse("16:00:00");
        LocalTime startEvening = LocalTime.parse("17:00:00");
        LocalTime endEvening = LocalTime.parse("23:00:00");

        if ((now.isAfter(startNight) && now.isBefore(endNight)) || now.equals(startNight) || now.equals(endNight))
            System.out.println("Доброй ночи, " + userName);
        if ((now.isAfter(startMorning) && now.isBefore(endMorning)) || now.equals(startMorning) || now.equals(endMorning))
            System.out.println("Доброе утро, " + userName);
        if ((now.isAfter(startDay) && now.isBefore(endDay)) || now.equals(startDay) || now.equals(endDay))
            System.out.println("Добрый день, " + userName);
        if ((now.isAfter(startEvening) && now.isBefore(endEvening)) || now.equals(startEvening) || now.equals(endEvening))
            System.out.println("Добрый вечер, " + userName);


    }


}
