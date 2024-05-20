package Die;

import java.util.Random;

public class Die {
    String name;
    static int noOfDie = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;
    Die() {
        noOfDie++;
    }

    Die(String name) {
        this();
        this.name = name + noOfDie;
    }
    final int SIDES = 6;
    void roll(){
        Random r = new Random();
        int no = r.nextInt(SIDES);
        this.setNumber(no+1);
    }
}