package week4.abstractQue;

public class Circle extends GeometricObject{
    protected double radius;

    //Default constructor
    public Circle(){}

    //parameterized constructor
    public Circle(double r){
        radius = r;
    }
    public Circle(double radius, boolean filled, String color){
        super(filled, color);
        this.radius = radius;
    }

    //getters
    public double getRadius() {
        return radius;
    }

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    };

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    };

    @Override
    public String getShape(){
        return  "Circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + super.filled +
                ", color='" + super.color + '\'' +
                '}';
    }
}
