import java.util.*;
/**
 * Write a description of class Roulette here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roulette
{
    private Random rand1;
    
    
    
    
    public Roulette()
    {
        Scanner input = new Scanner(System.in);
        int single;
        int bet = 0;
        rand1 = new Random();
    }
    
    public boolean winSingleRoulette(int bet, int userNum)
    {
        int rouletteNum = rand1.nextInt(37);
        if(rouletteNum == userNum)
        {
            System.out.println();
        }

        return true;
    }
}
