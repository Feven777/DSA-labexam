package Question;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first number:");
        myArray[0] = keyboard.nextInt();

        System.out.println("Enter second number:");
        myArray[1] = keyboard.nextInt();

        System.out.println("Enter third number:");
        myArray[2] = keyboard.nextInt();

        System.out.println("Enter fourth number:");
        myArray[3] = keyboard.nextInt();

        System.out.println("Enter fifth number:");
        myArray[4] = keyboard.nextInt();

        System.out.println("Enter number to be found:");
        int numToFind = keyboard.nextInt();

        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numToFind) {
                count++;
            }
        }

        System.out.println("It appears " + count + " times");

        // Close the Scanner object
        keyboard.close();
    }
}



