package gimesi_second.Third_zh.Components.Frame;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
public class Jframe_4
{
    public static void main(String[] args)
    {
        Kiír0 k = new Kiír0();
        k.Ki();
    }
}
class Kiír0 extends JFrame
{
    public void Ki()
    {
        String sor;
        DefaultListModel<String> lm = new DefaultListModel<>();
        JList<String> jl = new JList<>(lm);
        JScrollPane scroll = new JScrollPane(jl);
        scroll.setPreferredSize(new Dimension(300, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400,400);
        try (Scanner file = new Scanner(new File("src\\jframe_4\\jframe_4.java")))
        {
            while(file.hasNext()) { sor = file.nextLine(); lm.addElement(sor);
            }
            file.close();
        }
        catch (IOException error)
        {
            System.err.println("Hiba: " + error.getMessage());
        }
        finally
        {
            add(scroll);
            setTitle("jframe_4.java ");
            pack();
            setVisible(true);
        }
    }
}
