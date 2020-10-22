public class BinaryConverter {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 100; i++) {

            System.out.println(convertToBinary(i));
        }


    }

    private static String convertToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            if (decimal % 2 == 0) binary = binary + "0";
            else binary = binary + "1";
            decimal = decimal / 2;
        }
        return binary;
    }

}


