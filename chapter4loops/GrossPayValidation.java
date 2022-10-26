/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
package chapter4loops;
import java.util.Scanner;

public class GrossPayValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 15;
        int maxHours = 40;
        System.out.println("How hours did you work this week? ");
        double workedHours = scanner.nextDouble();
        while (workedHours > maxHours || workedHours < 1){
            System.out.println("Invalid entry! Your worked hours must be in between 1 and 40. Try again!");
            workedHours = scanner.nextDouble();
        }

        scanner.close();
        double gross = rate * workedHours;
        System.out.print("Gross Pay: "+ gross);

    }
}

