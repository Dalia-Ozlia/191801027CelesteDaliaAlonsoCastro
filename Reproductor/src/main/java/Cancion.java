/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Cancion {
    //Atributos
    public int orden;
    public String titulo;
    public double duracion;
    
    //Metodo
    //Declarar Constructores
    //Constructor completo
    public Cancion (int orden,String titulo,double duracion){
        this.orden = orden;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    //Constructor vacio
    public Cancion(){
        orden = 0;
        titulo = "";
        duracion = 0;
    }
    //Constructor toString
    @Override
    public String toString(){
        return "\n\n\t\tCANCION\n\tOrden: "+orden+"\n\tTitulo: "+titulo+"\n\tDuración: "+duracion;
    }
}
