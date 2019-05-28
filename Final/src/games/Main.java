package games;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int userEntry=0;
        Scanner input = new Scanner(System.in);
        while(userEntry !=999) {
        	 System.out.println("|-----------------------------------------------------|");
            System.out.println(" |Hello and welcome to the RUSSELL TWINS GAME CENTER   |");
            System.out.println(" |-----------------------------------------------------|");
            
            System.out.println("\n");
            System.out.println(" |-----------------------------|");
            System.out.println(" |      1:Flip a Coin          |");
            System.out.println(" |--------------------- --------|");
            System.out.println(" |      2:Rock, Paper,Scissors |");
            System.out.println(" |-----------------------------|");
            System.out.println(" |      3:Mad libs             |");
            System.out.println(" |-----------------------------|");
            System.out.println(" |      4:Hangman              |");
            System.out.println(" |-----------------------------|");
            System.out.println(" |      999 to quit            |");
            System.out.println(" |-----------------------------|");

            userEntry = input.nextInt();
            if (userEntry == 1)
               FlipACoin.FlipACoin();
            else if (userEntry == 2)
                RockPaperSissors.RockPaperSissors();
            else if (userEntry == 5)
                Hangman.displayHangman();
        }
    }
}
