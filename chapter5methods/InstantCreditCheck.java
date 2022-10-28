/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
package chapter5methods;
import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCredit = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCretidScore();
        boolean qualified = isUserQualified(salary,creditScore);
        notifyUser(qualified);
    }
    public static double getSalary(){
        System.out.println("Enter your salary!");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCretidScore(){
        System.out.println("Eneter Current Credit Score!");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(double salary, int creditScore){
        if(salary>=requiredSalary && creditScore >= requiredCredit){
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("You're approved!");
        }
        else {
            System.out.println("You're declined!");
        }

    }
}
