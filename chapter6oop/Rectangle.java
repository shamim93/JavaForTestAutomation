package chapter6oop;
/*
* write a class that describes the fields and methods of a Rectangle
*
* write another class that instances of the Rectangle class to find the total ara of 2 rooms in a house.
* */
public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidht(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }
}
