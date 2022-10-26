package chapter4loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to sum up?");
        double num = scanner.nextDouble();
        double sum = 0;
        int i = 1;
        while (i<=num){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
