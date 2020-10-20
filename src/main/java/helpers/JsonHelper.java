package helpers;

import java.io.*;
import java.util.*;

import static com.jayway.jsonpath.JsonPath.read;

public class JsonHelper {
    String json;
    int jsonSize;
    Map<String, Integer> rules = new HashMap<>();


    public JsonHelper() {
        json = getJsonFromFile("src/main/resources/users.json");
        List<String> id = read(json, "$.[*].id");
        jsonSize = id.size();
        rules.put("Russia", 18);
        rules.put("USA", 21);
        rules.put("Japan", 20);
        rules.put("Thailand", 20);


        System.out.println(json);
    }

    public List<String> getUsersFromCountry(String target) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < jsonSize; i++) {
            String country = read(json, "$.[" + i + "].county").toString();
            if (country.equals(target))
                users.add(read(json, "$.[" + i + "].name").toString() + " " + read(json, "$.[" + i + "].fname").toString());
        }

        return users;
    }

    public List<String> getUsersOlderThen(int target) {
        List<String> users = getUserListByInt("age",target,">");
        return users;
    }

    public List<String> getUsersYoungerThen(int target) {
        List<String> users = getUserListByInt("age",target,"<");
        return users;
    }

    public List<String> getUsersAgeIs(int target) {
        List<String> users = getUserListByInt("age",target,"=");
        return users;
    }

    public List<String> getAdultUsers() {
        List<String> users = getUserListByBoolean("is_teen",false);
        return users;
    }

    public List<String> getTeenUsers() {
        List<String> users = getUserListByBoolean("is_teen",true);
        return users;
    }

    public List<String> getInvalidUsers() {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < jsonSize; i++) {
            String country = read(json, "$.[" + i + "].county").toString();
            int age = read(json, "$.[" + i + "].age");
            Boolean isteen = read(json, "$.[" + i + "].is_teen");
            Set keys = rules.keySet();
            for (Iterator j = keys.iterator(); j.hasNext(); ) {
                String key = (String) j.next();
                if (country.equals(key)) {
                    if ((age >= rules.get(key) && isteen) || (age < rules.get(key) && !isteen)) {
                        users.add(read(json, "$.[" + i + "].name").toString() + " " + read(json, "$.[" + i + "].fname").toString());
                    }
                }
            }

        }

        return users;
    }

    public List<String> getUserListByInt(String fieldName,int target,String condition) {
        List<String> users = new ArrayList<>();

        for (int i = 0; i < jsonSize; i++) {
            Boolean add=false;
            int result = read(json, "$.[" + i + "]."+fieldName);
            switch (condition) {
                case ">":
                    if (result > target)add=true;
                    break;
                case "<":
                    if (result < target)add=true;
                    break;
                case "=":
                    if (result == target)add=true;
                    break;
            }
            if (add) users.add(read(json, "$.[" + i + "].name").toString() + " " + read(json, "$.[" + i + "].fname").toString());
        }
        return users;
    }

    public List<String> getUserListByBoolean(String fieldName,Boolean condition) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < jsonSize; i++) {
            Boolean result = read(json, "$.[" + i + "]."+fieldName);
            if (condition.equals(result)) users.add(read(json, "$.[" + i + "].name").toString() + " " + read(json, "$.[" + i + "].fname").toString());
        }
        return users;
    }



    private String getJsonFromFile(String path) {
        String line = null;
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

