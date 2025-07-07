package SnakeLadderGame.Entities;

public class Person {
     String userName;
     int position;

    public Person(String userName) {
        this.userName = userName;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public String getUserName() {
        return userName;
    }

    public void setPosition(int newPosition) {
        this.position = newPosition;
    }

}
