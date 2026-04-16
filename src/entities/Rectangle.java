package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

    public double width;
    public double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public Double area(){
        return width * height;
    }

    public double perimeter(){
        return (width*2) + (height*2);
    }

    public double diagonal(){
        return Math.sqrt((Math.pow(width,2)) + (Math.pow(height, 2)));
    }

}
