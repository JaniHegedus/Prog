package gimesi_second.Tomb;
import static java.lang.System.out;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfgimesi_second.first_zh.TombSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class Tömb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        final int MAX=5;
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[MAX];
        //  Felt�lt�s
        for(int i=0; i<MAX; i++)
        {
            out.printf("K�rem az %d. sz�mot: ", i+1);
            tomb[i] = billentyu.nextInt();
        } 
        //  Minimum-maximum keres�s
        int min, max;min = max = tomb[0];
        for(int i=1; i<MAX; i++)
        {
            if(min > tomb[i])min = tomb[i];if(max < tomb[i])max = tomb[i];
        }
        out.println("A legkisebb �rt�k = " + min);
        out.println("A legnagyobb �rt�k = " + max);
        //  Rendez�sint csere;for(int j=0; j<MAX-1; j++)for(int i=0; i<MAX-j-1; i++)if(tomb[i]>tomb[i+1]){csere=tomb[i];tomb[i]=tomb[i+1];tomb[i+1]=csere;} 
        //  Ki�r�s kiterjesztett for ciklussalfor(int i: tomb){out.println(i);
    }
}
