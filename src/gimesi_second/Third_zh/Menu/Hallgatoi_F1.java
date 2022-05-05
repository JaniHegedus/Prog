package gimesi_second.Third_zh.Menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.lang.System.out;

public class Hallgatoi_F1
{
    public static void main(String[] args)
    {
        menu Menu = new menu("Teszt");
    }
}
class menu extends JFrame implements ActionListener
{
    JMenuBar mb;
    JPanel panel = new JPanel();
    JMenuItem miOpen,miExit;
    JMenuItem fekete = new JMenuItem("Fekete");
    JMenuItem kek = new JMenuItem("Kék");
    JMenuItem sarga =new JMenuItem("Sárga");
    JMenuItem zold =new JMenuItem("Zöld");
    JMenuItem piros =new JMenuItem("Piros");
    private final JFileChooser fc = new JFileChooser();
    public menu(String cim)
    {

        setBounds(500,200,350,100);
        setTitle(cim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(mb=new JMenuBar());
        JMenu File;
        mb.add(File=new JMenu("File"));
        File.add(miOpen = new JMenuItem("Open"));
        File.addSeparator();
        File.add(miExit = new JMenuItem("Exit"));
        JMenu mszin;
        mb.add(mszin=new JMenu("Szín"));
        mszin.add(fekete);
        mszin.add(kek);
        mszin.add(sarga);
        mszin.add(zold);
        mszin.add(piros);
        this.add(panel);
        setVisible(true);
        miOpen.addActionListener(this);
        miExit.addActionListener(this);
        fekete.addActionListener(this);
        kek.addActionListener(this);
        sarga.addActionListener(this);
        zold.addActionListener(this);
        piros.addActionListener(this);
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == miOpen)fc.showOpenDialog(this);
        else if(e.getSource()==miExit) System.exit(0);
        else if(e.getSource()==fekete) panel.setBackground(Color.BLACK);
        else if(e.getSource()==kek) panel.setBackground(Color.BLUE);
        else if(e.getSource()==sarga) panel.setBackground(Color.YELLOW);
        else if(e.getSource()==zold) panel.setBackground(Color.GREEN);
        else if(e.getSource()==piros) panel.setBackground(Color.RED);
    }
}