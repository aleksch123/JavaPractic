package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Aleks",500));
        employees.add(new Employee(2,"Roma",100));
        employees.add(new Employee(3,"Sveta",3000));
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }



}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmmploee) {
        if (this.salary==anotherEmmploee.salary) return 0;
        else if(this.salary<anotherEmmploee.salary) return -1;
        else return 1;
    }
}
