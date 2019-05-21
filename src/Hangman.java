import java.util.Scanner;

public class Hangman {
    public static void HangMan(){
        Scanner input = new Scanner(System.in);
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
        // The word is Banjo
        Scanner input = new Scanner(System.in);
        int userEntry =0;
        int userEntry2 =0;
        System.out.println("A=1 \nB=2 \nC=3 \nD=4 \nE=5 \nF=6 \nG=7 \nH=8 \nI=9 \nJ=10 " +
                "\nK=11 \nL=12 \nM=13 \nN=14 \nO=15 \nP=16 \nQ=17 \nR=18 \nS=19 \nT20 \nU=21 " +
                "\nV=22 \nW=23 \nX=24 \nY=25 \n26");

            System.out.println("Pick a Letter ");

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
