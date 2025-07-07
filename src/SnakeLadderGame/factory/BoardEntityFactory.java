package SnakeLadderGame.factory;


import SnakeLadderGame.Entities.BoardEntity;
import SnakeLadderGame.Entities.Ladder;
import SnakeLadderGame.Entities.Snake;

public class BoardEntityFactory {
    public static BoardEntity createBoardEntity(BoardEntityEnum entityEnum, int start, int end) {
        switch (entityEnum) {
            case SNAKE -> {
                return new Snake(start, end);
            }
            case LADDER -> {
                return new Ladder(start, end);
            }
        }
        System.out.println("Invalid Entity");
        return null;
    }
}
