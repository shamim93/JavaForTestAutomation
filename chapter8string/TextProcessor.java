package chapter8string;

import java.util.Scanner;

/*
 Write a method that counts the number of words in String and prints them individually on a new line
 */
public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countWords("I love Bangladesh");
        System.out.println("Add text to revers!");
        String strReverse = scanner.nextLine();
//        System.out.println(strReverse);
        reversString(strReverse);
    }
    public  static void countWords(String text){
        var words = text.split(" ");
        int numbersOfWords = words.length;
        String msg = String.format("Your text contains %d words: ", numbersOfWords);
        System.out.println(msg);
        for (int i =0; i<numbersOfWords; i++){
            System.out.println(words[i]);
        }
    }
    /*
    Write a method to revers a string
     */
    public static void reversString(String txt){
        for (int i=txt.length()-1; i>=0; i--){
            System.out.print(txt.charAt(i));

        }
    }
}
