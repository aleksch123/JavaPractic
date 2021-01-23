
public class Test {

    public static void main(String[] args) {
       33333

        String[][][] a = {{{"a", "b", "c"}, {"d", "e", "f"}}, {{"g"}, {"e"}, {"b"}}, {{"y"}}, {{"z", "Q"}, {"f", "c", "s"}}};

        /*System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[3].length);
        System.out.println(a[0][0].length);*/


        for(int i=0;i<a.length;i++){
            System.out.println("___________");
            for(int j=0;j<a[i].length;j++){

                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]);
                    System.out.print(" | ");
                }
                System.out.println();
                //System.out.println("_____________");
            }


        }
    }




}


