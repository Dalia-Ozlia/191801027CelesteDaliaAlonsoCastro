/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Informacion {
    //Atributos
    private String marca,mac;
    public String nombre;
    private int ram;
    
    //Metodos 
    //Constructores
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
     public String getMac(){
        return this.mac;
    }
    
    public void setMac(String mac){
        this.mac = mac;
    }
    
     public int getRam(){
        return this.ram;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    public Informacion (){
        this.marca = "";
        this.mac = "";
        this.nombre = "";
        this.ram = 0;
    } 
    
    public Informacion (String marca,String mac,String nombre,int ram){
        this.marca = marca;
        this.mac = mac;
        this.nombre = nombre;
        this.ram = ram;
    }
    
    @Override
    public String toString(){
        return "\nINFORMACION: \nMarca: "+getMarca()+"\nDirección MAC: "+getMac()+"\nNombre de dispositivos: "+nombre+"\nRAM instalada: "+getRam()+" GB";
    }
}
