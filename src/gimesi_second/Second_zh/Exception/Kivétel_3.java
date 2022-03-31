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
public class  Kivétel_3 {
    public static void main(String[] args) 
    { 
        Scanner billentyu = new Scanner (System.in);
        out.print("Mi a jelszó? ");
        String jelszo = billentyu.next();
        out.println(teszt(jelszo));
    }
    public static String teszt(String jelszo)
    {
        try
        {
            if(jelszo.equals("alma")) return"A jelszó rendben van";
            else throw new Exception(); 
        } 
        catch(Exception err)
        { 
            return "A beírt jelszó hibás!"; 
        }
    }
}
