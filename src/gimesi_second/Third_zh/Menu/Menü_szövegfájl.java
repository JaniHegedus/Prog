package gimesi_second.Third_zh.Menu;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Menü_szövegfájl
{
    public static void main(String[] args)
    {
        Menü0 menü = new Menü0("Fájl kiírás");
    }
}
class Menü0 extends JFrame implements ActionListener
{
    JMenuItem exit;
    JMenuItem open;
    private final JFileChooser fc = new JFileChooser();
    public Menü0(String cim)
    {
        setSize(400,150);
        setTitle(cim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar mb;
        JMenu File;
        setJMenuBar(mb=new JMenuBar());
        mb.add(File=new JMenu("File"));
        mb.add(new JMenu("Help"));
        File.add(open = new JMenuItem("Open"));
        File.addSeparator();
        File.add(exit = new JMenuItem("Exit"));
        setVisible(true);
        open.addActionListener(this);
        exit.addActionListener(this);
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == open)
        {
            fc.showOpenDialog(this);
            beolvas(fc.getSelectedFile()); //dispose();
        }
        if(e.getSource()==exit) System.exit(0);
    }
    public void beolvas(File file)
    {
        try (Scanner out = new Scanner(file))
        {
            while(out.hasNext())
            {
                System.out.println(out.nextLine());
            } out.close();
        }
        catch (NullPointerException error)
        {
            System.out.println(error.getMessage());
            JOptionPane.showMessageDialog(null, "Nincs fájlnév","Fájl hiba",JOptionPane.ERROR_MESSAGE);
        }
        catch (IOException error)
        {
            JOptionPane.showMessageDialog(null, error.getMessage(),"Fájl hiba",JOptionPane.ERROR_MESSAGE);
        }
    }
}