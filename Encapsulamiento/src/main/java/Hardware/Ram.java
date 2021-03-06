/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hardware;

/**
 *
 * @author celes
 */
public class Ram {
       //Atributos
    private int tamanio,modulos;
    private String tipo;
    
    //Constructores
    public int getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(int tamanio){
        this.tamanio = tamanio;
    }
    
    public int getModulos(){
        return this.modulos;
    }
    public void setModulos(int modulos){
        this.modulos = modulos;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
   
    public Ram (){
        this.tamanio = 8;
        this.modulos = 1;
        this.tipo = "DRAM";
    }
    
    public Ram (int tamanio,int modulos,String tipo){
        this.tamanio = tamanio;
        this.modulos = modulos;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "\nRAM información\nTamaño:"+getTamanio()+" GB\nNúmero de modulos: "+getModulos()+"\nTipo: "+getTipo();
    }
}
