package number_guess_game;

import java.util.Scanner;

public class Game {

    Scanner scanner;

    Game(Scanner scanner) {
        this.scanner = scanner;
    }

    public void init() {
        System.out.println("--------------------");
        System.out.println("Number Guessing Game");
        System.out.println("--------------------\n");

        String name = "";
        while (name == "") {
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine().toUpperCase();
            if (name.length() <= 4) {
                name = "";
                System.out.println("Name should be atleast 5 characters long!");
            }
        }

        System.out.println("\nWelcome " + name + "!");

        System.out.println("\nEnter \"100\" to quite the game\n");

    }

    private double generateRandomNumber(int limit) {
        return Math.ceil(Math.random() * limit);
    }

    private void displayWinningStatus(byte choice, byte random) {
        System.out.println("--------------------");
        System.out.println("Random Number: " + random);
        System.out.println("Your Guess: " + choice);
        if (choice == random) {
            System.out.println("Congratulations! You Win.");
        } else {
            System.out.println("Oops! You Lose.");
        }
        System.out.println("--------------------\n\n");
    }

    public void play() {
        byte userChoice = 0;
        Boolean quit = false;

        while (!quit) {
            System.out.print("Please Guess a Number Between 0 & 10: ");
            byte number = (byte) this.generateRandomNumber(10);

            userChoice = scanner.nextByte();
            if (userChoice != 100) {
                if (userChoice < 0 || userChoice > 10) {
                    System.out.println("Invalid Choice! Plese choice b/w 0 and 10 or Enter 100 to quit.");
                    continue;
                }
                this.displayWinningStatus(userChoice, number);
            } else
                quit = true;
        }

    }
}
