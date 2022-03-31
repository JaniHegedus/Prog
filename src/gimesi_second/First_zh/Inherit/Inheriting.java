/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Inherit;

import static java.lang.System.out;

/**
 *
 * @author heged
 */
public class Inheriting {
    public static void main(String[] args) 
    { 
        final String Formatum = "%5.2f %s -fok\n"; //Nem módosítható (konstans) 
        Homer0 hom = new Homer0();
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer0(25.6);
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer0(HomersekletSkala.FAHRENHEIT);
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        hom = new Homer0(2.73, HomersekletSkala.KELVIN);
        out.printf(Formatum, hom.getSzam(),hom.getSkala());
        ujHomer ujhom = new ujHomer();
        ujhom.kiir();
        ujhom = new ujHomer(25.6);
        ujhom.kiir();
        ujhom = new ujHomer(HomersekletSkala.FAHRENHEIT);
        ujhom.kiir();
        ujhom = new ujHomer(2.73, HomersekletSkala.KELVIN); ujhom.kiir(); 
    
    }
}
class Homer0 
{ 
    protected double szam;
    protected HomersekletSkala skala;
    public Homer0() 
    {
        szam = 12.0; skala = HomersekletSkala.CELSIUS; 
    }
    public Homer0(double szam) 
    { 
        this.szam = szam; skala = HomersekletSkala.RÉAUMUR; 
    }
    public Homer0(HomersekletSkala skala) 
    {
        szam = 9.8; this.skala = skala; 
    } 
    public Homer0(double szam, HomersekletSkala skala) 
    {
        this.szam = szam; this.skala = skala; 
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
class ujHomer extends Homer0
{ 
    public ujHomer() 
    {
        szam = 120.0;
        skala = HomersekletSkala.CELSIUS; 
    } 
    public ujHomer(double szam) 
    {
        super(szam); 
    }
    public ujHomer(HomersekletSkala skala) 
    {
        super(skala); 
    }
    public ujHomer(double szam, HomersekletSkala skala) 
    {
        super(szam, skala); 
    }
    public void kiir() 
    {
        out.printf("%5.2f %s -fok\n", getSzam(), getSkala()); 
    } 
}
