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
public class F10_Osztalyok {
    public static void main(String[] args) 
    { 
        Gomb g = new Gomb();
        Scanner billentyu = new Scanner (System.in);
        out.print("Kérem a gömb sugarát ");
        int r = billentyu.nextInt();
        out.printf("\nA gömb térfogata = %.2f\n", g.terfogat(r));
        out.printf("A gömb felszíne= %.2f\n",  g.felszin(r));
    }
}
class Gomb
{
    public float terfogat(int r) 
    {
        return (float) ((4*r*r*r*3.14)/3); 
    } 
    public float felszin(int r)
    {
        return (float) (4*r*r*3.14);
    }
} 
