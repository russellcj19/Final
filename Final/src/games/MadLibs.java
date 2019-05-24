package games;
import java.util.Map;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){


        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 999) {
            System.out.println("Pick a story!!");
            System.out.println("1. Pizza Pizza");
            System.out.println("2. Hall Pass");
            System.out.println("3. Love Letter");
            System.out.println(" 999 to quit.");

            choice = input.nextInt();

            if (choice == 1)
                funnyStory();
            else if (choice == 2)
                hallPass();
            else if (choice == 3)
                loveLetter();
        }
    }

    public static void funnyStory() {
        String[] userEntry = new String[15];
        String[] madLibsQs = {"Adjective", "Nationality", "Person", "Noun", "Adjective", "Noun", "Adjective",
                "Adjective (half way done)",
                "Plural noun", "Noun", "number", "Shapes", "Food", "Food", "Number"};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < madLibsQs.length; i++) {
            System.out.println("Please Enter " + madLibsQs[i]);
            userEntry[i] = input.next();
        }

        System.out.println("Pizza was invented by an " + userEntry[0] + " " + userEntry[1] +
                " chef named " + userEntry[2] + ". To make a pizza, you need to take a lump of\n"
                + userEntry[3] + ", and make a thin, round " + userEntry[4] + " " + userEntry[5] +
                ". Then you cover it with " + userEntry[6] + " sauce, " + userEntry[7] +
                " cheese, and fresh chopped " + userEntry[8] + ". Next you have to bake it in a very hot\n" + userEntry[9] +
                ". When it is done, cut it into " + userEntry[10] + " " + userEntry[11] + ". Some kids like " + userEntry[12] +
                "Pizza the best, but my favorite is the " + userEntry[13] + " pizza. i1" +
                "f I could, I would eat pizza\n" + userEntry[14] + " times a day!");
    }

    public static void hallPass() {
        String[] userEntry = new String[4];
        String[] madLibsQs = {"Enter date", "Enter name", "Enter noun", "Enter an event"};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < madLibsQs.length; i++) {
            System.out.println("Please Enter " + madLibsQs[i]);
            userEntry[i] = input.next();
        }
        System.out.println("HALL PASS\n" + "DATE " + userEntry[0] + "\n" + userEntry[1] + "is too cool for "
                + userEntry[2] + " class. \n Instead she/he will be attending the " + userEntry[3] + "\n SIGNED...");
    }
    public static void loveLetter() {
        String[] userEntry = new String[10];
        String[] madLibsQs = {"Person In Room", "Adjective", "Verb", "Part of body", "Number",
                "Noun", "Adverb", "Verb", "Pronoun plural", "Other person in room"};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < madLibsQs.length; i++) {
            System.out.println("Please Enter " + madLibsQs[i]);
            userEntry[i] = input.next();
        }
        System.out.println("DEAR, " + userEntry[0] + "\n You are extremely " + userEntry[1] + " and I " + userEntry[2] +
                " you!\n I want to kiss your " + userEntry[3] + " " + userEntry[4] + " times.\n You make my " + userEntry[5] +
                " burn with desire.\n When I first saw you, I " + userEntry[6] + " stared at you and fell in love.\n Will you "
                + userEntry[7] + " out with me?\n Don't let your parents discourage you, " + userEntry[8] + " are just " +
                "jealous.\n yours forever, " + userEntry[9]);
    }
}

    
   
    


