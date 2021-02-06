/**
 *
 * @author Celeste Dalia Alonso Castro
 */
public class Gasolina {

    //Atributos
    public String franquicia,calidad,motorCombustion;
    double cantidadOctanos,precio,cantidad;
    
    //Metodos 
    @Override
    public String toString (){
        return "\n\n\t GASOLINA\nCantidad de octanos o cetanos: "+cantidadOctanos+"\nprecio: $ "+precio+"\nCantidad: "+cantidad+" L\nFranquicia: "+franquicia+"\nCalidad: "+calidad+"\nMotor de combustion tipo: "+motorCombustion;
    }
}
