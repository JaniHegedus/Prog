/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.Second_zh.Exception;

import static java.lang.System.err;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Kivét_2 
{
    public static void main(String[] args) 
    { 
        final double egységár = 1000;
        Scanner bill = new Scanner(System.in);
        NumberFormat pénz = NumberFormat.getCurrencyInstance();
        out.print("Áruk mennyisége: ");
        String áruk = bill.next();
        try
        {
            int db = Integer.parseInt(áruk);
            if(db < 0)throw new HibásÉrték();
            out.print("Az érték ");
            out.println(pénz.format(db * egységár)); 
        }
        catch (NumberFormatException error)
        {
            err.println ("Nem számot adtunk meg! - " + error.getMessage());
        }
        catch (HibásÉrték error)
        { 
            err.println("Hibás az áruk száma!"); 
        } 
        finally
        { 
            out.println("Ez a finally rész");
        } 
    }
}
class HibásÉrték extends Exception
{
    //Gec ez üres
} 