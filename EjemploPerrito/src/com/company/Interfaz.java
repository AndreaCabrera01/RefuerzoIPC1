package com.company;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    JButton tirar;
    JLabel perrito;
    public Interfaz(){
        this.setTitle("Juego del Perrito");
        this.setBounds(400, 250, 1200, 900);
        this.getContentPane().setBackground(new Color(82, 173, 200));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        tirar = new JButton("Tirar Hueso");
        tirar.setBounds(520, 725, 200, 50);
        tirar.setFont(new Font("Century Gothic", Font.BOLD, 20));
        tirar.setForeground(Color.white);
        tirar.setBackground(new Color(85, 195, 158));

        //------------LABELS DEL PERRITO---------------
        perrito = new JLabel(new ImageIcon("perro.png"));
        perrito.setSize(128, 128);
        perrito.setLocation(20,500);

        this.add(tirar);
        this.add(perrito);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
