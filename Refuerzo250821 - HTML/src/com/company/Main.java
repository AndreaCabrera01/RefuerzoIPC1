package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static String getContentOfFile(String pathname) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathname);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String content = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                content += linea + "\n";
            }
            return content;
        }catch (FileNotFoundException fnfe) {
            System.err.println("No se encontró el archivo. Inténtelo de nuevo");
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            }catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String[]nombres = new String[10];
        int[]notas = new int[10];

        System.out.println("ingrese una ruta");
        String ruta = new Scanner(System.in).nextLine();

        String contenido = getContentOfFile(ruta);
        String[] lineas = contenido.split("\n");

        for (int i = 0; i < lineas.length ; i++) {
            String[]datos = lineas[i].split(",");

            nombres[i]=datos[0];
            notas[i] = Integer.parseInt(datos[1]);

        }

        for (int i = 0; i <10 ; i++) {
            System.out.println("nombre: "+nombres[i]+" nota: "+notas[i]);

        }
        int cr=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<61){
                cr++;
            }
        }
        int ca=0;
        for (int i = 0; i <notas.length ; i++) {
            if (notas[i]>60){
                ca++;
            }

        }

        System.out.println("");
        System.out.println("cantidad de alumnos reprobados: "+cr);
        System.out.println("cantidad de alumnos aprobados: "+ca);

    }
}
