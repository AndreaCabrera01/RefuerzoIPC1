package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo extends JFrame implements ActionListener {
    public static JButton buscar;
    public static ChartPanel frame;
    public static  JTextArea textA;

    public Ejemplo(){
        this.setTitle("Ejemplo");
        this.setBounds(500, 570, 1280, 720);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(255, 71, 71));
        this.setLocationRelativeTo(null);

        buscar = new JButton("Inicio");
        buscar.setBounds(700, 300, 370, 100);
        buscar.addActionListener(this);
        buscar.setFont(new Font("Century Gothic", Font.BOLD, 60));
        buscar.setForeground(Color.WHITE);
        buscar.setBackground(new Color(255, 173, 18));
        textA = new JTextArea();
        textA.setBounds(75, 110, 500, 500);
        this.add(textA);
        this.add(buscar);
    }

    public static void GraficaDeGenero(int generoM, int generoF){
        textA.removeAll();
        //Grafica De Pie

        DefaultPieDataset datasetPIE = new DefaultPieDataset();
        datasetPIE.setValue("Hombre", new Integer(generoM));
        datasetPIE.setValue("Mujer", new Integer(generoF));

        JFreeChart chart = ChartFactory.createPieChart3D("Gráfica de Pie", datasetPIE, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();

        plot.setSectionPaint("Hombre", new Color(104, 139, 255));
        plot.setSectionPaint("Mujer", new Color(255, 71, 71));

        //PIE
        frame = new ChartPanel(chart);
        frame.setBounds(0,0,500, 500);
        textA.add(frame);
        textA.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buscar){
            Hilos pie = new Hilos();
            Thread thread = new Thread(pie);
            thread.start();
        }
    }
}
