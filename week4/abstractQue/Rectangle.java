package week4.abstractQue;

public class Rectangle extends GeometricObject{
    protected double length;
    protected double width;

    //default constructor
    public Rectangle(){}

    //parameterized constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width =width;
    }

    public Rectangle(double length, double width, boolean filled, String color){
        super(filled, color);
        this.length = length;
        this.width =width;
    }

    //getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return (length+width)*2;
    };

    @Override
    public double getArea(){
        return width*length;
    };

    @Override
    public String getShape(){
        return  "Rectangle";
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", filled=" + super.filled +
                ", color='" + super.color + '\'' +
                '}';
    }
}
