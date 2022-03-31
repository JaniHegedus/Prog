    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Osztalyok;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Osztalyok_tomb_hallgatoifel {
    public static void main(String[] args) 
    {
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[100];
        int db = 0; // Feltöltés
        out.printf("Kérem a %d. számot: ",db+1);
        tomb[db] = billentyu.nextInt();
        while(tomb[db]!=0)
        {
            db++; out.printf("Kérem a %d. számot: ",db+1);
            tomb[db] = billentyu.nextInt();
        } 
        out.println("A legkisebb érték = " + min(tomb, db));
        out.println("A legnagyobb érték = " + max(tomb, db)); // Rendezés
        Rendez.rendez(tomb, db); for(int i=0; i<db ;i++) out.println(tomb[i]);
    } 
    static int min(int[] t, int n)
    {  // Minimum-maximum keresés 
        int min; min = t[0];
        for(int i=1; i<n; i++) if(min > t[i])min = t[i];
        return min; 
    } 
    static int max(int[] t, int n)
    { // Minimum-maximum keresés 
        int max; max = t[0];
        for(int i=1; i<n; i++) if(max < t[i])max = t[i];
        return max; 
    
    }
} 
class Rendez
{
    public static void rendez(int[] t, int n)
    { 
        int csere;
        for(int j=0; j<n-1; j++) for(int i=0; i<n-j-1; i++) if(t[i]>t[i+1])
        {
            csere=t[i]; t[i]=t[i+1]; t[i+1]=csere; 
        } 
    } 
} 
