/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gimesi_second.Second_zh.Exception;

import java.io.IOException;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 *
 * @author heged
 */
public class Switch_5_3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    { 
        out.print("Kérek egy tetszőleges karaktert: ");
        char karakter = (char) in.read();
        switch (karakter)
        {
            case '0' -> out.println("nulla");
            case '1' -> out.println("egy");
            case '2' -> out.println("kettő");
            case '3' -> out.println("három");
            case '4' -> out.println("négy");
            case '5' -> out.println("öt");
            case '6' -> out.println("hat");
            case '7' -> out.println("hét");
            case '8' -> out.println("nyolc");
            case '9' -> out.println("kilenc");
            default -> out.println("Nem szám karakter"); 
        }    
    } 
}
