package com.akanksha.Factory;

public class ShapeFactory {



    public Shape getShape(String inp) {
        switch (inp){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
