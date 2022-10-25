package testautomationpackage;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

//        take user input to get employee working hours
        Scanner usrInput = new Scanner(System.in);
        System.out.println("Enter the number of hours that Employee worked: ");
        int hours  = usrInput.nextInt();
//        user input for hourly rate
        System.out.println("Enter the Hourly rate: ");
        double rate = usrInput.nextDouble();
        usrInput.close();
//        calculate the gross pay multiplying hours and hourly rate
        double grosspay = hours * rate;
        System.out.println("The Gross Pay for the Employee: "+ grosspay);
    }
}
