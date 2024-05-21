package sec09;

public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.whoami();
        v.move();
    }
}
