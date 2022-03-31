/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.alapok;
import static java.lang.System.out;
/**
 *
 * @author heged
 */
public class primszamok {
    public static void main(String[] args)
    {
        int M=1000000;
        int n;
        int count=0;
        for (int szam=2;szam<M+1;szam++)
        {
            n=0;
            for (int i=2;i<Math.sqrt(szam);i++)
            {
                if(szam%i==0)
                {
                    n++;
                }  
            }
            if (n==0)
            {
                //out.printf("%d\n",szam);
                count++;
            }
        }
        out.printf("%d-ig ", M);
        out.printf("%ddb prím van\n", count);
    }
}
