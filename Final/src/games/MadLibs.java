package games;
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
//            else if (choice == 2)
//                //sadStory();
//            else if (choice == 3)
//                //fictionStory();
        }
    }
    public static void funnyStory(){
        String[] userEntry = new String[15];
        String[] madLibsQs = {"Adjective","Nationality","Person","Noun","Adjective","Noun"};

        Scanner input = new Scanner(System.in);
        for(int i = 0; i<madLibsQs.length;i++){
        System.out.println("Please Enter "+ madLibsQs[i]);
        userEntry[i] = input.next();
        }

//        System.out.println("Please Enter Adjective");
//        userEntry7 = input.nextInt();
//        System.out.println("Please Enter Adjective");
//        userEntry8 = input.nextInt();
//        System.out.println("Please Enter Plural Noun");
//        userEntry9 = input.nextInt();
//        System.out.println("Please Enter Noun");
//        userEntry10 = input.nextInt();
//        System.out.println("Please Enter Number");
//        userEntry11 = input.nextInt();
//        System.out.println("Please Enter Shapes");
//        userEntry12 = input.nextInt();
//        System.out.println("Please Enter Food");
//        userEntry13 = input.nextInt();
//        System.out.println("Please Enter Food");
//        userEntry14 = input.nextInt();
//        System.out.println("Please Enter Number");
//        userEntry15 = input.nextInt();

        System.out.println("Pizza was invented by a" + userEntry[0] + userEntry[1] +
        "chef named" + userEntry[2] +". To make a pizza, you need to take a lump of"
        + userEntry[3] + ", and make a thin, round" + userEntry[4] + userEntry[5] +
        ". Then you cover it with" + userEntry[6] + "sauce," + userEntry[7] +
        "cheese, and fresh chopped" + userEntry[8] );
    }

}
