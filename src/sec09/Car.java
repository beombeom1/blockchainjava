package sec09;

public class Car extends Vehicle{
    String name = "car";

    @Override
    void whoami() {
        System.out.println("I am a car");
    }
    static void move(){
        System.out.println("driving");
    }
}
