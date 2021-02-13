/**
 *
 * @author celes
 */
public class Pelicula {
    //Atributos
    public String titulo,director,genero,casaProductora,clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulos;
    //Metodos
    //Declarar constructores
    
    //Constructor vacio
    public Pelicula (){
        
    }
    //Constructor completo
    public Pelicula (String titulo,String director,String genero,String casaProductora,String clasificacion,int anio,double duracion,boolean subtitulos){
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.casaProductora = casaProductora;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.duracion = duracion;
        this.subtitulos = subtitulos;
    }
    //Contrcutor
    public Pelicula (String titulo){
        this.titulo = titulo;
    }
    //Constructor to String
    @Override
    public String toString(){
        return "\n\n\tPELICULA\nTitulo: "+titulo+"\nDirector: "+director+"\nGenero: "+genero+"\nCasa Productora: "+casaProductora+"\nClasificación: "+clasificacion+"\nAño: "+anio+"\nDuración:"+duracion+"\nSubtitulos: "+subtitulos;
    }
}
