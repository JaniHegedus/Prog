/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Tömb 
{
    public static void main(String[] args) throws UnsupportedEncodingException 
    { 
        PrintStream out = new PrintStream(System.out, true, "UTF-16");
        Scanner bill = new Scanner(System.in, "ISO8859_2");
        final int MAX = 5;
        Szoba_OB szoba[] = new Szoba_OB[MAX];
        for(int szobaszam = 0; szobaszam < MAX; szobaszam++) 
        {  
            //Tömb feltöltés 
            szoba[szobaszam] = new Szoba_OB();
            szoba[szobaszam].Be(bill);
        } 
        out.println("Szobaszám  Vendég neve  Társak száma\tÁr");
        //Tömb kiírása 
        for(int i = 0; i<MAX; i++)
        { 
            out.printf("\t%d\t", i+1);
            szoba[i].Ki();
        } 
    }    
        
} 
class Szoba_OB
{ 
    private String vendeg;
    private int tars;
    private double ar;
    final NumberFormat penznem = NumberFormat.getCurrencyInstance();
    public void Be(Scanner bill)
    {
        out.print("Kérem a vendég nevét: ");
        vendeg = bill.next();
        out.print("Kérem a társak számát: ");
        tars = bill.nextInt();
        out.print("Kérem a szoba árát: ");
        ar = bill.nextDouble();
    }
    public void Ki() 
    {
        out.printf("%20s%10d%10.2f\n", vendeg, tars, ar);
    }    
} 

