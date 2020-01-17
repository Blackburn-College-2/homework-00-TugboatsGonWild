/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg0.mcmillen;

import java.util.Scanner;

/**
 *
 * @author wesley.mcmillen
 */
public class HW0McMillen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sushi = 1;
        int Tacos = 2;
        int Shrimp = 3;
        String guess1 = " ";
        String guess2 = " ";
        String guess3 = " ";
        String answer = " ";
        int number = (int) (3 * Math.random()) + 1;
        if (number == 3) {
            answer = "Shrimp";
        }
        if (number == 2) {
            answer = "Tacos";
        }
        if (number == 1) {
            answer = "Sushi";
        }
        System.out.println("The secret meal must be one of the following");
        System.out.println("Sushi, Tacos,or Shrimp");
        System.out.println("Take a guess");
        guess1 = input.nextLine();
        if (guess1.equalsIgnoreCase(answer)) {
            System.out.println("You were right!");
        } else {

            if (guess1.equalsIgnoreCase("sushi") || guess1.equalsIgnoreCase("tacos") || guess1.equalsIgnoreCase("shrimp")) {
                System.out.println("Not quite what I had in mind. Try again");
            } else {
                System.out.println("That wasn't an option. U lose... loser");
                return;
            }

            guess2 = input.nextLine();
            if (guess2.equalsIgnoreCase(answer)) {
                System.out.println("You were right!");
            } else {
                System.out.println("Still incorrect");
                if (guess2.equalsIgnoreCase(guess1)) {
                    System.out.println("Didn't you already try that?");
                    return;
                } else if (guess2.equalsIgnoreCase("sushi") || guess2.equalsIgnoreCase("tacos") || guess2.equalsIgnoreCase("shrimp")) {
                    System.out.println("Try again");
                }
                guess3 = input.nextLine();
                if (guess3.equalsIgnoreCase(answer)) {
                    System.out.println("You did it");
                } else {
                    System.out.println("Still incorrect");
                    if (guess3.equalsIgnoreCase(guess1) || guess3.equalsIgnoreCase(guess2)) {
                        System.out.println("Didn't you already try that?");
                    }

                }

            }
        }

    }
}
