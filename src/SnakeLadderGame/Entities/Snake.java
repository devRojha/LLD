package SnakeLadderGame.Entities;

public class Snake extends BoardEntity {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounteredMessage() {
        return "Encountered a snake";
    }
}

