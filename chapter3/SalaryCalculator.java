/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
//  initialize the know values
        double salary = 25000.0;
        int bouns = 250;
        int qouta = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the Employee make this week? ");
        int sales = scanner.nextInt();
        scanner.close();
        if(sales > qouta){
            salary = salary + bouns;
            System.out.println("The Emplyee's pay is $" + salary);
        }
        else {
            System.out.println("The Emplyee's pay is $" + salary);
        }


    }
}
