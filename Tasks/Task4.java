package Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord.reverse();

        if (word.equals(reverseWord.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        input.close();
    }

}
