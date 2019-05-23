package games;
import java.util.Scanner;

public class Hangman {
    private static Scanner input;
	public static void HangMan(){
        input = new Scanner(System.in);
        int userEntry =0;
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called hangman.\n");
        while(userEntry !=999){
            System.out.println("Please choice a mode");
            System.out.println("1. Noob (Guess one word)");
            System.out.println("2. Gamer (Guess two words)");
            System.out.println("3. God (Guess three words)");
            System.out.println(" 999 to quit.");
            userEntry = input.nextInt();

            if (userEntry == 1)
                Oneword();
            else if (userEntry == 2)
                Twowords();
            else if (userEntry == 3)
                Threewords();
        }
}
    public static void Oneword(){
        
        Scanner input = new Scanner(System.in);
       int attempts = 10; 
       int wordLength;
       boolean solved;
       String userEntry;
       
       
       
       System.out.println("Player one please turn around and look away form the screen !");
       System.out.println("\nPlayer two please enter a word for player one the guess !");
       userEntry =  input.next(); 
    
       
       for(int i = 1; i <= 20; i++)
           System.out.print("\n");


           Scanner userLetter = new Scanner(System.in);
           String letter;

           System.out.print("Word to date: ");
           for (int i = 0; i < userEntry.length(); i++)
           {
               System.out.print("*");
           }

           while (attempts <= 10 && attempts > 0)
           {
               System.out.println("\nAttempts left: " + attempts);
               System.out.print("Enter letter: ");

               attempts--;
           }
           System.out.println("\n---------------------------");
           System.out.println("Sorry you didn't find the mystery word!");
           System.out.println("It was \"" + userEntry + "\"");


            

    }
    public static void Twowords(){

    }
    public static void Threewords(){

    }
    public static void FirstWrong(){
        System.out.println("Wrong guess, try again");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("___|___");
        System.out.println();

    }
    public static void SecoundWrong(){
        System.out.println("Wrong guess, try again");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void ThirdWrong(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   | ");
        System.out.println("___|___");
    }
    public static void FourthWrong(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void FifthWrong(){
        System.out.println("Wrong guess, try again");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |           |");
        System.out.println("   |           |");
        System.out.println("   |");
        System.out.println("___|___");
    }
    public static void SixthWrong(){
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
    public static void SeventhWrong(){
        System.out.println("GAME OVER!");
        System.out.println("   ____________");
        System.out.println("   |          _|_");
        System.out.println("   |         /   \\");
        System.out.println("   |        |     |");
        System.out.println("   |         \\_ _/");
        System.out.println("   |          _|_");
        System.out.println("   |         / | \\");
        System.out.println("   |          / \\ ");
        System.out.println("___|___      /   \\");
    }

}
