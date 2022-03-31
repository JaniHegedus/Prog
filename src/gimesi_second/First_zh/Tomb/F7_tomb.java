/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Tomb;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author heged
 */
public class F7_tomb {
    public static void main(String args[]) {
        int paros=0;
        int paratlan=0;
        Scanner billentyu = new Scanner (System.in);
        ArrayList<Integer> szamok = new ArrayList<>();
        out.print("Kérek egy számot: ");
        int szam = billentyu.nextInt();
        while(szam!=0)
        {
            szamok.add(szam);
            out.print("Kérek egy számot: ");
            szam = billentyu.nextInt();
        }
        for (int i=0;i<szamok.size();i++)
        {
            if (szamok.get(i)%2==0) paros++;
            else paratlan++;
        }
        out.printf("%ddb páros és ", paros);
        out.printf("%ddb páratlan szám van a listában\n", paratlan);
    }
}
