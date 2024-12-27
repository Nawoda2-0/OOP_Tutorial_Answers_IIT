package week3.Exercise01;

public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(5.0);

        System.out.println("Cylinder:"
                        + " radius=" + c2.getRadius()
                        + " height=" + c2.getHeight()
                        + " base area=" + c2.getArea()
                        + " volume=" + c2.getVolume());

        Cylinder c3 = new Cylinder(5.0, 10.0);

        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        Circle cr1 = new Circle(5.0);
        System.out.println("Area of cylinder : " + c3.getArea());
        System.out.println("Area of Circle : " + cr1.getArea());


    }

}