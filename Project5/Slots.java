import java.util.Random;
import java.io.*;
/**
 * Methods for the casino games
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
    }
    
    public Slots(boolean win, boolean win7)
    {
        this.win = win;
        this.win7 = win7;
    }
    
    public void runSlots()
    {
        int slot1 = rand1.nextInt(10);
        int slot2 = rand2.nextInt(10);
        int slot3 = rand3.nextInt(10);
        if(slot1 != slot2 || slot1 != slot3 || slot2 != slot3)
        {
            win = false;
            win7 = false;
            System.out.println("------");
            System.out.println(slot1 + " " + slot2 + " " + slot3);
            System.out.println("------");
        }
        else if(slot1 == slot2 && slot1 == slot3 && slot2 == slot3 && slot1 != 7)
        {
            win = true;
            win7 = false;
            System.out.println("------");
            System.out.println(slot1 + " " + slot2 + " " + slot3);
            System.out.println("------");
            System.out.println("Congratulations! :)");
        }
        else
        {
            win7 = true;
            System.out.println("------");
            System.out.println(slot1 + " " + slot2 + " " + slot3);
            System.out.println("------");
            System.out.println("Congratulations! :)");
        }
    }
}
