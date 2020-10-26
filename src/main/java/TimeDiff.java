import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeDiff {


    public static void main(String[] args) throws Exception {

        System.out.println(timeDiff("23:00", "04:00"));

    }

    private static String timeDiff(String date1, String date2) throws ParseException {

        long difference = 0;

        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date dateOne = format.parse(date1);
        Date dateTwo = format.parse(date2);
        TimeZone zone = TimeZone.getDefault();

        if (dateOne.getTime() < dateTwo.getTime()) {
            difference = dateTwo.getTime() - dateOne.getTime();
        } else {
            dateTwo.setTime(dateTwo.getTime() + (24 * 60 * 60 * 1000));
            difference = (dateTwo.getTime() - dateOne.getTime());
        }

        long offset = zone.getOffset(difference);
        Date diffDate = new Date(difference - offset);

        return format.format(diffDate);


    }

}




