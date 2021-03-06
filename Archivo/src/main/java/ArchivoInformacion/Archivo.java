/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoInformacion;

/**
 *
 * @author celes
 */
public class Archivo {
    //Atributos
    private int id;
    private String nombre,tipo;
    private double version;
    
    //Metedos y constructores
    public Archivo (){
        this.id = 0;
        this.nombre = "";
        this.tipo = "";
        this.version = 0;
    }
    
    public Archivo (int id,String nombre,String tipo,double version){
        this.id =id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.version = version;
    }
    
    @Override
    public String toString(){
        return "ARCHIVO INFORMACION\nNombre: "+getNombre()+"\nTipo: "+getTipo()+"\nID: "+getId()+"\nVersión: "+getVersion();
    }
 public int getId (){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipo (){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double getVersion (){
        return this.version;
    }
    public void setVersion (double version){
        this.version = version;
    }
}
