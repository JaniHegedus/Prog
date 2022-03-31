package gimesi_second.first_zh.Tomb;
import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author heged
 */
public class Beszúrásos_Rendezés {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int i;
        Scanner billentyu = new Scanner (System.in);
        LinkedList<String> nevek = new LinkedList<>();
        out.print("K�rek egy nevet: ");
        String nev = billentyu.nextLine();
        while(nev.length()!=0)
        {
            for(i=0; i<nevek.size(); i++)
            {
                if(nev.compareTo(nevek.get(i)) < 0)
                {
                    nevek.add(i, nev);break;
                } 
            }
            if( i == nevek.size())nevek.add(nev);
            out.print("K�rek egy nevet: ");
            nev = billentyu.nextLine();
        }
        out.println(nevek);
    }
}
