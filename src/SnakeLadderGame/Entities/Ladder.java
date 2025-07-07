package SnakeLadderGame.Entities;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounteredMessage() {
        return "Encountered a ladder";
    }
}
