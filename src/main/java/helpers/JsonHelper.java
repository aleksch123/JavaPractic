package helpers;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class JsonHelper {
    String json;

    public JsonHelper(){
        json=getJsonFromFile("src/main/resources/users.json");
        System.out.println(json);
    }

    public  List<String> getUsersFromCountry(String s){

        return null;
    }

    public  List<String> getUsersOlderThen(int age) {
        return null;
    }

    public  List<String> getUsersYoungerThen(int age) {
        return null;
    }

    public  List<String> getUsersAgeIs(int age) {
        return null;
    }

    public List<String> getAdultUsers() {
        return null;
    }
    public  List<String> getTeenUsers() {
        return null;
    }

    private  String getJsonFromFile(String path){
        String line=null;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            line = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;

    }


}

