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
public class Osztalyok_password {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Mi a jelszó? ");
        String jelszo = billentyu.next();
        out.println("A beírt jelszó: " + jelszo +"\n\n");
        if(jelszo.equals("alma")) out.println("\nA jelszó rendben van\n");
        else out.println("\nA beírt jelszó hibás!\n"); 
    } 
}
