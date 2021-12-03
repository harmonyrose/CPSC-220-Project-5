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
        while (!game.equals("q"))
        {
        System.out.println();
        System.out.println("======================");
        System.out.println("Welcome to the Casino!");
        System.out.println("======================");
        System.out.println();
        System.out.println("Your balance: $" + balance);
        System.out.println();
        System.out.println("Which game would you like to play? slots, roulette, or black jack");
        System.out.println("(or type 'q' to quit)");
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
                    balance += 100;
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
        else if(game.equals("roulette"))
        {
            System.out.println("====================");
            System.out.println("Welcome to Roulette!");
            System.out.println("====================");
            System.out.println();
            System.out.println("In roulette, you get to choose the stakes and how much you bet!");
            System.out.println("Keep in mind that the higher the risk, the higher the reward ;)");
            System.out.println("To start, what level of risk would you like to play with?");
            System.out.println("Please enter 'high', 'medium', or 'low'");
            String risk = scan.nextLine();
            if(!risk.equals("high") && !risk.equals("medium") && !risk.equals("low"))
            {
                System.out.println("You entered an invalid risk level. Please enter 'high', 'medium', or 'low'");
                risk = scan.nextLine();
            }
            
            if(risk.equals("high"))
            {
            System.out.println("You've chosen a high risk game of roulette. You can only bet on one number, and if you");
            System.out.println("win, you will win 40x the bet you placed!");
            System.out.println("How much would you like to bet? (please type a number without '$')");
            
            System.out.println("Type the number between 0-36 you would like to bet on!");
            
            }
            else if(risk.equals("medium"))
            {
            
            }
            else if (risk.equals("low"))
            {
            
            }
            else
            {
            System.out.println("Please enter a valid game: slots, roulette, or black jack");
            game = scan.nextLine();
            }
        }
    }
    System.out.println("Your ending balance is $" + balance + ". Thanks for playing!");
}
}
