/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimesi_second.first_zh.Osztalyok;

import static java.lang.System.out;

/**
 *
 * @author heged
 */
public class Osztalyok_method_string {
    public static void main(String[] args) 
    {
        String s1 = "alma";
        char data[] = {'k', 'ö', 'r', 't', 'e'};
        String s2 = new String(data);
        String s3 = "szilva";
        String s4 = s1 + "mag";
        out.println(s1);
        out.println(s2);
        out.println(s3);
        out.println(s4);
        for (int i=0; i<s2.length(); i++) out.printf("%c ", s2.charAt(i));
        out.println(); out.println(s4.toUpperCase());
        out.println(s2.indexOf("t"));
        out.println(s3.substring(2,5)); 
    } 
}
