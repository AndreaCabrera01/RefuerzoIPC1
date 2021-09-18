package com.company;

//Descarguemos y agreguemos la líbreria gson 2.8.7

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;

public class Archivos {

    public static void CargarCliente(String ruta){
        String content = getContentOfFile(ruta);

        JsonParser parser = new JsonParser();
        JsonArray arreglo = parser.parse(content).getAsJsonArray();
        int contador = 0;
        do{
            for (int i = 0; i < arreglo.size(); i++) {
                contador+=1;
                JsonObject objeto = arreglo.get(i).getAsJsonObject();

                int id = objeto.get("id").getAsInt();
                int idPizza = objeto.get("idPizza").getAsInt();
                int idBebida = objeto.get("idBebida").getAsInt();
                String nombre = objeto.get("nombre").getAsString();
                String direccion = objeto.get("direccion").getAsString();
                int edad = objeto.get("edad").getAsInt();
                String genero = objeto.get("genero").getAsString();

                Cliente nuevo = new Cliente(id, idPizza, idBebida, nombre, direccion, edad, genero);

                Main.clientes[i] = nuevo;

            }
        }while(contador<=5);
    }

    public static void CargarBebida(String ruta){
        String content = getContentOfFile(ruta);

        JsonParser parser = new JsonParser();
        JsonArray arreglo = parser.parse(content).getAsJsonArray();

        int contador = 0;
        do{
            for (int i = 0; i < arreglo.size(); i++) {
                contador+=1;
                JsonObject objeto = arreglo.get(i).getAsJsonObject();

                int id = objeto.get("id").getAsInt();
                String tamaño = objeto.get("tamaño").getAsString();
                int precio = objeto.get("precio").getAsInt();
                String sabor = objeto.get("sabor").getAsString();

                Bebida nuevo = new Bebida(id, tamaño, precio, sabor);
                Main.bebidas[i] = nuevo;

            }
        }while(contador<=5);
    }

    public static void CargarPizza(String ruta){
        String content = getContentOfFile(ruta);

        JsonParser parser = new JsonParser();
        JsonArray arreglo = parser.parse(content).getAsJsonArray();

        int contador = 0;
        do{
            for (int i = 0; i < arreglo.size(); i++) {
                contador+=1;
                JsonObject objeto = arreglo.get(i).getAsJsonObject();

                int id = objeto.get("id").getAsInt();
                String tamaño = objeto.get("tamaño").getAsString();
                int precio = objeto.get("precio").getAsInt();
                String especialidad = objeto.get("especialidad").getAsString();

                Pizza nuevo = new Pizza(id, tamaño, precio, especialidad);
                Main.pizzas[i] = nuevo;

            }
        }while(contador<=5);
    }

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


    public static void serialize(String pathname, Object object) {
        // Serializar un objeto
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathname));
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static Object deserialize(String pathname) {
        // Leer un objeto serializado
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathname));
            Object data = objectInputStream.readObject();
            objectInputStream.close();
            return data;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}