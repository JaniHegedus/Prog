package gimesi_second.Third_zh.Dolgozat;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Molnar_Levente
{
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        JFrame frame = new JFrame("Dolgozat");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("Fájl");
        JMenu out;
        JMenuItem exit,kisbetu,nagybetu,szamok,karakterek,open;
        mb.add(file);
        mb.add(out=new JMenu("kiírás"));
        out.add(kisbetu=new JMenuItem("kisbetük"));
        out.add(nagybetu=new JMenuItem("nagybetük"));
        out.add(szamok=new JMenuItem("számok"));
        out.add(karakterek=new JMenuItem("karakterek"));
        file.add(open=new JMenuItem("Open"));
        file.add(exit=new JMenuItem("Exit"));

        open.addActionListener(e -> {
            fc.showOpenDialog(frame);
            beolvas(fc.getSelectedFile(),frame);
        });
        kisbetu.addActionListener(e -> {
            try{
                int count=0;
                for (String elem:beolvas(fc.getSelectedFile(),frame))
                {
                    for (int i = 0; i < elem.length(); i++) {
                        if(elem.charAt(i)>='a'&&elem.charAt(i)<='z'){
                            count++;
                        }
                    }
                }
                JOptionPane.showMessageDialog(frame, "A kisbetűk száma a file-ban:"+count);
            }catch (NullPointerException err)
            {
                JOptionPane.showMessageDialog(frame,"Nincs file kiválasztva");
            }

        });
        nagybetu.addActionListener(e -> {
            try{
                int count=0;
                //System.out.println(count);
                for (String elem:beolvas(fc.getSelectedFile(),frame))
                {
                    for (int i = 0; i < elem.length(); i++) {
                        //System.out.println(elem);
                        if(elem.charAt(i)>='A'&&elem.charAt(i)<='Z'){
                            //System.out.println(elem.charAt(i));
                            count++;
                        }
                    }
                }
            JOptionPane.showMessageDialog(frame, "A nagybetűk száma a file-ban:"+count);
            }catch (NullPointerException err)
            {
                JOptionPane.showMessageDialog(frame,"Nincs file kiválasztva");
            }
        });
        szamok.addActionListener(e -> {
            try {
                int count = 0;
                for (String elem : beolvas(fc.getSelectedFile(), frame)) {
                    for (int i = 0; i < elem.length(); i++) {
                        if (elem.charAt(i) >= '0' && elem.charAt(i) <= '9') {
                            count++;
                        }
                    }
                }
                JOptionPane.showMessageDialog(frame, "A számok száma a file-ban:" + count);
            }catch (NullPointerException err)
            {
                JOptionPane.showMessageDialog(frame,"Nincs file kiválasztva");
            }
        });
        karakterek.addActionListener(e -> {
            try {
                int count = 0;
                for (String elem : beolvas(fc.getSelectedFile(), frame)) {
                    for (int i = 0; i < elem.length(); i++) {
                        count++;
                    }
                }
                JOptionPane.showMessageDialog(frame, "A számok száma a file-ban:" + count);
            }catch (NullPointerException err)
            {
                JOptionPane.showMessageDialog(frame,"Nincs file kiválasztva");
            }
        });

        exit.addActionListener(e -> System.exit(0));


        frame.setJMenuBar(mb);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
    public static ArrayList<String> beolvas(File file,JFrame frame)
    {
        ArrayList<String> filecontent = new ArrayList<>();
        try (Scanner be = new Scanner(file))
        {
            while(be.hasNext())
            {
                String sor=be.nextLine();
                filecontent.add(sor);
                System.out.println(sor);
            }
            be.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
            JOptionPane.showMessageDialog(frame,"Nincs file.");
        }
        return filecontent;
    }
}
