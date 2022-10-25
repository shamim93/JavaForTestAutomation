//Create a program that asks a user for a season of the year, then a whole number, then an adjective. And use the input to complete the sentence below. Output the result
/*
"On a [adjective]  [season] day, I drink a minimum of [ whole number] cups of coffee"
 */


package testautomationpackage;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MidLibs {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a season of the year: ");
        String season = scanner.next();
        System.out.println("Enter a whole number: ");
        int number =  scanner.nextInt();
        System.out.println("Enter an adjective: ");
        String adj = scanner.next();
        scanner.close();
        System.out.println("On a " + adj + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
