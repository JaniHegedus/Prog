/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F6_Inherit {
    public static void main(String[] args)
    {
        int N =10;
        Scanner bill = new Scanner(System.in, "ISO8859_2");
        Atlag szamok = new Atlag();
        szamok.beolvas(bill, 3);
        szamok.kiír();
        out.printf("A számok összege: %d\n", szamok.osszegki());
        szamok.atlagkiír();
    }
}
class Methods0
{
    protected ArrayList<Integer> tomb = new ArrayList();
    protected static int osszeg;
    public void beolvas(Scanner bill, int N)
    {
        for(int i=0;i<N;i++)
        {
            out.printf("Kérem a tömb %d elem értékét: ", i+1);
            tomb.add(bill.nextInt());
        }
    }
    
    public int osszegki()
    {
        for (int i=0;i<tomb.size();i++)
        {
            osszeg+=tomb.get(i);
        }
        return osszeg;
    }
    
    public void kiír()
    {
        for (int i=0;i<tomb.size();i++)
        {
            out.printf("%d\n",tomb.get(i));
        }
    }
}
class Atlag extends Methods0
{
    
    public void atlagkiír()
    {
        int atlag=osszeg/tomb.size();
        out.printf("%d\n", atlag);
    }
}