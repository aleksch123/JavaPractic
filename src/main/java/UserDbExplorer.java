import helpers.JsonHelper;

import java.util.List;



public class UserDbExplorer {

    public static void main(String[] args) throws Exception {

        JsonHelper jh = new JsonHelper();

        List<String> usersSpecificCountry = jh.getUsersFromCountry("");
        List<String> usersOlder = jh.getUsersOlderThen(10);
        List<String> usersYounger = jh.getUsersYoungerThen(10);
        List<String> usersSpecificAge = jh.getUsersAgeIs(10);
        List<String> adultUsers = jh.getAdultUsers();
        List<String> teenUsers = jh.getTeenUsers();




    }




}
