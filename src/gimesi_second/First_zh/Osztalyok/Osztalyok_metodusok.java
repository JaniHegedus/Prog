/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Osztalyok;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class Osztalyok_metodusok {
    static Scanner billentyu = new Scanner (System.in);
    public static void main(String[] args) 
    { 
        out.print("Kérem a játékosok számát: ");
        int jatekos = billentyu.nextInt();
        int nyero = 0; for(int i =0; i<jatekos; i++)
        {
            out.printf("\nKérem a %d. játékost!\n", i+1);
            int n=tipp(); if(nyero > n)nyero = n; 
        } 
        out.printf("\nA %d. játékos nyert\n", nyero+1);
        out.println("Köszönöm a játékot"); 
    }
    private static int tipp() 
    {
        int tippek = 0;
        int RSzam  = new Random().nextInt(10) + 1;
        out.print("Írj be egy számot 1 és 10 között: ");
        int beSzam = billentyu.nextInt();
        tippek++; while(beSzam != RSzam) 
        {
            out.print("*****Tippel újra: ");
            beSzam = billentyu.nextInt();
            tippek++; 
        } 
        out.printf("Eltaláltad! A tipjeid száma = %d\n",tippek);
        return tippek;
    }
}
