
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Disco {
    //Atributos
    public String nombre,artista;
    public int anio,numeroCancion;
    public ArrayList <Cancion> canciones;
    
    //Metodo
    //Declarar Constructores
    //Constructor vacio
    public Disco(){
    }
    //Constructor completo
    public Disco (String nombre,String artista,int anio,ArrayList<Cancion> canciones){
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.canciones = canciones;
    }

    //Constructor toString
    @Override
    public String toString(){
        return "\n\n\tDisco\nNombre: "+nombre+"\nArtista: "+artista+"\nAño: "+anio+"\nCanciones: "+canciones;
    }
}
