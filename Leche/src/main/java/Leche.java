/**
 *
 * @author Tec. Celeste Dalia Alonso Castro
 */
public class Leche {
    //Atributos
    public String marca,tipo,loteNo,fechaCaducidad;
    public int codigoBarra;
    public double cantidad;
    
    //Metodo
    //Declarar Constructores
    
    //Constructor vacio
    public Leche(){
    }
    
    //Constructor completo
    public Leche (String marca,String tipo,double cantidad,int codigoBarra,String loteNo,String fechaCaducidad){
        this.marca = marca;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.codigoBarra = codigoBarra;
        this.loteNo = loteNo;
        this.fechaCaducidad = fechaCaducidad;
    }

    //Constructor toString
    @Override
    public String toString(){
        return "\n\n\tLECHE\nMarca: "+marca+"\nTipo: "+tipo+"\nCantidad: "+cantidad+" L\nCodigo de barras: "+codigoBarra+"\nNúmero de lote: "+loteNo+"\nFecha de caducidad: "+fechaCaducidad;
    }
}
