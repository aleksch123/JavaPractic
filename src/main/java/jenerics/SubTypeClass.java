package jenerics;

public class SubTypeClass {

    public static void main(String[] args) {
        Info<Integer> info = new Info<>(1);
        Info<Double> info1 = new Info<>(3.14);
        //Info<String> info1 = new Info<>("ddd"); //compilation failed
    }
}


class Info<T extends Number>{

    private T value;
    public Info (T value){
        this.value=value;
    }
    public String toString(){
        return "({"+value+"})";
    }
}
