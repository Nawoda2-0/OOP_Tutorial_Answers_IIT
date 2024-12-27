package week4.abstractQue;

abstract class GeometricObject {

    protected boolean filled;
    protected String color;

    //Default constructor
    public GeometricObject(){}

    //parameterized constructor
    public GeometricObject(boolean filled, String color){
        this.filled = filled;
        this.color = color;
    }

    //getters
    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    abstract public double getPerimeter();

    abstract public double getArea();

    abstract public String getShape();

    //setters
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
