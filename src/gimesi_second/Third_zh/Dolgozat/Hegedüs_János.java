package gimesi_second.Third_zh.Dolgozat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Hegedüs_János extends JFrame
{
    private static final JFileChooser fc = new JFileChooser();
    public static void main(String[] args) {
        library newLibrary = new library();

        JFrame frame = new JFrame("Dolgozat");
        JMenuBar mb = new JMenuBar();
        JMenuItem open = new JMenuItem("Fájl");
        JMenuItem exit,newd,modify,list;
        mb.add(open);
        mb.add(newd=new JMenuItem("Új adat"));
        mb.add(modify=new JMenuItem("Módosítása"));
        mb.add(list=new JMenuItem("Listázás"));
        mb.add(exit=new JMenuItem("Exit"));

        JPanel panel = new JPanel();

        JLabel newLabel = new JLabel("Könyvtári szám:");
        newLabel.setMaximumSize(new Dimension(200,20));
        newLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(newLabel);

        JTextField number= new JTextField();
        number.setMaximumSize(new Dimension(200,20));
        number.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(number);

        panel.add(Box.createRigidArea(new Dimension(0,20)));


        JLabel title = new JLabel("Cím:");
        title.setMaximumSize(new Dimension(200,20));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        JTextField title0 = new JTextField();
        title0.setMaximumSize(new Dimension(200,20));
        title0.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title0);

        panel.add(Box.createRigidArea(new Dimension(0,20)));

        JLabel author = new JLabel("Szerző: ");
        author.setMaximumSize(new Dimension(200,20));
        author.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(author);

        JTextField author0 = new JTextField();
        author0.setMaximumSize(new Dimension(200,20));
        author0.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(author0);

        panel.add(Box.createRigidArea(new Dimension(0,20)));
        JLabel newLabel0 = new JLabel("Kiadás éve:");
        newLabel0.setMaximumSize(new Dimension(200,20));
        newLabel0.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(newLabel0);

        JTextField number0 = new JTextField();
        number0.setMaximumSize(new Dimension(200,20));
        number0.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(number0);

        panel.add(Box.createRigidArea(new Dimension(0,20)));

        open.addActionListener(e -> {
            fc.showOpenDialog(frame);
            try {
                beolvas(fc.getSelectedFile(),newLibrary);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        newd.addActionListener(e -> {
            try{
                if(!newLibrary.contains(Integer.parseInt(String.valueOf(number.getText()))))
                {
                    newLibrary.add(Integer.parseInt(number.getText()),title0.getText(),author0.getText(),Integer.parseInt(number0.getText()));
                    kiír(fc.getSelectedFile(), newLibrary);
                    JOptionPane.showMessageDialog(frame,"Hozzáadva!");
                }
                else {
                    JOptionPane.showMessageDialog(frame,"Ezzel a könyvtári számmal létezik már könyv!");
                }
            }
            catch (NumberFormatException | IOException exception)
            {
                JOptionPane.showMessageDialog(frame,"Válasszon ki egy fájlt!");
            }
            catch (NullPointerException exception0)
            {
                JOptionPane.showMessageDialog(frame,"Válasszon ki egy fájlt!");
            }
        });
        modify.addActionListener(e -> {
            try
            {
                int reply =JOptionPane.showConfirmDialog(frame,"Szeretne cím alapján választani (Nem esetén Könyvtári szám alapján)");
                if(reply == JOptionPane.YES_OPTION)
                {
                    Component source = (Component) e.getSource();
                    newLibrary.modify(
                            String.valueOf(showInputDialog(source,"Válassza ki?", "Modify", JOptionPane.QUESTION_MESSAGE, null, library.createNameArray(), library.createNameArray()[0])),
                            Integer.parseInt(showInputDialog(frame,"Könyvtári szám")),
                            String.valueOf(showInputDialog(frame,"Új szerző")),
                            Integer.parseInt(showInputDialog(frame, "Új  kiadási év")));
                }
                else
                {
                    Component source = (Component) e.getSource();
                    newLibrary.modify(
                            Integer.parseInt(String.valueOf(showInputDialog(source,"Válassza ki?", "Modify", JOptionPane.QUESTION_MESSAGE, null, library.createLibNumberArray(), library.createLibNumberArray()[0]))),
                            String.valueOf(showInputDialog(frame,"Cím")),
                            String.valueOf(showInputDialog(frame,"Új szerző")),
                            Integer.parseInt(showInputDialog(frame, "Új  kiadási év")));
                }
            }catch (ArrayIndexOutOfBoundsException exception)
            {
                JOptionPane.showMessageDialog(frame,"The List is empty!");
            }
            catch (NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(frame,"Visszavonva");
            }
        });
        list.addActionListener(e -> {
            if(newLibrary.show().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Üres");
            }
            else
            {
                JOptionPane.showMessageDialog(frame,newLibrary.show());
            }
        });
        exit.addActionListener(e -> System.exit(0));


        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(55,202, 39));

        frame.setJMenuBar(mb);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
    public static void beolvas(File file,library lib) throws IOException {
        try (Scanner out = new Scanner(file))
        {
            while(out.hasNext())
            {
                System.out.println(out.nextLine());
            } out.close();
        }
        catch (IOException error)
        {
            System.out.println(error.getMessage());
            kiír(fc.getSelectedFile(),lib);
        }
    }
    public static void kiír(File file,library lib) throws IOException {
        PrintWriter newfile = new PrintWriter(new FileWriter(file));
        out(newfile,lib.show());
        newfile.close();
    }
    public static void out(PrintWriter file,String  sor)
    {
        file.println(sor);
    }
}
class library{
    protected int libnumber;
    protected String title;
    protected String author;
    protected int releaseyear;
    static ArrayList<library> libList= new ArrayList<>();
    public library(int libnumber,String title,String author,int releaseyear)
    {
        this.libnumber=libnumber;
        this.title=title;
        this.author=author;
        this.releaseyear=releaseyear;
    }

    public library() {

    }

    public int getLibnumber() {
        return libnumber;
    }

    public void setLibnumber(int libnumber) {
        this.libnumber = libnumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public void add(int libnumber, String title, String author, int releaseyear)
    {
        libList.add(new library(libnumber,title,author,releaseyear));
    }
    public boolean contains(String title)
    {
        boolean igaz=false;
        for(library lib : libList)
        {
            if(lib.getTitle().equals(title))
            {
                igaz=true;
            }
        }
        return igaz;
    }
    public boolean contains(int libnumber)
    {
        boolean igaz=false;
        for(library lib : libList)
        {
            if(lib.getLibnumber()==libnumber)
            {
                igaz=true;
            }
        }
        return igaz;
    }
    public static String[] createNameArray()
    {
        String names[] = new String[libList.size()];
        for(int i=0;i<libList.size();i++)
        {
            names[i]=(libList.get(i).getTitle());
        }
        return names;
    }
    public static String[] createLibNumberArray()
    {
        String libnums[] = new String[libList.size()];
        for(int i=0;i<libList.size();i++)
        {
            libnums[i]=(String.valueOf(libList.get(i).getLibnumber()));
        }
        return libnums;
    }
    public void modify(String title,int libnumber,String author,int releaseyear)
    {
        if(contains(title)){
            for(library lib : libList)
            {
                if(lib.getTitle().equals(title))
                {
                    lib.setAuthor(author);
                    lib.setReleaseyear(releaseyear);
                    lib.setLibnumber(libnumber);
                    System.out.println("Successfully modified!");
                }
            }
        }
        else System.out.println("This object is not added!");;
    }
    public void modify(int libnumber, String title,String author,int releaseyear)
    {
        if(contains(libnumber)){
            for(library lib : libList)
            {
                if(lib.getLibnumber()==libnumber)
                {
                    lib.setAuthor(author);
                    lib.setReleaseyear(releaseyear);
                    lib.setTitle(title);
                    System.out.println("Successfully modified!");
                }
            }
        }
        else System.out.println("This object is not added!");;
    }
    public void remove(String title)
    {
        if(contains(title)){
            for(library lib : libList)
            {
                if(lib.getTitle().equals(title))
                {
                    libList.remove(lib);
                    System.out.println("Successfully removed!");
                }
            }
        }
        else System.out.println("This object is not added!");;
    }
    public void remove(int libnumber)
    {
        if(contains(libnumber)){
            for(library lib : libList)
            {
                if(lib.getLibnumber()==libnumber)
                {
                    libList.remove(lib);
                    System.out.println("Successfully removed!");
                }
            }
        }
        else System.out.println("This object is not added!");;
    }
    public String show()
    {
        String result = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < libList.size(); i++)
        {
            result+= libList.get(i).getLibnumber()+" "+ libList.get(i).getTitle()+" "+libList.get(i).getAuthor()+" "+libList.get(i).getReleaseyear();
            builder.append(libList.get(i).getLibnumber()+" "+ libList.get(i).getTitle()+" "+libList.get(i).getAuthor()+" "+libList.get(i).getReleaseyear());
            if (i< libList.size()-1)
            {
                result+=",\r\n";
                builder.append("\r\n");
            }
        }
        //return result;
        return builder.toString();
    }
}