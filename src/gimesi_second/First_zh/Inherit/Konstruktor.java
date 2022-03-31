/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.System.out;
import javax.lang.model.SourceVersion;
//enum
enum HomersekletSkala {CELSIUS, FAHRENHEIT, KELVIN, RÉAUMUR}; 
/**
 *
 * @author heged
 */
public class Konstruktor 
{
    public static void main(String[] args) 
    { 
        final String Formatum = "%5.2f %s -fok\n";
        Homer hom = new Homer();
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer(25.6);
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer(HomersekletSkala.FAHRENHEIT);
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer(2.73, HomersekletSkala.KELVIN);
        out.printf(Formatum, hom.getSzam(),hom.getSkala()); 
    }
}
class Homer 
{
    private final double szam;
    private final HomersekletSkala skala;
    public Homer() 
    { 
        szam = 12.0;
        skala = HomersekletSkala.CELSIUS;
    }
    public Homer(double szam) 
    { 
        this.szam = szam;
        skala = HomersekletSkala.RÉAUMUR; 
    }
    public Homer(HomersekletSkala skala) 
    { 
        szam = 9.8;
        this.skala = skala; 
    } 
    public Homer(double szam, HomersekletSkala skala)
    { 
        this.szam = szam;
        this.skala = skala; 
    }
    public double getSzam() 
    { 
        return szam; 
    }
    public HomersekletSkala getSkala() 
    { 
        return skala; 
    } 
} 
