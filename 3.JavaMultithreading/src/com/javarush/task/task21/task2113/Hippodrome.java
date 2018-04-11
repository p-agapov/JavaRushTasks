package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse: horses) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());

        game.getHorses().add(new Horse("Spirit", 3, 0));
        game.getHorses().add(new Horse("Sugar", 3, 0));
        game.getHorses().add(new Horse("Pirate", 3, 0));

        game.run();

        game.printWinner();
    }
}
