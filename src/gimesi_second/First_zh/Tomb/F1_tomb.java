package gimesi_second.first_zh.Tomb;
import static java.lang.System.out;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class F1_tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        final int MAX=6;
        int db=0;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        for(int i=0; i<MAX; i++)
        {
            out.printf("Kérem az %d. hőmrésékletet: (°C)", i+1);
            tomb[i] = billentyu.nextInt();
        } 
        for(int i=0; i<MAX; i++)
        {
            if(100>tomb[i] && tomb[i]>0) db++;
        }
        out.printf("%ddb 0-10°C közötti hőmérséklet van.\n", db);
    }
}
