package week1.task02;

public class Test {
    public static void main(String[] args) {

        // Declare an instance of Circle class called circle1
        // Invoke the default constructor
        Circle circle1 = new Circle();

        //invoke public methods
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea() +
                ", Color : " + circle1.getColor());

        //declare an instance of Circle class called circle2
        // invoke the second constructor
        Circle circle2 = new Circle(7);

        //declare an instance of Circle class called circle3
        // invoke the third constructor
        Circle circle3 = new Circle(14, "pink");

        //invoke public methods for circle2
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea() +
                ", Color : " + circle2.getColor());

        //invoke public methods for circle3
        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " + circle3.getArea() +
                ", Color : " + circle3.getColor());


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
    }
}
