/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package gimesi_second.first_zh.Tomb;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F2_tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int igen=0;
        Scanner billentyu = new Scanner (System.in);
        ArrayList<Integer> eletkor = new ArrayList<>();
        out.print("Kérek egy életkort: ");
        int kor = billentyu.nextInt();
        while(kor!=0)
        {
            eletkor.add(kor);
            out.print("Kérek egy életkort: (0-ig)");
            kor = billentyu.nextInt();
        } 
        out.println(eletkor);
        for (int i=0; i<eletkor.size(); i++)
        {
            if (eletkor.get(i)<59 && eletkor.get(i)>30)
            {
                igen++;
            }
        }
        out.printf("%ddb 30-59 év közötti ember van", igen);
    }
}
