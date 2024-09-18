import java.awt.Color;

import javax.swing.JFrame;

public class DesenhoNaJanela {
    
    public static void main(String[] args) {
        

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600,600);
        janela.getContentPane().setBackground(new Color(60,30,20));
        janela.setVisible(true);
    }
}
