package Casting;


import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;

import java.util.*;

public class Test2{
    public static void main(String[] args) {

      String str = "as345hgjhgj67fjhf999jfh87nnmn457";
      List<String> list= new ArrayList<>(Arrays.asList(str.split("\\D")));
      list.removeAll(Collections.singleton(""));
      int maxInt=0;
        for (String s:list) {
            int curInt = Integer.parseInt(s);
            if (curInt>maxInt) maxInt=curInt;
        }

        System.out.println(maxInt);


    }



}
