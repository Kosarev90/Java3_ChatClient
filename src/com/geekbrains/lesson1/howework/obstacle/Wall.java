package com.geekbrains.lesson1.howework.obstacle;

import com.geekbrains.lesson1.howework.participant.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int name) {
        this.height = name;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jumpHeight() >= this.height) {
            System.out.printf("Участник %s успешно перепрыгнул через стену с высотой %d%n", participant, this.height);
            return true;
        } else {
            System.out.printf("Участник %s не смог перепрыгнуть через стену высотой %d%n%n", participant, this.height);
            return false;
        }
    }
}
