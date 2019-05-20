import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int userEntry=0;
        Scanner input = new Scanner(System.in);
        while(userEntry !=999) {
            System.out.println("Hello and welcome to the RUSSELL TWINS GAME CENTER");
            System.out.println("1: Flip a Coin");
            System.out.println("2: Rock Paper and Scissors ");
            System.out.println("3: Simon Says");
            System.out.println("4: Mad libs");
            System.out.println("5: Tic-Tac-Tow");
            System.out.println("6: Hangman");
            System.out.println("  999 to quit");
            userEntry = input.nextInt();
            if (userEntry == 1)
               FlipACoin.FlipACoin();
            else if (userEntry == 2)
                RockPaperSissors.RockPaperSissors();
        }
    }
}
