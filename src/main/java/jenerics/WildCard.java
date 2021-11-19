package jenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("fff");
        strList.add("vvvv");
        strList.add("ddd");
        showList(strList);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        showList(intList);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(3.15);
        doubles.add(3.15);
        doubles.add(3.16);
        System.out.println(summ(doubles));
    }


    static void showList (List<?> list){
        System.out.println(list);
    }
    public static double summ(ArrayList<? extends Number> list){
        double summ = 0;
        for (Number n:list ) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
