/*Создание интерфейса, который создаёт объект. При этом, выбор того, экземпляр какого класса создавать
  остаётся за классами, которые имплементируют данный интерфейс.*/


package pattern.factory;

public class Client {
    public static void main(String[] args) {
        DeveloperFactory factory = getFactoryBySpec("java");
        Developer developer =factory.createDeveloper();
        developer.wrightCode();
    }

    public static DeveloperFactory getFactoryBySpec(String spec){
        if (spec=="java") return new JavaDeveloperFactory();
        else if (spec=="python") return new PythonDeveloperFactory();
        else return null;
    }
}
