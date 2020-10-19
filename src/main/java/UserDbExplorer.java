import helpers.JsonHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDbExplorer {

    public static void main(String[] args) throws Exception {

        JsonHelper jh = new JsonHelper();

        List<String> usersSpecificCountry = jh.getUsersFromCountry("Russia");
        List<String> usersOlder = jh.getUsersOlderThen(20);
        List<String> usersYounger = jh.getUsersYoungerThen(40);
        List<String> usersSpecificAge = jh.getUsersAgeIs(29);
        List<String> adultUsers = jh.getAdultUsers();
        List<String> teenUsers = jh.getTeenUsers();
        List<String> invalidUsers = jh.getInvalidUsers();




    }




}
