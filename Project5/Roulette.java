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
        if(getRouletteNum() == userNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean winLow(String oddsOrEvens)
    {
        if((getRouletteNum() % 2 == 0 && oddsOrEvens.equals("evens")) || (getRouletteNum() %2 == 1 && oddsOrEvens.equals("odds")))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    public int getRouletteNum()
    {
        int rouletteNum = rand1.nextInt(37);
        return rouletteNum;
    }
    
    
}
