package com.geekbrains.lesson1.howework.obstacle;

import com.geekbrains.lesson1.howework.participant.Participant;

public class River implements Obstacle {

    private final int width;

    public River(int width) {
        this.width = width;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        return participant.swimDistance() >= this.width;
    }
}
