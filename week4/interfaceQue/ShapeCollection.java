package week4.interfaceQue;

import week4.abstractQue.GeometricObject;

public interface ShapeCollection {
    public abstract void addShape(GeometricObject shape);
    public abstract void printShapeList();
    public abstract boolean runMenu();
}
