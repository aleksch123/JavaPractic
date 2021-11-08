package factory;

public class Programm {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactoryByString("python");
        Developer developer = developerFactory.createDeveloper();
        developer.wrightCode();
    }
    static DeveloperFactory createFactoryByString(String str) {
        if (str.equals("java")) {
            return new JavaDeveloperFactory();
        } else if (str.equals("python")) {
            return new PythonDeveloperFactory();
        }
        return null;
    }
}
