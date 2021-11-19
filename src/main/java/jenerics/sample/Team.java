package jenerics.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("В команду "+name+" добавлен участник под именем : "+participant.getName());
    }
    public void playWith(Team<T> team){
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0) System.out.println("Победила команда "+this.name);
        else System.out.println("Победила команда "+team.name);
    }
}
