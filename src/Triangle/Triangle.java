package Triangle;

public class Triangle {
    private int width;
    private int height;
    static int numOfTriangles;
    Triangle(){
        numOfTriangles++;
    }

    Triangle(int width, int height){
        this();
        this.width = width;
        this.height = height;
    }

    boolean isSameArea(Triangle yours){
        return this.findArea() == yours.findArea() ? true : false;
    }
    double findArea(){
        return (this.width * this.height) / 2;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}