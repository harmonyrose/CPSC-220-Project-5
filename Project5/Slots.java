import java.util.Random;
import java.io.*;
/**
 * Simulates a game of slots
 *
 * @author Harmony Peura
 * @version 12/3/2021
 */
public class Slots
{
    private Random rand1;
    private Random rand2;
    private Random rand3;
    
    public boolean win;
    public boolean win7;
    
    
    public Slots()
    {
        rand1 = new Random();
        rand2 = new Random();
        rand3 = new Random();
        boolean win;
        boolean win7;
    }

    /**
     * Runs a single game of slots. This method determines if the player won, lost,
     * or won the special 777.
     * 
     */
    public void runSlots()
    {
        int slot1 = rand1.nextInt(10);
        int slot2 = rand2.nextInt(10);
        int slot3 = rand3.nextInt(10);
        
            System.out.println("----------");
            System.out.println("||" + slot1 + " " + slot2 + " " + slot3 + "||");
            System.out.println("----------");
        
        if(slot1 != slot2 || slot1 != slot3 || slot2 != slot3)
        {
            win = false;
            win7 = false;
        }
        else if(slot1 == slot2 && slot1 == slot3 && slot2 == slot3 && slot1 != 7)
        {
            win = true;
            win7 = false;
        }
        else
        {
            win = true;
            win7 = true;
        }
    }
}
