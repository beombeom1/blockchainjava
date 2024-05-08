package Circle;

class Circle {
    private int radius;
    final double PI = 3.14;
    String color;

    Circle(int r){
        radius = r;
    }

    Circle(int r, String color){
        this(r);//Circle.Circle(r)과 radius = r; 이거 2개랑 사실상 같은것
        this.color = color;
    }

    double getArea()
    {
        return radius * radius * PI;
    }
    int getDiameter(){
        int result = radius * 2;
        return result;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
