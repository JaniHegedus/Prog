package gimesi_second.first_zh.alapok;
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
public class Honapok {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int db = 0;Scanner billentyu = new Scanner(System.in);out.print("K�rem a h�nap sz�m�t: ");
        int n = billentyu.nextInt();
        while(n!=0)
        {
            switch(n){
                case 1, 2, 12 -> 
                {
                    out.println("t�l");db++;
                }
                case 3,4, 5 -> out.println("tavasz");
                case 6,7, 8 -> out.println("ny�r");
                case 9,10,11 -> out.println("?sz"); 
                default -> out.println("Hib�s h�napsz�m");
            }
            out.println("K�rem a h�nap sz�m�t: ");
            n = billentyu.nextInt();
        }
        out.printf("A t�li h�napok sz�ma: %d\n", db);
    }
}
