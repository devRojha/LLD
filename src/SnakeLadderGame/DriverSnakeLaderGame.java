package SnakeLadderGame;

import SnakeLadderGame.Entities.Game;
import SnakeLadderGame.Entities.Person;

import java.util.Scanner;

public class DriverSnakeLaderGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Snake Lader Game");

        System.out.println("Enter the number of Player : ");
        int noOfPlayers = sc.nextInt();

        System.out.println("Enter the number of Dice Count : ");
        int diceCount = sc.nextInt();

        System.out.println("Enter Dimension : ");
        int dimension = sc.nextInt();

        Game playGame = new Game(diceCount, dimension);

        // adding players;
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Enter Name of Player" + (i+1) + " : ");
            String Name = sc.next();
            Person p = new Person(Name);
            playGame.addPlayer(p);
        }

        playGame.launchGame();

        System.out.println("Thanks for playing!");
    }
}
