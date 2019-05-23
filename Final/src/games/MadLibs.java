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
            else if (choice == 2)
                hallPass();
//            else if (choice == 3)
//                //fictionStory();
        }
    }
    public static void funnyStory(){
        String[] userEntry = new String[15];
        String[] madLibsQs = {"Adjective","Nationality","Person","Noun","Adjective","Noun","Adjective","Adjective", 
        		"Plural noun", "Noun", "number", "Shapes", "Food", "Food", "Number"};

        Scanner input = new Scanner(System.in);
        for(int i = 0; i<madLibsQs.length;i++){
        System.out.println("Please Enter "+ madLibsQs[i]);
        userEntry[i] = input.next();
        }

        System.out.println("Pizza was invented by an " + userEntry[0]  +  userEntry[1] +
        " chef named " + userEntry[2] +". To make a pizza, you need to take a lump of\n"
        + userEntry[3] + ", and make a thin, round" + userEntry[4] + userEntry[5] +
        ". Then you cover it with" + userEntry[6] + "sauce," + userEntry[7] +
        "cheese, and fresh chopped" + userEntry[8] + ". Next you have to bake it in a very hot\n" + userEntry[9] +
        ". When it is done, cut it into" + userEntry[10] + userEntry[11] + ". Some kids like" + userEntry[12] + 
        "Pizza the best, but my favorite is the" + userEntry[13] + "pizza. if I could, I would eat pizza\n" + userEntry[14] + "times a day!" );
    }
    public static void hallPass();
    String[] userEntry = new String[3];
    String[] madLibsQs = {"Enter date", "Enter name", "Enter noun", "Enter an event"};
    Scanner input = new Scanner(System.in);
    for(int i = 0; i<madLibsQs.length;i++){
    System.out.println("Please Enter "+ madLibsQs[i]);
    userEntry[i] = input.next();
    }
    System.out.println("HALL PASS\n" + "DATE" + userEntry[0] + "\n" + userEntry[1] + "is too cool for " 
    		+ userEntry[2] + "class. Instead she/he will be attending the" + userEntry[3] + "SIGNED...");
    
    
   
    

}
