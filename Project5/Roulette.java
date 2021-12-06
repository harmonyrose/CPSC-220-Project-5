import java.util.*;
/**
 * Write a description of class Roulette here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roulette
{
    public int rouletteNum;
    
    private Random rand1;
    private int bet;
    private int userNum;
    private String oddsOrEvens;
        
    public Roulette()
    {
        rand1 = new Random();
    }
    
    public Roulette(int bet, int userNum, String oddsOrEvens)
    {
        bet = this.bet;
        userNum = this.userNum;
        oddsOrEvens = this.oddsOrEvens;
    }
    
    public boolean winHigh(int bet, int userNum)
    {
        int rouletteNum = rand1.nextInt(37);
        if(rouletteNum == userNum)
        {
            System.out.println();
        }

        return true;
    }
    
    public boolean winLow(String oddsOrEvens)
    {
        int rouletteNum = rand1.nextInt(37);
        if((rouletteNum % 2 == 0 && oddsOrEvens.equals("evens")) || (rouletteNum %2 == 1 && oddsOrEvens.equals("odds")))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    
    
}
