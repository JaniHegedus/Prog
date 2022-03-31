/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.Second_zh.Exception;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Kivétel_0 {
    public static void main(String[] args) 
    {
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[100];
        int db = 0; // Feltöltés 
        do
        {
            out.printf("Kérem a %d. számot: ",db+1);
            try
            {
                tomb[db] = billentyu.nextInt(); 
            } 
            catch (Exception error)
            { 
                break; 
            } db++; 
        }
        while(true); // Kiírás 
        for(int i=0; i<db ;i++) out.println(tomb[i]); 
    
    }
} 

