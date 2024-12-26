package week1.task02;

public class Circle {
    //instance variables
    private double radius;
    private String color;

    //Default constructor
    public Circle(){
        this.radius = 1;
        this.color = "blue";
    }
    //Parameterized constructors
    public Circle(double r){
        radius = r;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //public getters
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2); //calculate the area.
    }

    //toString method
    public String toString(){
        return "Circle[ Radius : " + radius + ", color : " + color + "]";
    }

}
