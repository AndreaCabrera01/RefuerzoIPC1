package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class Interfaz extends JFrame implements ActionListener{
    JButton tirar;
    JLabel perrito;

    public static Point location = new Point(0,0);

    public static Hueso hueso;
    public static Perro perro;
    public static int x, y;

    public Interfaz(){
        hueso = new Hueso();


        this.setTitle("Juego del Perrito");
        this.setBounds(400, 250, 1200, 600);
        this.getContentPane().setBackground(new Color(82, 173, 200));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        tirar = new JButton("Tirar Hueso");
        tirar.setBounds(520, 505, 200, 50);
        tirar.setFont(new Font("Century Gothic", Font.BOLD, 20));
        tirar.setForeground(Color.white);
        tirar.setBackground(new Color(85, 195, 158));
        tirar.addActionListener(this);

        //------------LABELS DEL PERRITO---------------
        perro = new Perro(location);
        perro.setLocation(0,0);

        this.add(tirar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tirar){
            Random random = new Random();
            x = (int) (random.nextDouble() * 1072);
            y = (int) (random.nextDouble() * 472);
            hueso.setLocation(x,y);
            this.add(hueso);


            this.add(perro);

            Thread hilo = new Thread(perro);
            hilo.start();

            hilo.isAlive()






        }
    }
}
