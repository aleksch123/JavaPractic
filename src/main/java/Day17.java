import java.util.Arrays;
import java.util.List;

public class Day17 {

    private static String unitsStr = "один два три четыре пять шесть семь восемь девять десять одиннадцать двенадцать тринадцать четырнадцать пятнадцать шестнадцать семнадцать восемнадцать девятнадцать";
    private static String decimalscStr = "двадцать тридцать сорок пятьдесят шестьдесят семдесят восемьдесят девяносто";
    private static String hundredsStr = "сто двести триста четыреста пятьсот шестьсот семьсот восемьсот девятьсот";


    public static void main(String[] args) throws Exception {

        System.out.println(convertNum(9));
        System.out.println(convertNum(1340015));
        System.out.println(convertNum(999999));
        System.out.println(convertNum(123));
        System.out.println(convertNum(1000));
    }

    private static String convertNum(int value) {

        String result = "";
        String catTail = "";
        int lastChar = value % 10;
        if (value != 0) {
            if (value / 1000000 > 0) result += convertNumToStr(value / 1000000, "million");
            value -= value / 1000000 * 1000000;
            if (value / 1000 > 0) result = result + convertNumToStr(value / 1000, "thousand");
            if (result.equals(" тысяча ")) {
                result = "Одна" + result;
            }
            value -= value / 1000 * 1000;
            if (value > 0) result += convertNumToStr(value, "hundred");
        } else {
            result = "ноль";
        }
        if (lastChar == 0 || lastChar > 4) catTail = "котиков";
        else if (lastChar == 1) catTail = "котик";
        else if (lastChar > 1 && lastChar < 4) catTail = "котика";
        String capResult = result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase() + catTail;
        return capResult.trim();
    }

    public static String convertNumToStr(int num, String range) {
        String millionTail = " миллион";
        String thousandTail = " тысяч";
        String tailWord = "";
        String hundredsWord = "";
        String decimalWord = "";
        String unitWord = "";
        String result = "";
        List<String> hundredWords;
        List<String> decimalWords;
        List<String> unitWords;
        hundredWords = Arrays.asList(hundredsStr.split(" "));
        decimalWords = Arrays.asList(decimalscStr.split(" "));
        unitWords = Arrays.asList(unitsStr.split(" "));
        int unitNum = 0;
        int hundredsNum = num / 100;
        if (hundredsNum > 0) {
            result += hundredWords.get(hundredsNum - 1) + " ";
        }
        int decimalNum = (num - hundredsNum * 100) / 10;
        if (decimalNum > 1) {
            result += decimalWords.get(decimalNum - 2) + " ";
        } else if (decimalNum == 1) {
            result += unitWords.get((num - hundredsNum * 100) - 1);
        }
        if (decimalNum > 1) {
            unitNum = num - hundredsNum * 100 - decimalNum * 10;
        } else {
            unitNum = num - hundredsNum * 100;
        }
        if ((decimalNum != 1) && (unitNum != 0)) {
            if (unitNum > 2) {
                unitWord = unitWords.get((num - hundredsNum * 100 - decimalNum * 10) - 1);
            } else if (unitNum == 2) {
                if ((range == "million") || (range == "hundred")) {
                    unitWord = "два";
                } else {
                    unitWord = "две";
                }
            } else {
                if ((range == "million") || (range == "hundred")) {
                    unitWord = "один";
                } else {
                    if (hundredsNum != 0 && decimalNum != 0) unitWord = "одна";
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

        return result + unitWord + tailWord + " ";
    }

}




