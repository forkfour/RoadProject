package ZaurTregulov.TestGenericGame;


public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Irina", 12);
        Schoolar schoolar3 = new Schoolar("Ikarus", 14);
        Schoolar schoolar4 = new Schoolar("Irving", 16);
        Student student1 = new Student("Petr", 20);
        Student student2 = new Student("Petunia", 18);
        Adult adult1 = new Adult("Nick", 40);
        Adult adult2 = new Adult("Nataly", 37);

        Team <Schoolar>schoolarTeam1 = new Team<>("Asses of Fire");
        Team <Schoolar>schoolarTeam2 = new Team<>("Canadians");
        Team <Student>studentTeam = new Team<>("Integrallers");
        Team <Adult>adultTeam = new Team<>("Lost in Space");
        schoolarTeam1.addParticipant(schoolar1);
        schoolarTeam1.addParticipant(schoolar2);
        schoolarTeam2.addParticipant(schoolar3);
        schoolarTeam2.addParticipant(schoolar4);
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);
        adultTeam.addParticipant(adult1);
        adultTeam.addParticipant(adult2);
        
        schoolarTeam1.playGame(schoolarTeam2);

    }
}
