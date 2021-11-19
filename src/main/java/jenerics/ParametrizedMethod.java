package jenerics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(10);
        intList.add(123);
        System.out.println(GetMethod.getSecondElement(intList));

        ArrayList<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        System.out.println(GetMethod.getSecondElement(strList));

    }


}

 class GetMethod{

    public static <T> T getSecondElement(ArrayList<T> al){

        return al.get(1);

    }
 }
