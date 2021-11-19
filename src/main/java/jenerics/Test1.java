package jenerics;

public class Test1 {

    public static void main(String[] args) {
        ParamClass<String> someClass = new ParamClass<>("test");
        System.out.println(someClass);
        ParamClass<Integer> intClass = new ParamClass<>(125);
        System.out.println(intClass);

        Pairs<String,Integer> pairs = new Pairs<>("Hello",123);
        System.out.println(pairs.getFirstValue());
        System.out.println(pairs.getSecondValue());

    }


}


 class ParamClass<T>{

    private T value;
    public ParamClass(T value){
        this.value=value;
    }
    public String toString(){
        return "({"+value+"})";
    }

 }

class Pairs<V1,V2>{
    private V1 value1;
    private V2 value2;
    public Pairs(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }


}
