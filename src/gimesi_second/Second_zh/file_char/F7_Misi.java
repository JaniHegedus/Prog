package gimesi_second.Second_zh.file_char;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class F7_Misi
{
    public static void main(String[] args) throws IOException {
        PrintWriter file = new PrintWriter("Generated/fajl.txt");
        System.out.println("Adja meg a számot!");
        Scanner beker = new Scanner(System.in);
        double num = beker.nextDouble();
        while(num !=0){
            file.println(num);
            System.out.println("Adja meg a számot!");
            num = beker.nextDouble();
        }
        file.close();

        BufferedReader file2 = new BufferedReader(new FileReader("Generated/fajl.txt"));
        out.println("Az átlag: " + atlag(file2));

    }
    public static double atlag(BufferedReader file) throws IOException {
        String c;
        double oszto=0;
        double szumm = 0;
        while((c=file.readLine()) != null){
            szumm+=Double.parseDouble(c);
            oszto++;
        }
        return  szumm / oszto;
    }
}

