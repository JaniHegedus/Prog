/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimesi_second.first_zh.Dolgozat;
import java.util.Scanner; 
import static java.lang.System.out; 

public class BlágaKristóf1zh 
{
    public static void main(String[] args) 
    {
        tomb t = new tomb();
        t.tolt();
    }
    
}
class tomb
{
    class valt
    {
        public String szoveg;
        public int hossz;
    }
    public static valt sz[] = new valt[50];
    public void tolt() 
    {
        Scanner billentyu = new Scanner (System.in); 
        out.println("Kérem a szöveget: "); 
        sz[0].szoveg = billentyu.next();
        sz[0].hossz = sz[0].szoveg.length();
        int i = 1;
        while (sz[i-1].hossz!=0)
        {
            out.println("Kérem a következő szöveget: ");
            sz[i].szoveg = billentyu.nextLine();
            sz[i].hossz = sz[i].szoveg.length();
            i++;
        }
    }
}