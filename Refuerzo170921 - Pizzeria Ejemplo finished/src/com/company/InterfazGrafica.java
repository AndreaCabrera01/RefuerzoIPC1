package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class InterfazGrafica extends JFrame implements ActionListener {

    static JButton crearClientes,crearPizza,crearBebidas;
    static JPanel listadoBebidas, listadoPizzas, listadoClientes;


    public InterfazGrafica(){




        this.setBounds(250, 250, 1400, 900);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JLabel titulo = new JLabel();
        titulo.setText("        Pizzería - Las mejores pizzas");
        titulo.setBounds(10,20,1000,50);
        titulo.setFont(new Font("Century Gothic", 1, 50));
        titulo.setForeground(Color.black);


//-------------------------PESTAÑAS------------------------------------------

        JTabbedPane pestañas=new JTabbedPane();
        pestañas.setBounds(0,80,1400,850);

        //--------------------CLIENTES--------------------
        JPanel clientes =new JPanel();
        clientes.setLayout(null);
        clientes.setBackground(new Color(255, 173, 18));

        JLabel tclientes = new JLabel("Clientes:");
        tclientes.setBounds(40, 20, 500, 50);
        tclientes.setFont(new Font("Century Gothic", 1+2, 45));

        JLabel cClientes = new JLabel("Agregar:");
        cClientes.setBounds(940, 180, 500, 50);
        cClientes.setFont(new Font("Century Gothic", 1+2, 38));

        //Botón
        crearClientes = new JButton("Cargar JSON");
        crearClientes.setBounds(980, 330, 240, 45);
        crearClientes.setBackground(new Color(45, 152, 218));
        crearClientes.setFont(new Font("Bahnschrift", 0, 30));
        crearClientes.addActionListener(this);

        JPanel cuadroBlanco = new JPanel();
        cuadroBlanco.setBounds(950, 250, 300,200);
        cuadroBlanco.setBackground(new Color(255,255,255, 169));

        listadoClientes = new JPanel();
        listadoClientes.setBounds(100, 200, 550, 400);
        listadoClientes.setBackground(new Color(255,255,255, 169));



        clientes.add(tclientes);
        clientes.add(cClientes);
        clientes.add(crearClientes);
        clientes.add(cuadroBlanco);
        clientes.add(listadoClientes);


        //--------------------PIZZA--------------------
        JPanel Pizza =new JPanel();
        Pizza.setLayout(null);
        Pizza.setBackground(new Color(255, 173, 18));

        JLabel tPizza = new JLabel("Pizzas:");
        tPizza.setBounds(40, 20, 500, 50);
        tPizza.setFont(new Font("Century Gothic", 1+2, 45));

        JLabel cPizza = new JLabel("Agregar:");
        cPizza.setBounds(940, 180, 500, 50);
        cPizza.setFont(new Font("Century Gothic", 1+2, 38));

        //Botón
        crearPizza = new JButton("Cargar JSON");
        crearPizza.setBounds(980, 330, 240, 45);
        crearPizza.setBackground(new Color(45, 152, 218));
        crearPizza.setFont(new Font("Bahnschrift", 0, 30));
        crearPizza.addActionListener(this);

        JPanel cuadroBlancoP = new JPanel();
        cuadroBlancoP.setBounds(950, 250, 300,200);
        cuadroBlancoP.setBackground(new Color(255,255,255, 169));

        listadoPizzas = new JPanel();
        listadoPizzas.setBounds(100, 200, 550, 400);
        listadoPizzas.setBackground(new Color(255,255,255, 169));

        //Cada una de las pestañas para seleccionar opción/submenú
        pestañas.add("Clientes", clientes);
        pestañas.add("Pizza", Pizza);
        pestañas.setFont(new Font("Century Gothic", 0, 20));

        Pizza.add(tPizza);
        Pizza.add(cPizza);
        Pizza.add(crearPizza);
        Pizza.add(cuadroBlancoP);
        Pizza.add(listadoPizzas);

        //--------------------Bebidas--------------------
        JPanel Bebidas =new JPanel();
        Bebidas.setLayout(null);
        Bebidas.setBackground(new Color(255, 173, 18));

        JLabel tBebidas = new JLabel("Bebidas:");
        tBebidas.setBounds(40, 20, 500, 50);
        tBebidas.setFont(new Font("Century Gothic", 1+2, 45));

        JLabel cBebidas = new JLabel("Agregar:");
        cBebidas.setBounds(940, 180, 500, 50);
        cBebidas.setFont(new Font("Century Gothic", 1+2, 38));

        //Botón
        crearBebidas = new JButton("Cargar JSON");
        crearBebidas.setBounds(980, 330, 240, 45);
        crearBebidas.setBackground(new Color(45, 152, 218));
        crearBebidas.setFont(new Font("Bahnschrift", 0, 30));
        crearBebidas.addActionListener(this);

        JPanel cuadroBlancoB = new JPanel();
        cuadroBlancoB.setBounds(950, 250, 300,200);
        cuadroBlancoB.setBackground(new Color(255,255,255, 169));

        listadoBebidas = new JPanel();
        listadoBebidas.setBounds(100, 200, 550, 400);
        listadoBebidas.setBackground(new Color(255,255,255, 169));

        Bebidas.add(tBebidas);
        Bebidas.add(cBebidas);
        Bebidas.add(crearBebidas);
        Bebidas.add(cuadroBlancoB);
        Bebidas.add(listadoBebidas);

        //Cada una de las pestañas para seleccionar opción/submenú
        pestañas.add("Clientes", clientes);
        pestañas.add("Pizza", Pizza);
        pestañas.add("Bebidas", Bebidas);
        pestañas.setFont(new Font("Century Gothic", 0, 20));


        //------------------------------
        this.add(pestañas);
        this.add(titulo);
        this.setBackground(new Color(255, 71, 71));
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tablaClientes();
        tablaBebidas();
        tablaPizzas();


    }

    public void tablaClientes(){
        listadoClientes.removeAll();

        String[] columnas = {"id","idPizza","idBebida","nombre","direccion","edad","genero"};
        Object[][] datos = new Object[5][7];

        for (int i=0; i<Main.clientes.length; i++){
            if (Main.clientes[i]!=null){

                datos[i][0]=Main.clientes[i].getId();
                datos[i][1]=Main.clientes[i].getIdPizza();
                datos[i][2]=Main.clientes[i].getIdBebida();
                datos[i][3]=Main.clientes[i].getNombre();
                datos[i][4]=Main.clientes[i].getDireccion();
                datos[i][5]=Main.clientes[i].getEdad();
                datos[i][6]=Main.clientes[i].getGenero();


            }

        }

        JTable ta2 = new JTable (datos, columnas);
        JScrollPane sp2 = new JScrollPane(ta2);
        sp2.setBounds(0, 0, 550, 675);
        sp2.setVisible(true);
        listadoClientes.add(sp2);

    }

    public void tablaPizzas(){
        listadoPizzas.removeAll();

        String[] columnas = {"id","tamaño","precio","especialidad"};
        Object[][] datos = new Object[5][4];

        for (int i=0; i<Main.pizzas.length; i++){
            if (Main.pizzas[i]!=null){

                datos[i][0]=Main.pizzas[i].getId();
                datos[i][1]=Main.pizzas[i].getTamaño();
                datos[i][2]=Main.pizzas[i].getPrecio();
                datos[i][3]=Main.pizzas[i].getEspecialidad();

            }

        }

        JTable ta2 = new JTable (datos, columnas);
        JScrollPane sp2 = new JScrollPane(ta2);
        sp2.setBounds(0, 0, 550, 675);
        sp2.setVisible(true);
        listadoPizzas.add(sp2);

    }

    public void tablaBebidas(){
        listadoBebidas.removeAll();

        String[] columnas = {"id","tamaño","precio","sabor"};
        Object[][] datos = new Object[5][4];

        for (int i=0; i<Main.bebidas.length; i++){
            if (Main.bebidas[i]!=null){

                datos[i][0]=Main.bebidas[i].getId();
                datos[i][1]=Main.bebidas[i].getTamaño();
                datos[i][2]=Main.bebidas[i].getPrecio();
                datos[i][3]=Main.bebidas[i].getSabor();

            }

        }

        JTable ta2 = new JTable (datos, columnas);
        JScrollPane sp2 = new JScrollPane(ta2);
        sp2.setBounds(0, 0, 550, 675);
        sp2.setVisible(true);
        listadoBebidas.add(sp2);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String contenido1 = "";
        if (e.getSource()==crearClientes){
            System.out.println("presionaste el boton para cargar clientes");
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File archivo = fc.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            System.out.println("la ruta es: "+ruta);

            Archivos.CargarCliente(ruta);


            tablaClientes();
            Archivos.serialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\Clientes.bin",Main.clientes);

        }




        String contenido2 = "";
        if (e.getSource()==crearBebidas){
            System.out.println("presionaste el boton para cargar clientes");
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File archivo = fc.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            System.out.println("la ruta es: "+ruta);

            Archivos.CargarBebida(ruta);

            tablaBebidas();
            Archivos.serialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\Bebidas.bin",Main.bebidas);

        }


        String contenido3 = "";
        if (e.getSource()==crearPizza){
            System.out.println("presionaste el boton para cargar clientes");
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File archivo = fc.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            System.out.println("la ruta es: "+ruta);

            Archivos.CargarPizza(ruta);

            tablaPizzas();
            Archivos.serialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\PIZZAS.bin",Main.pizzas);

        }





    }
}
