/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author celes
 */
public class Programador extends Empleado {
    private float sueldo;
    
    public Programador (String nombre,String appPaterno,String appMaterno,int dni,float sueldo){
        super(nombre, appPaterno, appMaterno, dni);
        this.sueldo = sueldo;
    }
    public Programador (){
        super();
        this.sueldo =0;
    }
    
}
