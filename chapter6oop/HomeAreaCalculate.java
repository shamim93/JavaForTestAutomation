package chapter6oop;
// instanting an object
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculate {
    public static void main(String[] args) {
        Rectangle room= new Rectangle();
        room.setLength(10);
        room.setWidth(10);
        double areaOfRoom = room.calculateArea();
        double perimeterOfRoom = room.calculatePerimeter();
        System.out.println(areaOfRoom);
        System.out.println(perimeterOfRoom);

        Rectangle room2 = new Rectangle();
        room2.setWidth(20);
        room2.setLength(20);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom + areaOfRoom2;
        System.out.println("Total area of room 2 is: " + totalArea);
    }
}
