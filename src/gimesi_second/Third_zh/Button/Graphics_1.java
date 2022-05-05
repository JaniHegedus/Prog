package gimesi_second.Third_zh.Button;

import java.awt.Color; import java.awt.Font; import java.awt.Graphics; import javax.swing.JFrame;
public class Graphics_1
{
    public static void main(String[] args)
    {
        Keret keret = new Keret(new Rajz());
        keret.setVisible(true);
    }
}
class Keret extends JFrame
{
    Rajz rajz; public Keret (Rajz rajz)
    {
        this.rajz = rajz; set();
    }
    private void set()
    {
        setTitle("Ez egy rajz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(1200,200);
    }
    @Override
    public void paint(Graphics g)
    {
        rajz.paint(g);
    }
}
class Rajz
{
    public void paint ( Graphics gr )
    {
        gr.setColor( Color.yellow );
        gr.fillRect( 100, 100, 200, 150 );
        gr.setColor( Color.blue );
        for(int i=1; i<10; i++) gr.drawRect(100, 100, i*20, i*10 );
        gr.setColor( Color.green );
        gr.drawOval(300, 300, 100, 100);
        gr.setColor( Color.red );
        gr.drawLine(250, 250, 100, 500);
        gr.setColor(Color.ORANGE);
        gr.setFont(new Font ("Courier New", 3, 24));
        gr.drawString("Ez egy szöveg", 300, 300);
    }
}