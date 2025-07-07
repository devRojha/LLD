package SnakeLadderGame.Services;

public class DiceValue {
    public static int getDiceValue(int diceCount) {
        int diceValue = 0;
        for (int i = 0; i < diceCount; i++) {
            diceValue += RandomNumberGenerator.getRandomNumber(1, 6);
        }
        return diceValue;
    }
}
