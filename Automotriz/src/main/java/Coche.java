/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Coche {
    //Atributos
    public String marca,color,transmision;
    public double precio;
    public int matricula;
    
    //Declaracion de constructores
    public Coche (){
        
    }
    
    public Coche (String marca,String color,double precio,int matricula,String transmision){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.matricula = matricula;
        this.transmision = transmision;
    }
    
    @Override
    public String toString (){
        return "\n\tCOCHE\n\tMarca: "+marca+"\n\tColor: "+color+"\n\tTransmision: "+transmision+"\n\tPrecio: $"+precio+"\n\tMatricula: "+matricula;
    }
}
