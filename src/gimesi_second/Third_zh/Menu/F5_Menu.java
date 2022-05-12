package gimesi_second.Third_zh.Menu;

import javax.swing.*;
import java.awt.*;

public class F5_Menu {



    public static void main(String[] args) {



        // Menu
        JMenuBar mb;
        JMenu file = new JMenu("File");
        JMenuItem exit,compare;

        // Creat Frame
        JFrame frame = new JFrame();

        frame.setTitle("Cím");

        frame.setJMenuBar(mb=new JMenuBar());
        file.add(compare=new JMenuItem("Összehasonlítás"));
        file.add(exit=new JMenuItem("Exit"));
        mb.add(file);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(39,202,191));

        panel.add(Box.createRigidArea(new Dimension(0,10)));

        JLabel lbl1 =new JLabel("Szam 1");
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lbl1);

        JTextField field1 = new JTextField();
        field1.setMaximumSize(new Dimension(200,50));
        field1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(field1);

        panel.add(Box.createRigidArea(new Dimension(0,20)));

        JLabel lbl2 =new JLabel("Szam 2");
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lbl2);

        JTextField field2 = new JTextField();
        field2.setMaximumSize(new Dimension(200,50));
        field2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(field2);

        compare.addActionListener(e -> {
            try {
                if(!field1.getText().trim().equals("") && !field2.getText().trim().equals("")){
                    if(field1.getText().trim().equals(field2.getText().trim())) {
                        JOptionPane.showMessageDialog(frame,"egyenlo");
                    }
                    else if(Integer.parseInt(field1.getText().trim())<Integer.parseInt(field2.getText().trim())){
                        JOptionPane.showMessageDialog(frame,"Szam 2 a nagyobb");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Szam 1 a nagyobb");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Nem adott meg erteket");
                }
            }catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(frame,"Betut adtal meg");
            }

        });

        exit.addActionListener(e -> {
            System.exit(0);
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(panel);
    }}