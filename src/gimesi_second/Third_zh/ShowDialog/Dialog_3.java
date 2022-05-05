package gimesi_second.Third_zh.ShowDialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dialog_3
{
    public static void main(String[] args)
    {
        ColorTest colorTest = new ColorTest();
        colorTest.Test();
    }
}
class ColorTest extends JFrame implements ActionListener
{
    private JButton btszin = new JButton("Szín kiválasztása");
    private Color color;
    public void Test()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,150);
        setTitle("Színteszt");
        setLayout(new FlowLayout());
        add(btszin);
        setVisible(true);
        btszin.addActionListener(this); color=btszin.getBackground();
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        color=JColorChooser.showDialog(this, "A gomb színe", color);
        if(color != null)btszin.setBackground(color);
    }
}