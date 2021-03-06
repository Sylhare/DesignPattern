package main.shape;

import pattern.behavioral.visitor.GeometricElements;
import pattern.behavioral.visitor.MathVisitor;

/**
 * Created by sylhare in 2017.
 */
public class Rectangle extends Shape implements Draw, GeometricElements {

    public Rectangle() {
        edge = 4;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public float price() {
        return 49.9f;
    }

    @Override
    public void doodle() {}

    // For Visitor Pattern
    @Override
    public void accept(MathVisitor visitor) {
        visitor.visit(this);
    }
}