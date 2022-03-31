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
public class Osztalyok_teglatest 
{
    public static void main(String[] args) 
    {
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a téglatest hosszúságát: ");
        int a = billentyu.nextInt();
        out.print("Kérem a téglatest szélességét: ");
        int b = billentyu.nextInt();
        out.print("Kérem a téglatest magasságát: ");
        int c = billentyu.nextInt();
        out.printf("\nA téglatest térfogata = %d\n", tegla(a, b, c));
    } 
    private static int tegla(int a, int b, int c) 
    {
        return a*b*c; 
    } 
}
