package games;

import java.util.Scanner;
import java.util.Random;
public class Hangman {
    public static void displayHangman() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] guesses = {"awkward","bagpipes","banjo","bungler","croquet",
                "crypt","diaries","fervid","fishhook","fjord","gazebo",
                "gypsy","haiku","haphazard", "hyphen", "ivory", "jazzy","jiffy", "jinx",
                "jukebox", "kayak", "kiosk", "klutz", "memento", "mystify",
                "numskull", "ostracize", "oxygen", "pajama", "phlegm", "pixel", "polka",
                "quad", "quip","random" ,"rhythmic", "rogue", "sphinx", "squawk", "swivel",
                "today", "twelfth", "unzip", "waxy", "wildebeest", "yacht","zealous",
                "zigzag", "zippy", "zombie"};
        System.out.println("|-----------------------------------|");
        System.out.println("|        Welcome to Hangman         |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Over 50 RANDOMLY generated words! |");
        System.out.println("|        So keep playing!           |");
        System.out.println("|-----------------------------------|");
        boolean gameOn = true;
        while (gameOn) {

            char[] WordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
            int nummberOfGuesses = WordToGuess.length;
            char[] userGuess = new char[nummberOfGuesses];

            for (int i = 0; i < userGuess.length; i++) {
                userGuess[i] = '*';
            }
            boolean theWordWasGuessed = false;
            int tries = 0;

            while (!theWordWasGuessed && tries != nummberOfGuesses) {
                System.out.println("\nSecret Word:");
                printArray(userGuess);
                System.out.printf("You have %d tries left.\n", nummberOfGuesses - tries);
                System.out.println("Enter a single character >>>>");
                char input = scanner.nextLine().charAt(0);
                tries++;

                if (input == '*') {
                    gameOn = false;
                    theWordWasGuessed = true;
                } else {
                    for (int i = 0; i < userGuess.length; i++) {
                        if (WordToGuess[i] == input) {
                            userGuess[i] = input;
                        }
                    }
                }
                if (isTheWordGuessed(userGuess)) {
                    theWordWasGuessed = true;
                    System.out.println("YOU WINN!!!! :)))) ");
                }
            }
            if(!theWordWasGuessed)System.out.println("Jimmy died, you ran out of guesses");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /. . \\");
            System.out.println("   |        |  >  |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("Do you what to play another game? (yes/no)");
            String anotherGame = scanner.nextLine();
            if(anotherGame.equals("no")) gameOn = false;

        }
        System.out.println("GAME OVER!");
        System.out.println("Thanks for playing!");


    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static boolean isTheWordGuessed(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '*') return false;
        }
        return true;

    }
  }