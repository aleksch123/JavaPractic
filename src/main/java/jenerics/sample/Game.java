package jenerics.sample;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",12);
        Schoolar schoolar2 = new Schoolar("Nick",13);
        Schoolar schoolar3 = new Schoolar("Masha",12);
        Schoolar schoolar4 = new Schoolar("Ura",13);

        Student student1 = new Student("Fedor",20);
        Student student2 = new Student("Vasya",21);

        Employee employee1 = new Employee("Andrey",30);
        Employee employee2 = new Employee("Max",31);

        Team<Schoolar> schoolarTeam1 = new Team<>("Drocomy");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Zadroti");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        //schoolarTeam.addNewParticipant(student1); //
        Team<Student> studentTeam = new Team<>("Alkashi");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam1.playWith(schoolarTeam2);

      //  schoolarTeam1.playWith(employeeTeam);


    }



}
