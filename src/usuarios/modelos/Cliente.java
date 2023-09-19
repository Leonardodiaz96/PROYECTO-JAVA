/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author leona
 */
public class Cliente {
    
    String correo;
    String clave; 
    String apellido;
    String nombre;

    public void mostrar() {
        System.out.println("Nombre y apellido: " + nombre + " " + apellido );
        System.out.println("Correo: " + correo);
    }


    //agrega pedidos
    public void agregar() {

    }

    //ve los productos q tiene actualmente
    public void actual() {

    }
    
    //elimina productos
    public void quitar() {

    }
   
}
