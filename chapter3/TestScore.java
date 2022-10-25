// Display a letter grade for a student based on their test score

package chapter3;
import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        get the test score
        System.out.print("Enter the test score: ");
        double score = scanner.nextDouble();
        char grade;
        scanner.close();
        if (score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is: "+ grade);
    }
}
