package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Aleks","Ch",500));
        employees.add(new Employee(2,"Roma","D",100));
        employees.add(new Employee(3,"Sveta","P",3000));

        Collections.sort(employees, new IdComporator());
    }




}

class Employee {
    int id;
    String name;
    String surname;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    int salary;

    public Employee(int id, String name,String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

}

 class IdComporator implements Comparator<Employee> {

     @Override
     public int compare(Employee emp1, Employee emp2) {
         if (emp1.id==emp2.id) return 0;
         else if(emp1.id<emp2.id) return -1;
         else return 1;
     }
 }

class SalaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.salary==emp2.salary) return 0;
        else if(emp1.salary<emp2.salary) return -1;
        else return 1;
    }

    class NameComporator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }

}
