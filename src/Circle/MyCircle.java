package Circle;

import Circle.Circle;

public class MyCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(0);
        c1.setRadius(5);

        Circle c2 = new Circle(0);
        c2.setRadius(10);

        Circle c3 = new Circle(20);

        Circle c4 = new Circle(30, "red");

        System.out.println("C1 반지름 " + c1.getRadius() + " C1의 넓이 " + c1.getArea());
        System.out.println("C2 반지름 " + c2.getRadius() + " C2의 넓이 " + c2.getArea());
        System.out.println("C3 반지름 " + c3.getRadius() + " C3의 넓이 " + c3.getArea());
        System.out.println("C4 반지름 " + c4.getRadius() + " C4의 넓이 " + c4.getArea() + " C4의 색 " + c4.color);
        c4.setColor("Blue");
        System.out.println("c4의 색 " + c4.color);
    }
}
