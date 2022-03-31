package gimesi_second.first_zh.Tomb;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class Dinamikus_Tömb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        Scanner billentyu = new Scanner (System.in);
        ArrayList<String> nevek = new ArrayList<>();
        out.print("Kérek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0)
        {
            nevek.add(nev);
            out.print("Kérek egy nevet: ");
            nev = billentyu.nextLine();
        } 
        out.println(nevek);
        out.println("Az elemek sz�ma = " + nevek.size());
        //Tetsz?leges elem ki�r�sa
        out.print("Kérem a keresend? név indexét: ");
        int szam = billentyu.nextInt();
        out.println("A keresett név: " + nevek.get(szam));
        //Elem m�dos�t�sa
        out.print("Kérem a m�dos�tand� név indexét: ");
        szam = billentyu.nextInt();out.println("A keresett név: " + nevek.get(szam));
        out.print("Kérem az �j nevet: ");nev = billentyu.next();nevek.set(szam, nev);
        out.println(nevek);//Elem t�rl�se
        out.print("Kérek egy indexet: ");
        szam = billentyu.nextInt();out.println("A t�rlend? név: " + nevek.get(szam));
        nevek.remove(szam);
        out.println(nevek);
    } 
} 
    
