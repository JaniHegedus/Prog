package gimesi_second.Third_zh.Dolgozat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * 
 *           Szili Janka U45Y8A
 */

public class Szili_Janka extends JFrame
{
    private static final JFileChooser fc = new JFileChooser();
    
    public static void main(String[] args) {
        
        Student newStudent = new Student();

        JFrame frame = new JFrame("Tanulmányi Eredmények");
        JMenuBar mb = new JMenuBar();
        
        JMenuItem open = new JMenuItem("Fájl");
        JMenuItem exit,newd,modify,list,save;
        
        mb.add(open);
        
        mb.add(newd=new JMenuItem("New"));
        mb.add(modify=new JMenuItem("Modify"));
        mb.add(list=new JMenuItem("List"));
        mb.add(save=new JMenuItem("Save"));
        mb.add(exit=new JMenuItem("Exit"));

        JPanel panel = new JPanel();

        JLabel newLabel = new JLabel("Tanuló Neve:");
        newLabel.setMaximumSize(new Dimension(180,20));
        panel.add(newLabel);
        JTextField name= new JTextField();
        name.setMaximumSize(new Dimension(180,20));
        panel.add(name);

        JLabel clas1 = new JLabel("Tantárgy:");
        clas1.setMaximumSize(new Dimension(180,20));
        panel.add(clas1);
        JTextField clas = new JTextField();
        clas.setMaximumSize(new Dimension(180,20));
        panel.add(clas);

        JLabel grade1 = new JLabel("Érdemjegy: ");
        grade1.setMaximumSize(new Dimension(180,20));
        panel.add(grade1);
        JTextField grade = new JTextField();
        grade.setMaximumSize(new Dimension(180,20));
        panel.add(grade);


        open.addActionListener(e -> {
            fc.showOpenDialog(frame);
            try {
                beolvas(fc.getSelectedFile(),newStudent);
            }catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        
        newd.addActionListener(e -> {
            if(!newStudent.contains(String.valueOf(name.getText())))
            {
                if(Integer.parseInt(grade.getText())<=5&&Integer.parseInt(grade.getText())>=1)
                {
                    newStudent.add(name.getText(),clas.getText(),Integer.parseInt(grade.getText()));
                    showMessageDialog(frame,"Új Érdemjegy Létrehozva!");
                }
                else {
                    showMessageDialog(frame,"A szám nem lehet nagyobb mint 5 vagy kissebb mint 1");
                }
            }
                else {
                    showMessageDialog(frame,"Létezik már ilyen Nevvel érdemjegy");
                }
        });
        
        modify.addActionListener(e -> {
            try
            {
                showMessageDialog(frame,"Név alapján keres");
                Component source = (Component) e.getSource();
                newStudent.modify(
                        String.valueOf(showInputDialog(source,"Válasszon", "Modify", JOptionPane.QUESTION_MESSAGE, null, Student.createNameArray(), Student.createNameArray()[0])),
                        String.valueOf(showInputDialog(frame,"Tárgy")),
                        Integer.parseInt(showInputDialog(frame, "Tanuló Érdemjegye")));
            }catch (ArrayIndexOutOfBoundsException exception){
                showMessageDialog(frame,"List is empty");
            }
        });
        
        
        list.addActionListener(e -> {
            if(newStudent.show().isEmpty())
            {
                showMessageDialog(frame,"Empty");
            }
            else
            {
                showMessageDialog(frame,newStudent.show());
            }
        });
        save.addActionListener(e ->
        {
            if(newStudent.show().isEmpty())
            {
                showMessageDialog(frame,"Empty");
            }
            else
            {
                FilebaIr();
                showMessageDialog(frame,"File sikeresen létrehozva");
                
            }
        });
        
        
        exit.addActionListener(e -> System.exit(0));


        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(120,120, 120));

        frame.setJMenuBar(mb);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
    
    public static void FilebaIr(){
        try {
            PrintWriter writer = new PrintWriter("src/Generated/Tanulok.txt", "UTF-8");
            for (int i = 0; i < Student.StudList.size(); i++) {
                writer.println(Student.StudList.get(i).getName() + " " + Student.StudList.get(i).getClas() + " " + Student.StudList.get(i).getGrade());
            }
            writer.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void beolvas(File file,Student stu) throws IOException {
        try (Scanner be = new Scanner(file))
        {
            while(be.hasNext())
            {
                System.out.println(be.nextLine());
            }
            be.close();
        }catch (IOException error){
            System.out.println(error.getMessage());
            FilebaIr();
        }
    }
}
class Student{
    protected String name;
    protected String clas;
    protected int grade;
    
    static ArrayList<Student> StudList= new ArrayList<>();
    
    
    public Student(String name,String clas,int grade)
    {
        this.name=name;
        this.clas=clas;
        this.grade=grade;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void add(String name, String clas, int grade)
    {
        StudList.add(new Student(name,clas,grade));
    }
    
    public boolean contains(String name)
    {
        boolean igaz=false;
        for(Student stu : StudList)
        {
            if(stu.getName().equals(name))
            {
              
                igaz=true;
            }
            
        }
        return igaz;
    }
    
    public static String[] createNameArray()
    {
        String names[] = new String[StudList.size()];
        for(int i=0;i<StudList.size();i++)
        {
            
            names[i]=(StudList.get(i).getName());
            
        }
        
        return names;
    }
    
    
    public static String[] createStudNumberArray()
    {
        String studgrade[] = new String[StudList.size()];
        for(int i=0;i<StudList.size();i++)
        {
            
            studgrade[i]=(String.valueOf(StudList.get(i).getGrade()));
        }
        
        return studgrade;
    }
    
    
    public void modify(String name,String clas,int grade)
    {
        if(contains(name)){
            for(Student stu : StudList)
            {
                
                
                if(stu.getName().equals(name))
                {
                    stu.setClas(clas);
                    stu.setGrade(grade);
                    System.out.println("Modified");
                }
            }
            
        }
        
        else System.out.println("Object is not added");
    }
    
    public void remove(String name)
    {
        if(contains(name)){
            
            for(Student stu : StudList)
            {
                
                if(stu.getName().equals(name))
                {
                    
                    
                    StudList.remove(stu);
                    System.out.println("Removed");
                }
            }
        }
        
        else System.out.println("Object is not added");
    }
    
    
    public String show()
    {
        String result = "";
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < StudList.size(); i++)
        {
            
            result+= StudList.get(i).getName()+" "+ StudList.get(i).getClas()+" "+StudList.get(i).getGrade();
            builder.append(StudList.get(i).getName()+" "+ StudList.get(i).getClas()+" "+StudList.get(i).getGrade());
            if (i< StudList.size()-1)
            {
                
                result+=",\r\n";
                builder.append("\r\n");
            }
        }
        
        return builder.toString();
    }
}