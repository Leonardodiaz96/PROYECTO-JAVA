/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author leona
 */
public class Producto {
    public int codigo;    
    public String descripcion;
    public String categoria;
    public String estado;
    public float precio;

    public void mostrar() {
        System.out.println("Producto: " + descripcion);
        System.out.println("Precio: " + precio);
    }

    public void noDisponible(){
        System.out.println("No esta disponible");
    }
    
    public void menu(){
        System.out.println("No esta disponible");
    }
}
