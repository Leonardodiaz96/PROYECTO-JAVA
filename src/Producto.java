/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leona
 */
public class Producto {
    String nombre;
    String descripcion;
    int precio;

    public void disponible(){
        System.out.println("Esta disponible");
    }

    public void noDisponible(){
        System.out.println("Np esta disponible");
    }
    
    public static void main(String[] args) {
        Producto nombre = new Producto();
    }
}