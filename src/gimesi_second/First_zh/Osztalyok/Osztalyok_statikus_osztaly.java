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
public class Osztalyok_statikus_osztaly {
    public static void main(String[] args) 
    { 
        //Tegla t = new Tegla();
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a téglatest hosszúságát: ");
        int a = billentyu.nextInt();
        out.print("Kérem a téglatest szélességét: ");
        int b = billentyu.nextInt();
        out.print("Kérem a téglatest magasságát: ");
        int c = billentyu.nextInt();
        //out.printf("\nA téglatest térfogata = %d\n", t.terfogat(a, b, c));
        //out.printf("A téglatest felszíne= %d\n",t.felszin(a, b, c));
        out.printf("\nA téglatest térfogata = %d\n", terfogat(a, b, c));
        out.printf("A téglatest felszíne= %d\n",  felszin(a, b, c));
    }
        private static int terfogat(int a, int b, int c) 
        {
            return a*b*c; 
        } 
        private static int felszin(int a, int b, int c)
        {
            return (2*a*b+2*a*c+2*b*c);
        }
}
class Tegla
{
    /*public int terfogat(int a, int b, int c) 
    {
        return a*b*c; 
    } 
    public int felszin(int a, int b, int c)
    {
        return (2*a*b+2*a*c+2*b*c);
    }*/
    
} 

