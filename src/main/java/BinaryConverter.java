public class BinaryConverter {

    public static void main(String[] args) throws Exception {


            System.out.println(convertToBinary(16));



    }

    private static String convertToBinary(int decimal) {
        String binary = "";
        do {
            if (decimal % 2 == 0) binary = "0"+binary;
            else binary = binary = "1"+binary;
            decimal = decimal / 2;
        }while (decimal!=0);
        return binary;
    }

}


