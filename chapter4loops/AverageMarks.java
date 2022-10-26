package chapter4loops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 2;
        int numberOfTest = 2;
        int i,j;
        for (i = 0; i<numberOfStudents; i++){
//            System.out.println(i);
            double total = 0;
            for (j = 0; j<numberOfTest; j++){
                System.out.println("Enter the marsk for # "+ (j+1));
                double marks = scanner.nextDouble();
                total = total+marks;
            }
            double average = total/numberOfTest;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

    scanner.close();
    }
}
