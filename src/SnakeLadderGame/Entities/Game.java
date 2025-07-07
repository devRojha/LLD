package SnakeLadderGame.Entities;

import SnakeLadderGame.Services.DiceValue;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    int diceCount;
    int dimension;

    int size;

    Board board;

    Queue<Person> players;
    Queue<Person> winners;

    public Game(int diceCount, int dimension) {
        this.diceCount = diceCount;
        this.dimension = dimension;
        this.size = dimension * dimension;
        this.board = new Board(size);
        this.players = new LinkedList<>();
        this.winners = new LinkedList<>();
    }

    public void launchGame() {
        while (players.size() > 1) {
            Person currentPerson = this.players.poll();
            System.out.println(currentPerson.getUserName() + "'s current position is : " +  currentPerson.getPosition());

//            System.out.println("Enter Any Number Key for roll the dices");
//            Scanner keyboard = new Scanner(System.in);
//            int dummyValue = keyboard.nextInt();

            // roll the dice and move to the next Location
            int diceRollValue = DiceValue.getDiceValue(diceCount);
            System.out.println("You get : " +  diceRollValue);

            // get nextPosition
            int nextPosition = currentPerson.getPosition() + diceRollValue;

            // check if encounter snake or ladder i.e board entity
            if((nextPosition != size) && (this.board.isSnakeOrLadder(nextPosition))) {
                BoardEntity boardEntity = this.board.cells.get(nextPosition);
                System.out.println(boardEntity.getEncounteredMessage());
                nextPosition = boardEntity.getEnd();
            }

            // update positon
            if (nextPosition == size) {
                // player win
                winners.add(currentPerson);
            }
            else if (nextPosition > size) {
                // invalid move
                players.add(currentPerson);
            }
            else {
                // update position and player again added into queue
                currentPerson.setPosition(nextPosition);
                players.add(currentPerson);
            }
        }
        // winner list
        System.out.println("Winner List :");
        int rank = 1;
        while (!winners.isEmpty()) {
            Person currentPerson = this.winners.poll();
            System.out.print(rank);
            System.out.println(" : " + currentPerson.getUserName());
            rank++;
        }

        // loser list
        Person currentPerson = this.players.poll();
        System.out.println("Looser : " + currentPerson.getUserName());
    }

    public void addPlayer(Person person) {
        this.players.add(person);
    }

}
