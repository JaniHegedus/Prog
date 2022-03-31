/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F2_Inherit {
    public static void main(String[] args)
    {
        int N = 1;
        Scanner billentyu = new Scanner (System.in, "ISO8859_2");
        Count sztring[] = new Count[N];
        for (int i=0;i<N;i++)
        {
            sztring[i]=new Count();
            sztring[i].beolvas(billentyu);
        }
        for(int i=0;i<N;i++)
        {
            sztring[i].kiir();
            out.printf("Kisbetűk száma: %d\n", sztring[i].kisbetűk());
        }
        
    }
}
class Metódusok
{
    protected String string;
    public void beolvas(Scanner billentyu)
    {
        out.print("Kérek egy stringet: ");
        string = billentyu.next();
    }
    public void kiir()
    {
        out.printf("A Karaktersor: %s\n", string);        
    }
}
class Count extends Metódusok
{
    private int count =0;
    public int kisbetűk()
    {
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)>='a'&&string.charAt(i)<='z') count++;
        }
        return count;
    }
}
