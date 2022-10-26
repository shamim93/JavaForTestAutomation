package chapter4loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to sum up?");
        double num = scanner.nextDouble();
        double sum = 0;
        int i = 1;
        int usrNum = 0;
        System.out.println("Enter numbers you want to sum up");
        while (i<=num){
            usrNum = scanner.nextInt();
//            sum = sum + i;
            sum = sum+usrNum;
            i++;
        }
        System.out.println(sum);
    }
}
