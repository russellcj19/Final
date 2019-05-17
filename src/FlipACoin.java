import java.util.Scanner;

public class FlipACoin {
    public static void FlipACoin() {
            int userEntry = 0;
        Scanner input = new Scanner(System.in);
        while (userEntry != 999){
            System.out.println("Pick heads(1) or tails(2) >>>");

            userEntry = input.nextInt();


            if (Math.random() < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }

        }
    }
}