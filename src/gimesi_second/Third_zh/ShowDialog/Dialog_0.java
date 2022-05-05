package gimesi_second.Third_zh.ShowDialog;

import javax.swing.*;
public class Dialog_0
{
    public static void main(String[] args)
    {
        String név = JOptionPane.showInputDialog("Felahsználó neve");
        String jelszó = JOptionPane.showInputDialog("Jelszó");
        if(név != null && jelszó != null && név.equals("laci") && jelszó.equals("1234")) JOptionPane.showMessageDialog(null, "Accepted");
        else JOptionPane.showMessageDialog(null, "Rejected");
    }
}