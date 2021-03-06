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
public class Bateria {
    //Atributos
    private int porcentaje;
    
    //Constructores
    public int getPorcentaje(){
        return this.porcentaje;
    }
    
    public void setProcentaje(int porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public Bateria (){
        this.porcentaje = 100;
    }
    
    public Bateria (int porcentaje){
        this.porcentaje = porcentaje;
    }
    
    @Override
    public String toString(){
        return "\nBateria: "+porcentaje+"%\n";
    }
}
