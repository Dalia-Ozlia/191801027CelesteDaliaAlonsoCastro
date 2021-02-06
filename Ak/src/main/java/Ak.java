/**
 *
 * @author Celeste Dalia Alonso Castro
 */
public class Ak {

    //Atributos
    public String material,disponibilidad;
    int municion;
    double velocidadDisparo,danio,precio;
    
    //Metodos 
    @Override
    public String toString (){
        return "\n\nARMA\nMaterial: "+material+"\nDisponibilidad: "+disponibilidad+"\nMunicion: "+municion+"\nVelocidad de disparo: "+velocidadDisparo+"\nDaño: "+danio+"\nPrecio: "+precio;
    }
}


