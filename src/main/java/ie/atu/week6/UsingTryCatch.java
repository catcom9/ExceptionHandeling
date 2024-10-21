package ie.atu.week6;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args){
        try (Scanner myscan = new Scanner(System.in)) {
            while(true){
                try{
                    System.out.println("Please enter a number between 0 - 9: ");
                    //Read user input as a string;
                    String input = myscan.nextLine();

                    //Parse the input to an integer;
                    int myNum = Integer.parseInt(input);

                    //Check if the number is between 0 and 9
                    if (myNum >= 0 && myNum <= 9){
                        System.out.println("You entered " + myNum);
                        break;
                    } else {
                        System.out.println("Not a valid number. Try again");
                    }
                } catch (Exception e){
                    System.out.println("Not a valid number. Try again");
                }
            }
        }

    }
}
