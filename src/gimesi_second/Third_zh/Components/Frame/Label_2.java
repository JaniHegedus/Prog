package gimesi_second.Third_zh.Components.Frame;
import java.awt.*;
import javax.swing.*;
public class Label_2
{
    JFrame ablak;
    JLabel cimke1;
    JLabel cimke2;
    public static void main(String[] args)
    {
        Ablak ob = new Ablak();
    }
}
class Ablak extends JFrame
{
    public Ablak()
    {
        JFrame ablak = new JFrame("Ablak kőzépre");
        JLabel szöveg1 = new JLabel("Első sor");
        JLabel szöveg2 = new JLabel("Második sor");
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setLayout(null);
        ablak.setSize(800, 600);
        setCenter(ablak);
        ablak.setResizable(false);
        szöveg1.setBounds(10, 10, 200, 30);
        szöveg2.setBounds(30, 30, 200, 30);
        ablak.add(szöveg1); ablak.add(szöveg2);
        ablak.setVisible(true);
    }
    private static void setCenter(Window frame)
    {
        Dimension közép = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((közép.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((közép.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}