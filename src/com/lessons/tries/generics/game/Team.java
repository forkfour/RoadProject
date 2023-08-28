package com.lessons.tries.generics.game;

import java.util.ArrayList;
import java.util.Random;

public class Team <T extends Participant> {
    private ArrayList<T> members = new ArrayList<>();
    private String name;
    public Team(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addMember(T member) {
        System.out.printf("In team %s added new member %s\n", name, member.getName());
        members.add(member);
    }
    public void printMembers(){
        System.out.printf("Team %s members:\n", name);
        for (T a : members){
            System.out.println(a.getName());
        }
    }
    public void playGame(Team<T> team){
        String winnerTeam;
        Random random = new Random();
        int i = random.nextInt(2);
        winnerTeam = i == 0 ? team.name : this.name;
        System.out.printf("The winner is %s team! Congratulations!", winnerTeam);
    }
}
