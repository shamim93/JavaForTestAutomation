/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
package chapter4loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items that you want to scan:");
        int qty = scanner.nextInt();
        int i;
        double total = 0;
        for (i=1; i<= qty; i++){
            System.out.print("Enter the cost of the "+ i + " item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Total price of  "+ qty +" items: "+ "$"+total);
    }
}
