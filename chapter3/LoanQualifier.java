/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

package chapter3;
import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        double requiredSalary = 30000.0;
        int requiredYear = 2;
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the number of years with your current employeer: ");
        int years = scanner.nextInt();
        scanner.close();
        if ( salary >= requiredSalary){
            if (years >= requiredYear){
                System.out.println("Congrats! you qualify the loan!");

            }
            else {
                System.out.println("Sorry, you must have worked at your current job "+ requiredYear + "years.");
            }

        }
        else{
            System.out.println("You must earn atleast $ "+ requiredSalary + " to qualify for the loan!");
        }
    }
}
