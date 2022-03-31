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
public class F1_Inherit {
    public static void main(String[] args)
    {
        int N =10;
        Scanner bill = new Scanner(System.in, "ISO8859_2");
        //Methods tomb[] = new Methods[N];
        Kiírindex tomb0[] = new Kiírindex[N];
        
        for (int i=0;i<N;i++)
        {
            //tomb[i]=new Methods();
            //tomb[i].beolvas(bill,i);
            tomb0[i]=new Kiírindex();
            tomb0[i].beolvas(bill, i);
        }
        out.print("Index nélkül: ");
        for (int i=0;i<N;i++)
        {
            //tomb[i].kiír();
            tomb0[i].kiír();
        }
        out.print("Indexelt:");
        for (int i=0;i<N;i++)
        {
            tomb0[i].kiírindex(i);
        }
    }
}
class Methods
{
    public int elem;
    public void beolvas(Scanner bill, int i)
    {
        out.printf("Kérem a tömb %d elem értékét: ", i+1);
        elem=bill.nextInt();
    }
    public void kiír()
    {
        out.printf("%d\n",elem);
    }
}
class Kiírindex extends Methods
{
    public void kiírindex(int i)
    {
        out.printf("%d. elem: ", i+1);
        out.printf("%d\n", elem);
    }
}
