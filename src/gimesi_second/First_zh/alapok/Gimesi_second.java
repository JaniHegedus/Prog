/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimesi_second.first_zh.alapok;

/**
 *
 * @author heged
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
public class Gimesi_second
{

    /**
     *
     * @param args
     * @throws InputMismatchException
     */
    public static void main(String[] args) throws InputMismatchException
    {
        Scanner billentyu = new Scanner (System.in);
        float homerseklet =0;
        int szamlaloa =0;
        int szamlalof =0;
        while (homerseklet> -273.16)
        {
            out.print("Kérek egy hőmérsékletet az abszolút hőmérsékletig (-273)");
            homerseklet = billentyu.nextInt();
            if (homerseklet<0) 
            {
                szamlaloa++;
            }
            else if(homerseklet>100) 
            {
               szamlalof++;
            }
        }
        out.printf("Eddig %d fagypont alatti ", szamlaloa);
        out.printf("és %d forráspont feletti érték volt\n", szamlalof);
        int ho =-1;
        int tel=0;
        while (ho!=0)
        {
            out.print("Kérek egy hónapszámot (0 végjelig)");
            ho = billentyu.nextInt();
            /*
            switch(ho)
            {
                case 12,1,2->
                {
                    out.print("Tél\n"); 
                    tel++;
                }
                case 3,4,5->out.print("Tavasz\n");
                case 6,7,8->out.print("Nyár\n");
                case 9,10,11->out.print("Ősz\n");
                default -> out.print("Hibás hónap!\n");
            }           
            */
            if(ho==12||ho==1||ho==2)
            {
                out.print("Tél\n");
                tel++;
            } 
            else if(ho==3||ho==4||ho==5) 
            {
                out.print("Tavasz\n");
            }
            else if(ho==6||ho==7||ho==8) 
            {
                out.print("Nyár\n");
            }
            else if(ho==9||ho==10||ho==11) 
            {
                out.print("Ősz\n");
            }
            else
            {
                out.print("Hibás hónap!\n");
            }
        }
        out.printf("Téli hónapok száma: %d\n",tel);
    }
    
}

