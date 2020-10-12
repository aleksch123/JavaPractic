import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import static com.jayway.jsonpath.JsonPath.read;

public class day1ex2 {


    public static void main(String[] args) throws IOException {


        day1ex1.printWelcome(getTimeViaApi(), "Алексей");


    }


    public static LocalTime getTimeViaApi() throws IOException {

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm");
        CloseableHttpClient httpClient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
        HttpGet get = new HttpGet("http://worldtimeapi.org/api/timezone/Europe/Moscow");
        HttpResponse response = httpClient.execute(get);
        String json = EntityUtils.toString(response.getEntity());
        int unixTime = read(json, "$.unixtime");
        Date time = new Date((long) unixTime * 1000);
        return LocalTime.parse(formatForDateNow.format(time));
    }


}
