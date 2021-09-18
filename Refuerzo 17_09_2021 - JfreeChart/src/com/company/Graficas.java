package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graficas {
    JFrame graficas;

    public Graficas(){
        //-------------------------------INTERFAZ----------------------------------------
        graficas = new JFrame("Ejemplo de Gráficas");
        graficas.setVisible(true);
        graficas.setSize(1280,720);
        graficas.setLayout(null);
        graficas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane pestañas=new JTabbedPane();
        pestañas.setBounds(0,10,1280,850);

        JPanel barras =new JPanel();
        barras.setLayout(null);

        JPanel pie =new JPanel();
        pie.setLayout(null);
        pestañas.add("BARRAS", barras);
        pestañas.add("PIE", pie);
        pestañas.setFont(new Font("Century Gothic", 0, 20));

        JButton mostrarPie = new JButton("Mostrar");
        mostrarPie.setSize(200,40);
        mostrarPie.setFont(new Font("Bahnschrift", Font.PLAIN, 24));
        mostrarPie.setLocation(550, 10);

        JButton mostrarBarras = new JButton("Mostrar");
        mostrarBarras.setSize(200,40);
        mostrarBarras.setFont(new Font("Bahnschrift", Font.PLAIN, 24));
        mostrarBarras.setLocation(550, 10);

        barras.add(mostrarBarras);
        pie.add(mostrarPie);

        graficas.add(pestañas);

        mostrarBarras.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Grafica de Barras:
            DefaultCategoryDataset datasetBarras = new DefaultCategoryDataset();
            datasetBarras.setValue(5, "Chocolate", "Chocolate");
            datasetBarras.setValue(7, "Pizza", "Pizza");
            datasetBarras.setValue(3, "Churros", "Churros");
            datasetBarras.setValue(4, "Mentas", "Mentas");

            JFreeChart chartBar = ChartFactory.createBarChart3D("Barras", "Dulce Favorito", "Cantidad", datasetBarras, PlotOrientation.HORIZONTAL, true, true, false);

            ChartPanel frame2 = new ChartPanel(chartBar);
            barras.add(frame2, BorderLayout.CENTER);
            frame2.setBounds(350, 60, 600, 500);
        }
    });

        mostrarPie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultPieDataset datasetPie = new DefaultPieDataset();
                datasetPie.setValue("Chocolate", new Integer(5));
                datasetPie.setValue("Pizza", new Integer(7));
                datasetPie.setValue("Churros", new Integer(3));
                datasetPie.setValue("Mentas", new Integer(4));

                JFreeChart chartPie = ChartFactory.createPieChart3D("Gráfica de Pie", datasetPie, true, true, false);

                ChartPanel frame = new ChartPanel(chartPie);
                pie.add(frame, BorderLayout.CENTER);
                frame.setBounds(370, 60, 700, 500);
            }
        });
    }



}
