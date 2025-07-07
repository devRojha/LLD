package SnakeLadderGame.Entities;

import SnakeLadderGame.Services.RandomNumberGenerator;
import SnakeLadderGame.factory.BoardEntityEnum;
import SnakeLadderGame.factory.BoardEntityFactory;

import java.util.HashMap;

public class Board {
    int size;

    HashMap<Integer, BoardEntity> cells;

   Board(int size) {
       this.size = size;
       this.cells = new HashMap<>();

       int dimension = (int) Math.sqrt(size);

       // number of snakes and ladder is equal to dimension;
       for (int i = 0; i < dimension; i++) {

           // create Snakes
           int start = 2, end = size - 1;
           int snakeStart = RandomNumberGenerator.getRandomNumber(start, end);
           int snakeEnd = RandomNumberGenerator.getRandomNumber(start, snakeStart - 1);
           if (!isSnakeOrLadder(snakeStart)) {
              this.cells.put(snakeStart, BoardEntityFactory.createBoardEntity(BoardEntityEnum.SNAKE, snakeStart, snakeEnd));
           }

           // create Ladders
           start = 1;
           end = size;
           int ladderStart = RandomNumberGenerator.getRandomNumber(start, end);
           int ladderEnd = RandomNumberGenerator.getRandomNumber(ladderStart + 1, end);

           if (!isSnakeOrLadder(ladderStart)) {
                this.cells.put(ladderStart, BoardEntityFactory.createBoardEntity(BoardEntityEnum.LADDER, ladderStart, ladderEnd));
           }
       }


   }

   public boolean isSnakeOrLadder( int index ) {
        if (this.cells.containsKey(index)) {
            return true;
        }
        return false;
   }
}
