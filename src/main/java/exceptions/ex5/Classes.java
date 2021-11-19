package exceptions.ex5;

public class Classes {

}

class Implementer implements Implementable {
    public void runMe() throws java.io.IOException {}
}
 /*class Implementer1 implements Implementable {
    public void runMe() throws Exception {}
}*/
 class Implementer2 implements Implementable {
    public void runMe() throws java.io.FileNotFoundException {}
}
 class Implementer3 implements Implementable {
    public void runMe() {}
}

