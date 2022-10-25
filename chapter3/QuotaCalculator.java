/*
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sales you made this week: ");
        int sales = scanner.nextInt();
        scanner.close();
        if ( sales >= quota){
            System.out.println("Congrats! you've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota. You are "+ salesShort + " sales short!");
        }
    }
}
