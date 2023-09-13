/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

/**
 *
 * @author leona
 */
public class Producto {
    String nombre;    
    String descripcion;
    int precio;

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
    }

    public void noDisponible(){
        System.out.println("No esta disponible");
    }
    
    public void menu(){
        System.out.println("No esta disponible");
    }
}