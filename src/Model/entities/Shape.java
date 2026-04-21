package Model.entities;

import Model.enums.Color;

public abstract class Shape {
    Color color;

    public Shape() {

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
