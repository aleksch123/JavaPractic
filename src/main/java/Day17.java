import java.util.Arrays;
import java.util.List;

public class Day17 {

    private static String unitsStr = "один два три четыре пять шесть семь восемь девять десять одиннадцать двенадцать тринадцать четырнадцать пятнадцать шестнадцать семнадцать восемнадцать девятнадцать";
    private static String decimalscStr = "двадцать тридцать сорок пятьдесят шестьдесят семдесят восемьдесят девяносто";
    private static String hundredsStr = "сто двести триста четыреста пятьсот шестьсот семьсот восемьсот девятьсот";


    public static void main(String[] args) throws Exception {

        System.out.println(convertNum(10000));
    }

    private static String convertNum(int value) {
        String result = "";
        if (value!=0){
        if (value / 1000000 > 0) result = result + convertNumToStr(value / 1000000, "million");
        value = value - value / 1000000 * 1000000;
        if (value / 1000 > 0) result = result + convertNumToStr(value / 1000, "thousand");
        value = value - value / 1000 * 1000;
        if (value > 0) result = result + convertNumToStr(value, "hundred");}
        else{result="ноль";}
        String capResult = result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
        return capResult;
    }

    public static String convertNumToStr(int num, String range) {
        String millionTail = "миллион";
        String thousandTail = "тысяч";
        String tailWord = "";
        String hundredsWord = "";
        String decimalWord = "";
        String unitWord = "";
        List<String> hundredWords;
        List<String> decimalWords;
        List<String> unitWords;
        hundredWords = Arrays.asList(hundredsStr.split(" "));
        decimalWords = Arrays.asList(decimalscStr.split(" "));
        unitWords = Arrays.asList(unitsStr.split(" "));
        int hundredsNum = num / 100;
        if (hundredsNum > 0) {
            hundredsWord = hundredWords.get(hundredsNum - 1);
        }
        int decimalNum = (num - hundredsNum * 100) / 10;
        if (decimalNum > 1) {
            decimalWord = decimalWords.get(decimalNum - 2);
        } else if (decimalNum == 1) {
            decimalWord = unitWords.get((num - hundredsNum * 100) - 1);
        }
        int unitNum = num - hundredsNum * 100 - decimalNum * 10;
        if ((decimalNum != 1) && (unitNum != 0)) {
            if (unitNum > 1) {
                unitWord = unitWords.get((num - hundredsNum * 100 - decimalNum * 10) - 1);
            } else {
                if ((range == "million") || (range == "hundred")) {
                    unitWord = "один";
                } else {
                    unitWord = "одна";
                }
            }
        }
        if (unitNum == 1) {
            if (range == "million") {
                tailWord = millionTail;
            }
            if (range == "thousand") {
                tailWord = thousandTail + "а";
            }
        } else if (unitNum > 1 && unitNum < 5) {
            if (range == "million") {
                tailWord = millionTail + "а";
            }
            if (range == "thousand") {
                tailWord = thousandTail + "и";
            }
        } else {
            if (range == "million") {
                tailWord = millionTail + "ов";
            }
            if (range == "thousand") {
                tailWord = thousandTail;
            }


        }


        return hundredsWord + " " + decimalWord + " " + unitWord + " " + tailWord + " ";
    }

}




