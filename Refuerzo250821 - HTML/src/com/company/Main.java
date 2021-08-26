package com.company;

import java.io.*;
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

        public static String[] nombres;
        public static int[] notas;
        public static int cr, ca;


    public static void main(String[] args) {
        nombres = new String[10];
        notas = new int[10];

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
        cr=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<61){
                cr++;
            }
        }
        ca=0;
        for (int i = 0; i <notas.length ; i++) {
            if (notas[i]>60){
                ca++;
            }

        }

        System.out.println("");
        System.out.println("cantidad de alumnos reprobados: "+cr);
        System.out.println("cantidad de alumnos aprobados: "+ca);

        GenerarReporte();

    }

    public static int[] vector1 = {4,5,2,7,8};
    public static int[] vector2 = {7,9,1,0,9};

    //Método para crear archivos
    public static void GenerarReporte(){
        System.out.println("Ingrese la ruta donde desea guardar su reporte: ");
        String rutaReporte = new Scanner(System.in).nextLine();

        //Generación del reporte en java:
        FileWriter fichero = null;
        PrintWriter pw = null;

        String texto = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<title>Ejemplo reporte</title>\n" +
                "\n" +
                "<style type=\"text/css\">\n" +
                "body{\n" +
                "\tmargin: 0;\n" +
                "\tfont-family: Trebuchet MS, sans-serif;\n" +
                "\tbackground-color: #fefbe9;\n" +
                "}\n" +
                ".topnav {\n" +
                "\toverflow: hidden;\n" +
                "\tbackground-color: #DC143C;\n" +
                "\ttext-align: center;\n" +
                "}\n" +
                "table {\n" +
                "\tborder-collapse: collapse;\n" +
                "\twidth: 50%;\n" +
                "}\n" +
                "td, th {\n" +
                "\tfont-family: bahnschrift;\n" +
                "\tborder: 1px solid #000;\n" +
                "\ttext-align: center;\n" +
                "\tpadding: 8px;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<div align=\"center\" class=\"topnav\"> \n" +
                "\t<h1>REPORTE</h1><p>REFUERZO IPC 1</p>\n" +
                "\t</div><br><br>\n" +
                "\n" +
                "<div class=\"tabla_Clase\" align=\"center\" style=\"text-align: center;\">\t\n" +
                "\t<table align=\"center\">\n" +
                "\t\t<tr>\n" +
                "\t\t\t<th colspan=\"2\" style=\"background-color: #000000; color: white;\">Listado de alumnos</th>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr style=\"font-weight: bold; background-color: #57D4CB;\">\n" +
                "\t\t\t<th>Nombre</th><th>Nota</th>\n"+
                "\t\t</tr>\n";

            for (int i = 0; i < nombres.length; i++) {
                texto += "\t\t<tr><td style=\"background-color: white\">"+ nombres[i] +"</td>\n" +
                        "\t\t<td style=\"background-color: white\">"+ notas[i] +"</td></tr>\t\n" ;
            }

                texto += "\t</table>\n" +
                "</div>\n" +
                "<div class=\"texto\" align=\"center\" style=\"text-align: center;\">\n" +
                "\t<p>La cantidad de alumnos reprobados para este curso son:</p>\n" +
                "\t<p style=\"color: green; font-weight: bold\">"+ cr +"</p>\n" +
                "\t<p>La cantidad de alumnos aprobados para este curso son:</p>\n" +
                "\t<p style=\"color: red; font-weight: bold\">"+ ca +"</p>\n"+
                "<br><h2>VER VECTORES</h2>";


                for (int i = 0; i < vector2.length; i++) {
                    texto += "<p>["+vector1[i]+"] &nbsp&nbsp&nbsp&nbsp ["+vector2[i]+"]</p>";
                }

                texto += "\t</div>\n" +
                "</body>\n" +
                "</html>";


        try
        {
            fichero = new FileWriter(rutaReporte+"\\reporte.html");
            pw = new PrintWriter(fichero);

            for (int i = 0; i <= 0; i++)
                pw.println(texto);


            System.out.println("Reporte generado.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
