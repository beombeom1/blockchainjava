package Die;

import java.util.Random;

public class Die {
    String name;
    static int numOfDie = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;
    Die(){
        this.name = name;
    }
    final int SIDES = 6;
    void roll(){
        Random r = new Random();
        int no = r.nextInt(SIDES);
        this.setNumber(no+1);
    };
}