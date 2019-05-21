import java.util.Map;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){

        int choice = 0;
        Scanner input = new Scanner(System.in);
        while(choice !=999){
            System.out.println("What story do you want??");
            System.out.println("1. Funny");
            System.out.println("2. Sad");
            System.out.println("3. Fiction");
            System.out.println(" 999 to quit.");

            choice = input.nextInt();

            if (choice == 1)
                funnyStory();
            else if (choice == 2)
                sadStory();
            else if (choice == 3)
                fictionStory();
        }
    }
    public static void funnyStory(){
        int userEntry;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Color");
        userEntry = input.nextInt();
        System.out.println("Please enter Adjective");
        

    }

}
