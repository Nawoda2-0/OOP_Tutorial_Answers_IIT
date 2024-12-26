package week3.Exercise01;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    //getters
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height+(2*super.getArea());
    }
    public double getVolume(){
        return Math.PI*Math.pow(getRadius(), 2) * height;
    }

    //setters

    public void setHeight(double height) {
        this.height = height;
    }
}
