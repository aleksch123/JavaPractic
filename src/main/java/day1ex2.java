import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import static com.jayway.jsonpath.JsonPath.read;

public class day1ex2 {


    public static void main(String[] args) throws Exception {


        day1ex1.printWelcome(getTimeViaApi(), "Алексей");


    }


    public static int getTimeViaApi() throws IOException, ParseException {

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm");
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://worldtimeapi.org/api/timezone/Europe/Moscow");
        HttpResponse response = httpClient.execute(get);
        String json = EntityUtils.toString(response.getEntity());
        String dateTime = read(json, "$.datetime");
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");
        Date date = parser.parse(dateTime);
        SimpleDateFormat formatter = new SimpleDateFormat("HH");

        return Integer.parseInt(formatter.format(date));

    }


}
