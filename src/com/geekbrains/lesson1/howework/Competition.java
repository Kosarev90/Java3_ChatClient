package com.geekbrains.lesson1.howework;

import com.geekbrains.lesson1.howework.obstacle.Obstacle;
import com.geekbrains.lesson1.howework.participant.Participant;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private Obstacle[] obstacles;
    private Participant[] participants;
    private final String competitionTitle;

    private final List<Participant> lastWinners = new ArrayList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle ...obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant ...participants) {
        this.participants = participants;
    }

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    public void startCompetition() {
        System.out.printf("Начало соревнования %s%n", this.competitionTitle);
        this.lastWinners.clear();

        for (Participant participant : this.participants) {
            boolean success = this.passAllObstacles(participant);
            if (!success) {
                System.out.printf("Участник %s покинул соревнование %%n", participant);
            } else {
                this.lastWinners.add(participant);
            }
        }
    }

    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : this.obstacles) {
            if (!obstacle.passObstacleBy(participant)) {
                return false; // нет смысла дальше проходить
            }
        }
        return true;
    }
}
