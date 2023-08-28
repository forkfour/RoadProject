package com.lessons.tries.generics.game;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Andrew", 12);
        Schoolar schoolar2 = new Schoolar("Mary", 13);
        Schoolar schoolar3 = new Schoolar("Peter", 15);
        Schoolar schoolar4 = new Schoolar("Jane", 14);
        Student student1 = new Student("Gary", 22);
        Student student2 = new Student("Lois", 18);
        Adult adult1 = new Adult("Ben", 32);
        Adult adult2 = new Adult("Carry", 50);

        Team<Schoolar> schoolarTeam1 = new Team<>("Gooses");
        Team<Schoolar> schoolarTeam2 = new Team<>("Turkeys");
        Team<Student> studentTeam1 = new Team<>("Chickens");
        Team<Adult> adultTeam1 = new Team<>("Peppers");
        schoolarTeam1.addMember(schoolar1);
        schoolarTeam1.addMember(schoolar2);
        schoolarTeam2.addMember(schoolar3);
        schoolarTeam2.addMember(schoolar4);
        studentTeam1.addMember(student1);
        studentTeam1.addMember(student2);
        adultTeam1.addMember(adult1);
        adultTeam1.addMember(adult2);

        schoolarTeam1.printMembers();
        schoolarTeam2.printMembers();
        schoolarTeam1.playGame(schoolarTeam2);
    }
}
