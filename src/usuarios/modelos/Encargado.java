/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author leona
 */
public class Encargado {
    
    String apellido;
    String nombre; 
    
    public void mostrar() {
        System.out.println("Nombre y apellido: " + nombre + " " + apellido );
    }
    
    public void menu(){
        System.out.println("Los productos son:");
        System.out.println("Entrada");
        System.out.println("Plato principal");
        System.out.println("Postre");           

    }
}

