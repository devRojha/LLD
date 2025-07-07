package SnakeLadderGame.Services;

public class RandomNumberGenerator {
    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
