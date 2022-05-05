package gimesi_second.Third_zh.Button;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Button_3
{
    public static void main(String[] args)
    {
        Valto pénz = new Valto();
        pénz.valto();
    }
}
class Valto extends JFrame implements KeyListener, ItemListener, MouseListener
{
    JLabel sourceLabel = new JLabel(" "); JTextField text = new JTextField(5);
    JLabel label = new JLabel(" "); JComboBox<String> combo = new JComboBox<>();
    NumberFormat forint = NumberFormat.getCurrencyInstance(Locale.getDefault());
    NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    public void valto()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocation(400, 400);
        setTitle("Pénzváltó");
        add(sourceLabel);
        add(text);
        add(label);
        combo.addItem("Forintról Euróra");    //A legördülő lista összeállítása
        combo.addItem("Euróról Forintra");
        add(combo);
        setSize(400, 100);
        setVisible(true); text.addKeyListener(this);
        label.addMouseListener(this);
        combo.addItemListener(this);
    }
    void cimke()
    {
        String amountSt = "";
        String fromSt = "";
        try
        {
            double amount = Double.parseDouble(text.getText());
            if(combo.getSelectedItem().equals("Forintról Euróra"))
            {
                amountSt = " = " + euro.format(amount * 0.002857);
                fromSt = "Ft";
            }
            else if(combo.getSelectedItem().equals("Euróról Forintra"))
            {
                amountSt = " = " + forint.format(amount * 350);
                fromSt = "\u20AC";
            }
        }
        catch (NumberFormatException e)
        {
            amountSt = " Adjon meg egy számot! ";
        }
        label.setText(amountSt);
        sourceLabel.setText(fromSt);
    }
    @Override
    public void keyReleased(KeyEvent k)
    {
        //Amikor felengedtek egy billentyűt
        cimke();
    }
    @Override
    public void keyPressed(KeyEvent k)
    {
        //Lenyomtak egy billentyűt
    }
    @Override
    public void keyTyped(KeyEvent k)
    {
        //Alfanumerikus billentyűt lenyomtak,
        // majd felengedték
    }
    @Override
    public void itemStateChanged(ItemEvent i)
    {
        // A legördülő listából kiválasztottak
        cimke();              //egy elemet
    }
    @Override
    public void mouseEntered(MouseEvent m)
    {
        //Egér a komponens felett
        label.setForeground(Color.RED);
    }
    @Override
    public void mousePressed(MouseEvent m)
    {
        //Amig az egérgomb nyomva
    }
    @Override
    public void mouseReleased(MouseEvent m)
    {
        //Egérgomb felengedése
        label.setForeground(Color.green);
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        //Egér kattintás egy komponensen
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        //Egér elhagyja a komponenst
        label.setForeground(Color.BLACK);
    }
}