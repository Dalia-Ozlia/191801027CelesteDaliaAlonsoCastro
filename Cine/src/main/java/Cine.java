
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
public class Cine {
    //Atributos
    public String nombre;
    public int horaInicio,horaFin;
    public ArrayList <Pelicula> peliculas = new ArrayList();
    
    public Cine (){
        
    }
    public Cine (String nombre,int horaInicio,int horaFin,ArrayList<Pelicula>peliculas){
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.peliculas = peliculas;
    }
    public Cine (String nombre,int horaInicio,int horaFin){
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public String imprimirPeliculas (){
        String cartelera = "";
        for (Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    }
    
    public void agregarPelicula(Pelicula newPelicula){
        peliculas.add(newPelicula);
    }
    
    public int numPeliculas(){
        return peliculas.size();
    }
    
    public String menuPeliculas(){
        String menu = "";
        int i=1;
        menu += "\n\tMENU PELICULAS\n";
        for (Pelicula pelicula:peliculas){
            menu += "\t"+i+". "+pelicula.titulo+"\n";
            i++;
        }
        return menu;
    }
    
    public String horarioCine(double tiempo){
        String horario;
        int hora = (int)Math.round(tiempo);
        if (hora >= 11 && hora<=23)
            horario = "El cine esta ABIERTO.\nHORARIO 11:00 hrs - 23:00 hrs";
        else
            horario = "El cine esta CERRADO.\nHORARIO 11:00 hrs - 23:00 hrs";
        return horario;
    }
    
    @Override
    public String toString (){
        return "\nNombre: "+nombre;
    }

    private ArrayList<Pelicula> add(Pelicula newPelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
