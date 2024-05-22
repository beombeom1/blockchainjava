package Die;
import java.util.Random;

public class WDie implements IDie{
    private int number;
    @Override
    public int roll() {
        Random r = new Random();
        int number = r.nextInt(6);
        number += 1;
        this.number = number;
        return number;
    }

    @Override
    public int getValue() {
        return number;
    }
}
