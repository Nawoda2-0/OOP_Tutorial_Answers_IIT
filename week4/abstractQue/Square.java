package week4.abstractQue;

public class Square extends GeometricObject{
    protected double side;

    //default constructor
    public Square(){}

    //parameterized constructor
    public Square(double side){
        this.side = side;
    }
    public Square(double side, boolean filled, String color){
        super(filled, color);
        this.side = side;
    }

    //getters
    public double getSide() {
        return side;
    }

    //setters
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return side*2;
    };

    @Override
    public double getArea(){
        return side*side;
    };

    @Override
    public String getShape(){
        return  "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", filled=" + super.filled +
                ", color='" + super.color + '\'' +
                '}';
    }
}
