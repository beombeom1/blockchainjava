package Die;

public class MyDie {
    public static void main(String[] args) {
        Die d1 = new Die();
        d1.name = "1번";
        d1.roll();
        System.out.println(d1.name);
        System.out.println(d1.getNumber());
    }
}