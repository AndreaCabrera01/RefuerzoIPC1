package com.company;

import javax.swing.*;
import java.awt.*;

public class Perro extends JLabel implements Runnable {


    private int xp, yp;
    private Point location = new Point(0,0);


    public Perro (Point location){
        this.setIcon(new ImageIcon("perro.png"));
        this.setSize(128,128);
        this.location = location;

    }

    @Override
    public void run() {
        //si x del hueso es mayor que x del Perro entonces xP aumenta
        //si x del hueso es menor que x del Perro entonces xP disminuir
        //si y del hueso es mayor que la y del Perro entonces yP AUMENTA
        //si y del hueso es MENOR que la y del Perro entonces yP DISMINUYE

        boolean chocan = true;

        while (chocan){
            if(this.xp < Interfaz.hueso.getX()){
                this.xp +=1;
                Interfaz.perro.setLocation(this.xp+1, this.yp);
            }
            if(this.xp > Interfaz.hueso.getX()){
                this.xp -=1;
                Interfaz.perro.setLocation(this.xp-1, this.yp);
            }
            if(this.yp < Interfaz.hueso.getY()){
                this.yp +=1;
                Interfaz.perro.setLocation(this.xp, this.yp+1);
            }
            if(this.yp > Interfaz.hueso.getY()){
                this.yp -=1;
                Interfaz.perro.setLocation(this.xp, this.yp-1);
            }


            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (this.xp == Interfaz.hueso.getX() && this.yp==Interfaz.hueso.getY()){

                Interfaz.perro.setLocation(xp,yp);
                chocan=false;
                break;
            }


        }






    }
}
