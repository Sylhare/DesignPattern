package main.shape;

import pattern.behavioral.visitor.GeometricElements;
import pattern.behavioral.visitor.MathVisitor;

public class Square extends Shape implements Draw, GeometricElements {

    public Square() {
        edge = 4;
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public float price() {
        return 32.0f;
    }

    @Override
    public void doodle() {}

    // For Visitor Pattern
    @Override
    public void accept(MathVisitor visitor) {
        visitor.visit(this);
    }
}
