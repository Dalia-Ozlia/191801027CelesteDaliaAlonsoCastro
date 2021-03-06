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
public class Empleado {
    private String nombre,appPaterno,appMaterno;
    private int dni;
    
    
    
    public Empleado (){
        this.nombre = "";
        this.appPaterno = "";
        this.appMaterno = "";
        this.dni = 0;
    }
    
    public Empleado (String nombre,String appPaterno,String appMaterno,int dni){
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.dni = dni;       
    }
    
    @Override
    public String toString(){
        return "\n\tEMPLEADO.\nNombre: "+getNombre()+"\nApellido Paterno: "+getAppPaterno()+"\nApellido Materno: "+getAppMaterno()+"\nDNI: "+getDni();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
