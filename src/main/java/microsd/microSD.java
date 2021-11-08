package microsd;

    public class microSD{
        private String os;
        private String card = "Transcend 16GB Class10";
        public static void writeImage(){
            new microSD().os = "Raspbian";
            System.out.print("OK... ");
        }
    }

