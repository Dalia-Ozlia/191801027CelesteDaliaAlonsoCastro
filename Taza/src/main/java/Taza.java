/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Taza {
    //Atributos
    String color,modelo,material;
    Double tamanio,precio;
    
    //Metodos
    //Constructores
    public Taza (String color,double precio,String modelo,Double tamanio,String material){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio = precio;
        this.tamanio = tamanio;
    }
    public Taza (){
        color = "";
        material = "";
        modelo = "";
        precio = 0.0;
        tamanio = 0.0;
    }
    @Override
    public String toString (){
        return "\n\n\t TAZA\nMaterial: "+material+"\nColor: "+color+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\nTamaño: "+tamanio+" cm";
    }
}

