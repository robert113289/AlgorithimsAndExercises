package com.exercises;

public class Shape{
    private double length;
    private double width;
    private double height;

    public Shape(double length, double width, double height){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.height * this.width;
    }
}
