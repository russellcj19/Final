import java.util.Scanner;

public class FlipACoin {
    public static void FlipACoin() {
        int userEntry = 0;
        Scanner input = new Scanner(System.in);
        while (userEntry != 999) {
            System.out.println("1: Heads ");
            System.out.println("2: Tails ");


            userEntry = input.nextInt();
            int random = (int) (Math.random() * 2 + 1);

            if (userEntry == 1) {
                if (random == 1) {
                    System.out.println("Its Heads, you WIN!");
                } else if (random == 2) {
                    System.out.println("Its Tails, you Lost :( ");

                } else if (userEntry == 2) {
                    if (random == 1) {
                        System.out.println("Its Heads, you Lost :(");
                    } else if (random == 2) {
                        System.out.println("Its Tails, you Win!!");

                    }
                }

            }
        }
    }
}