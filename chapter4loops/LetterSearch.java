package chapter4loops;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text contains letter 'A/a': ");
        String text = scanner.next();
//        System.out.println(text);
        boolean letterFound = false;
        int i;
        for (i = 0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
//            System.out.println(currentLetter);
            if (currentLetter == 'A' || currentLetter == 'a'){
                System.out.println("Letter 'A' found at "+ i);
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains letter 'A'");
        }
        else {
            System.out.println("It doesn't have letter 'A'");
        }
    }
}
