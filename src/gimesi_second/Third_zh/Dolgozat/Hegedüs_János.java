package gimesi_second.Third_zh.Dolgozat;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import static javax.swing.JOptionPane.showMessageDialog;


public class Hegedüs_János
{
    public static void main(String[] args)
    {

        AtomicBoolean gene= new AtomicBoolean(false);
        AtomicBoolean mini= new AtomicBoolean(false);
        AtomicBoolean maxi= new AtomicBoolean(false);
        AtomicBoolean atli= new AtomicBoolean(false);

        JFileChooser fc = new JFileChooser();
        JFrame frame = new JFrame("Dolgozat");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("Fájl");
        JMenu vs;
        JMenuItem exit,gen,max,min,átlag,save,open;
        mb.add(file);
        mb.add(vs=new JMenu("Véletlen számok"));
        vs.add(gen=new JMenuItem("Generálás"));
        vs.add(min=new JMenuItem("Minimum"));
        vs.add(max=new JMenuItem("Maximum"));
        vs.add(átlag=new JMenuItem("Átlag"));
        vs.add(save=new JMenuItem("Mentés"));
        file.add(open=new JMenuItem("Open"));
        file.add(exit=new JMenuItem("Exit"));
        open.addActionListener(e -> {
            fc.showOpenDialog(frame);
            beolvas(fc.getSelectedFile(),frame);
        });
        int szamok[] = new int[1000];
        gen.addActionListener(e -> {
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                szamok[i]=rand.nextInt(0,1001);
            }
            gene.set(true);
        });
        exit.addActionListener(e -> System.exit(0));
        final int[] legkissebb = {1000};
        min.addActionListener(e -> {
            if(gene.get()){
            for(int elem:szamok)
            {
                if (elem< legkissebb[0]) legkissebb[0] =elem;
            }
            mini.set(true);
            showMessageDialog(frame,"A legkissebb szám: "+ legkissebb[0] +"!");}
            else showMessageDialog(frame,"Nincs generált szám");
        });
        final int[] legnagyobb = {0};
        max.addActionListener(e -> {
            if(gene.get()){
            for(int elem:szamok)
            {
                if (elem> legnagyobb[0]) legnagyobb[0] =elem;
            }
            maxi.set(true);
            showMessageDialog(frame,"A legnagyobb szám: "+ legnagyobb[0] +"!");}
            else showMessageDialog(frame,"Nincs generált szám");
        });
        final float[] atlag = new float[1];
        átlag.addActionListener(e -> {
            if(gene.get()){
                int osszeg=0;
                for(int elem:szamok)
                {
                   osszeg+=elem;
                }
                atlag[0] = (float) osszeg / (float) szamok.length;
                showMessageDialog(frame,"A számok átlaga: "+ atlag[0] +"!");
                atli.set(true);
            }
            else showMessageDialog(frame,"Nincs generált szám");
        });
        save.addActionListener(e -> {
            try {
                if(mini.get())
                {
                    if(maxi.get())
                    {
                        if (atli.get()){

                            kiír(fc.getSelectedFile(),"Minimum: "+ legkissebb[0] +"\nMaximum: "+ legnagyobb[0] +"\nÁtlag: "+ atlag[0]);
                            showMessageDialog(frame,"Sikeres mentés");
                            System.out.println("A file tartalma:");
                            beolvas(fc.getSelectedFile(),frame);
                        }
                        else showMessageDialog(frame,"Nincs átlag számolva");
                    }
                    else showMessageDialog(frame,"Nincs maximum számolva");
                }
                else showMessageDialog(frame,"Nincs minimum számolva");
            } catch (IOException ex) {
                showMessageDialog(frame,"Sikertelen mentés");
                throw new RuntimeException(ex);
            }
            catch (NullPointerException error)
            {
                showMessageDialog(frame,"Válasszon ki egy filet!");
            }
        });
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
            showMessageDialog(frame,"Nincs file.");
        }
        return filecontent;
    }
    public static void kiír(File file,String content) throws IOException {
        PrintWriter newfile = new PrintWriter(new FileWriter(file));
        out(newfile,content);
        newfile.close();
    }
    public static void out(PrintWriter file,String  sor)
    {
        file.println(sor);
    }
}
