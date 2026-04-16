package entities;

import entities.enums.Color;

public class Triangle extends Shape {
    public double a;
    public double b;
    public double c;
    public double p;
    public double areaT;

    public Triangle() {
        super();
    }

    public Triangle(double c, double b, double a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }

    public Triangle(Color color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double area(){
        p = (a + b + c)/2;
        areaT = Math.sqrt(p* (p-a) * (p-b) * (p-c));
        return areaT;
    }
}
