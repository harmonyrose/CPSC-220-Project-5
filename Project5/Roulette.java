import java.util.*;
/**
 * Includes methods to simulate high or low risk games of roulette
 *
 * @author Harmony Peura
 * @version 12/3/2021
 */
public class Roulette
{
    public int rouletteNum;
    
    private Random rand1;
    private int userNum;
    private String oddsOrEvens;
        
    public Roulette()
    {
        rand1 = new Random();
        rouletteNum = rand1.nextInt(37);
    }
    
    public Roulette(int userNum, String oddsOrEvens)
    {
        userNum = this.userNum;
        oddsOrEvens = this.oddsOrEvens;
    }
    
    /**
     * Simulates a game of high stake roulette where the player bets on one number.
     * 
     * @param bet The player's bet
     * @param userNum The number (0-36) the player bets on
     * @return Whether the player won or lost
     */
    public boolean winHigh(int userNum)
    {
        if(rouletteNum == userNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Simulates a game of low stake roulette where the player bets on either odds or evens.
     * 
     * @param oddsOrEvens A string representing whether the player bet on evens or odds
     * @return Whether the player won or lost
     */
    public boolean winLow(String oddsOrEvens)
    {
        
        if(rouletteNum % 2 == 0 && oddsOrEvens.equals("evens")) 
        {
            return true;
        }
        else if(rouletteNum % 2 == 1 && oddsOrEvens.equals("odds"))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 


    
}
