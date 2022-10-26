package chapter5methods;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person's name: ");
        String name = scanner.next();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        greetuser(name);
    }
    public static void greetuser(String name){
        System.out.println("Hey "+ name);
    }
}
