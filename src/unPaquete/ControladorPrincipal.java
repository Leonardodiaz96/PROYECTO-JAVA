/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
    
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        Empleado emp3 = new Empleado();
        
        Encargado enc1 = new Encargado();
        Encargado enc2 = new Encargado();
        Encargado enc3 = new Encargado();

        Producto prod1 = new Producto();
        Producto prod2 = new Producto();        
        Producto prod3 = new Producto();   
        
        //Clientes
        cliente1.correo = "pedrogomez@hotmail.com";
        cliente1.contrasena = "hola123";
        cliente1.nombre = "Pedro";
        cliente1.apellido = "Gomez";
        cliente2.correo = "martinacosta@hotmail.com";
        cliente2.contrasena = "hola";
        cliente2.nombre = "Martina";
        cliente2.apellido = "Acosta";
        cliente3.correo = "juangonzalez@hotmail.com";
        cliente3.contrasena = "holis12345";
        cliente3.nombre = "Juan";
        cliente3.apellido = "Gonzalez"; 
        
        //Empleado
        emp1.nombre = "Augusto";
        emp1.apellido = "Romero";
        emp2.nombre = "Agustin";
        emp2.apellido = "Ramirez";
        emp3.nombre = "Andres";
        emp3.apellido = "Saife";
        
        //Encargado
        enc1.nombre = "Roberto";
        enc1.apellido = "Andes";
        enc2.nombre = "Joaquin";
        enc2.apellido = "Medina";
        enc3.nombre = "Hugo";
        enc3.apellido = "Ortega";
        
        //Productos
        prod1.nombre = "brusqueta de jamon y queso";
        prod1.descripcion = "Rebanadas de pan tostado, rebozadas con algun ajo y puestas a la parrilla para que se doren";
        prod1.precio = 900;
        prod2.nombre = "Salmon a la plancha con arroz y esparragos";
        prod2.descripcion = "Arroz blanco con los esparragos trigueros y, encima, los lomos de salmon.";
        prod2.precio = 6500;
        prod3.nombre = " Mousse de frutas del bosque";
        prod3.descripcion = "Ofrece este cremoso postre en una version con frutos del bosque, combinando el dulce y el acido de forma deliciosa";
        prod3.precio = 2000;
        
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Empleado> listaEmp = new ArrayList<>();
        ArrayList<Encargado> listaEnc = new ArrayList<>(); 
        ArrayList<Producto> listaProd = new ArrayList<>();
    

        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        listaEmp.add(emp1);
        listaEmp.add(emp2);
        listaEmp.add(emp3);
        listaEnc.add(enc1);
        listaEnc.add(enc2);
        listaEnc.add(enc3);
        listaProd.add(prod1);
        listaProd.add(prod2);
        listaProd.add(prod3);
        
        //preparamos el muestreo
        System.out.println("Lista de clientes:");
        for(int i=0; i < listaCliente.size(); i++){
            listaCliente.get(i).mostrar();
        }
        System.out.println("Lista de empleados:");
        for(int i=0; i < listaEmp.size(); i++){
            listaEmp.get(i).mostrar();
        }
        System.out.println("Lista de encargados:");
        for(int i=0; i < listaEnc.size(); i++){
            listaEnc.get(i).mostrar();
        }
        System.out.println("Lista de productos:");
        for(int i=0; i < listaProd.size(); i++){
            listaProd.get(i).mostrar();
        }
    }   
}

