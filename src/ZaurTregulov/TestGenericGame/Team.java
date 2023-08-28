package ZaurTregulov.TestGenericGame;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant>{
        private final String name;
        List<T> team = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant){
        System.out.printf("Team %s greeting new participant %s!\n", name, participant.getName());
        team.add(participant);
    }

    public void playGame(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println(i);
        winnerName = (i == 0) ? this.name : team.name;
        System.out.printf("Team %s wins the round!\n", winnerName);
    }
}
