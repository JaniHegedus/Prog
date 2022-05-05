package gimesi_second.Third_zh.Button;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Button_1
{
    public static void main(String[] args)
    {
        Gomb ob = new Gomb(); ob.keret();
    }
}
class Gomb extends JFrame
{
    public void keret()
    {
        setTitle("Ne nyomd meg a gombot");
        setLayout(new FlowLayout());   //Komponensek egymás után
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add (new JButton ("Gomb"));
        setSize(600,200);
        setVisible(true);
    }
}
