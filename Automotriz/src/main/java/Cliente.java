/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Cliente {
    //Atributos
    public int dni,telefono,edad;
    public String nombre;
    public Coche coche;
    
    //Declaracion de constructores
    public Cliente (){
        
    }
    
    public Cliente (String nombre,int dni,int telefono,int edad,Coche coche){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.coche = coche;
    }
    
    @Override
    public String toString (){
        return "\n\tCLIENTE\nNombre: "+nombre+"\nDNI: "+dni+"\nTelefono: "+telefono+"\nEdad: "+edad+"\nCoche: "+coche;
    }
}
