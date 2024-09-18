import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class Janelas {
    
    public static void main(String[] args) {
        
        //Texto para o java
        JLabel label = new JLabel("Olá, eu sou uma janela java.", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD, 40));
        label.setForeground(Color.white);


        //janela
        JFrame janela = new JFrame();
        janela.setSize(670,670);
        janela.getContentPane().setBackground(new Color(200,30,50));
        janela.add(label);
        janela.setVisible(true);


    }
}
