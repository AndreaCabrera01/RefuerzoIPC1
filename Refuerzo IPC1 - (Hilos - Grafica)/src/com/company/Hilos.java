package com.company;

public class Hilos implements Runnable{
    @Override
    public void run() {
        int generoF = 0, generoM = 0;

        for (int i = 0; i <15; i++){
            try {
            generoF++;
                generoM++;
            Ejemplo.GraficaDeGenero(generoM, generoF);

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            generoM++;
            generoM++;

        }
    }
}
