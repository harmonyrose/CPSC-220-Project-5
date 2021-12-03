import java.util.*;
/**
 * Write a description of class Casino here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Casino
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int balance = 100;
        String game = new String();
        while (game != "q")
        {
        System.out.println("======================");
        System.out.println("Welcome to the Casino!");
        System.out.println("======================");
        System.out.println();
        System.out.println("Your balance: $" + balance);
        System.out.println("Which game would you like to play? slots, roulette, or black jack");
        System.out.println("(type 'q' to quit)");
        game = scan.nextLine();
        
        if(game.equals("slots"))
        {
            System.out.println("=============================");
            System.out.println("Welcome to the Slots Machine!");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Slots costs $1 each time you play. If you get three of the same number, you win $50!");
            System.out.println("If you get a lucky 777, you win $1000!");
            System.out.println();
            System.out.println("Would you like to play? y/n");
            String yesNo = scan.nextLine();
            
            while(yesNo.equals("y"))
            {
                Slots slotsgame = new Slots();
                slotsgame.runSlots();
                if(slotsgame.win == false && slotsgame.win7 == false)
                {
                    balance -= 1;
                }
                else if(slotsgame.win == true && slotsgame.win7 == false)
                {
                    System.out.println();
                    System.out.println("Congratulations! $100 will be added to your balance :)");
                    balance += 50;
                }
                else if(slotsgame.win == true && slotsgame.win7 == true)
                {
                    System.out.println();
                    System.out.println("Congratulations! You hit the jackpot! $1000 will be added to your balance :)");
                    balance += 1000;
                }
                System.out.println();
                System.out.println("Your balance is now $" + balance);
                System.out.println();
                System.out.println("Would you like to play again? (y/n)");
                yesNo = scan.nextLine();
                
            }
            
            
            
        }
        
        
        
        
    }
}
}
