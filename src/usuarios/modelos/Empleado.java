/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author leona
 */
public class Empleado {
    public String apellido;
    public String nombre;
    public String correo;
    public String clave; 
    
    public void mostrar() {
        System.out.println("Nombre y apellido: " + nombre + " " + apellido );
    }
    
    public void pedidosSolicitados(){
        
    }
     
}