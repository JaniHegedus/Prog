package gimesi_second.Third_zh.Components.Frame;

import javax.swing.*;

public class Jframe_2
{
    public static void main(String[] args)
    {
        Keret k = new Keret(); k.Ablak();
    }
}
class Keret extends JFrame
{
    public void Ablak()
    {
        setTitle("Az első ablakom");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Ez egy új szöveg"));
        setSize(500, 500); pack(); setVisible(true);
    }
}