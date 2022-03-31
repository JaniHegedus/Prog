package gimesi_second.Tomb;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to chagimesi_second.first_zh.Tomblick nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class Láncolt_Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner billentyu = new Scanner (System.in);
        LinkedList<String> nevek = new LinkedList<>();
        out.print("K�rek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0)
        {
            nevek.add(nev);
            out.print("K�rek egy nevet: ");
            nev = billentyu.nextLine();
        } 
        out.println(nevek);
        out.print("K�rek egy nevet a lista elej�re: ");
        nev = billentyu.nextLine();
        nevek.addFirst(nev);
        out.print("K�rek egy nevet a lista v�g�re: ");
        nev = billentyu.nextLine();
        nevek.addLast(nev);
        out.println(nevek);
        out.print("K�rem a beszurand� n�v index�t: ");
        int szam = billentyu.nextInt();
        out.print("K�rem a beszurand� nevet: ");
        nev = billentyu.next();
        nevek.add(szam, nev);
        out.println(nevek);  out.print("K�rem a t�rlend? elem indexet: ");
        szam = billentyu.nextInt();
        out.println("A t�rlend? n�v: " + nevek.get(szam));
        nevek.remove(szam);out.println(nevek);
        out.print("K�rem a t�rlend? elemet: ");
        nev = billentyu.next();nevek.remove(nev);
        out.println(nevek);
    }
}
