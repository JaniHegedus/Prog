package gimesi_second.Third_zh.Menu;

import javax.swing.*;
import static java.lang.System.out;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hallgatoi_F2
{
    public static void main(String[] args)
    {
        new menü2("Menü teszt");
    }
}
class menü2 extends JFrame implements ActionListener
{
    JMenuBar mb;
    JTextArea outputArea = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane(outputArea);
    JMenuItem miExit;
    JMenuItem miOpen;
    JMenuItem miFiu;
    JMenuItem miLány;
    JMenuItem miLista1, miLista2;
    JMenuItem miHasznál, miNévjegy;
    JCheckBoxMenuItem cbNyomtató;
    private final JFileChooser fc = new JFileChooser();
    public menü2(String cim)
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
        JMenu mFelvitel;
        mb.add(mFelvitel=new JMenu("Felvitel"));
        JMenu mHallgató = new JMenu("Hallgatók");
        mFelvitel.add(mHallgató);
        mFelvitel.add(new JMenu("Tanárok"));
        mHallgató.add(miFiu = new JMenuItem("Fiuk",'F'));
        mHallgató.add(miLány = new JMenuItem("Lányok",'L'));
        JMenu mLista = new JMenu("Lista");
        mb.add(mLista);
        mLista.add(miLista1 = new JMenuItem("Lista 1"));
        mLista.add(miLista2 = new JMenuItem("Lista 2"));
        mLista.addSeparator();
        mLista.add(cbNyomtató = new JCheckBoxMenuItem("Nyomtató"));
        JMenu mHelp;
        mb.add(mHelp = new JMenu("Help"));
        mHelp.add(miHasznál = new JMenuItem("Leírás", new ImageIcon("help.jpg")));
        mHelp.add(miNévjegy = new JMenuItem("Névjegy"));
        setVisible(true);
        this.add(jScrollPane);

        miOpen.addActionListener(this);
        miExit.addActionListener(this);
        miFiu.addActionListener(this);
        miLány.addActionListener(this);
        miLista1.addActionListener(this);
        miLista2.addActionListener(this);
        cbNyomtató.addActionListener(this);
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == miOpen)
        {
            fc.showOpenDialog(this);
            fileinfo();
            try {
                content();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource()==miExit) System.exit(0);
        else if(e.getSource() == miLista1)lista1();
        else if(e.getSource() == miLista2)lista2();
        else if(e.getSource() == miFiu)out.println("Fiúk felvétele");
        else if(e.getSource() == miLány)out.println("Lányok felvétele");
        else if(e.getSource() == cbNyomtató)
            if(cbNyomtató.getState())out.println("Nyomtatóra");
            else out.println("Nem nyomtatóra");
    }
    void lista1()
    {
        JFrame Lista = new JFrame("Lista1");
        Lista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Lista.setLocation(getX() + 10, getY() + 60);
        Lista.setSize(300,100);
        Lista.setVisible(true);
    }
    void lista2()
    {
        JFrame Lista = new JFrame("Lista2");
        Lista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Lista.setLocation(getX() + 100, getY() + 60);
        Lista.setSize(300,100); Lista.setVisible(true);
    }
    void fileinfo()
    {
        File name = fc.getSelectedFile();
        if (name.exists()) // if name exists, output information about it
        {
            // display file (or directory) information
            outputArea.setText(String.format(
                    "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", name
                            .getName(), " exists", (name.isFile() ? "is a file"
                            : "isn't a file"),
                    (name.isDirectory() ? "is a directory"
                            : "isn't a directory"),
                    (name.isAbsolute() ? "is absolute path"
                            : "isn't absolute path"), "Last modified: ", name
                            .lastModified(), "Length: ", name.length(),
                    "Path: ", name.getPath(), "Absolute path: ", name
                            .getAbsolutePath(), "Parent: ", name.getParent()));

            if (name.isDirectory()) // output directory listing
            {
                String directory[] = name.list();
                outputArea.append("\n\nDirectory contents:\n");

                for (String directoryName : directory)
                    outputArea.append(directoryName + "\n");
            }
        }
        else // not file /directory, display error
        {
            JOptionPane.showMessageDialog(this, name + " does not exist.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    void content() throws FileNotFoundException {
        File file = fc.getSelectedFile();
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
        {
            String sor= sc.nextLine();
            outputArea.setText(String.format(sor));
        }
    }
}
