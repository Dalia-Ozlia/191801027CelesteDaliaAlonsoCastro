/**
 *
 * @author Celeste Dalia Alonso Castro
 */

public class TestGasolina {
    public static void main(String[]args) {
        //Crear un objeto, intanciar una clase
        Gasolina magna = new Gasolina();
        magna.cantidadOctanos = 87;
        magna.precio = 18.49;
        magna.cantidad = 1;
        magna.franquicia = "PEMEX";
        magna.calidad = "Media";
        magna.motorCombustion = "Magna";
        
        System.out.println(magna);
        
        Gasolina premium = new Gasolina();
        premium.cantidadOctanos = 91;
        premium.precio = 19.55;
        premium.cantidad = 1;
        premium.franquicia = "PEMEX";
        premium.calidad = "Alta";
        premium.motorCombustion = "Premium";
        
        System.out.println(premium);
        
        Gasolina diesel = new Gasolina();
        diesel.cantidadOctanos = 45;
        diesel.precio = 19.72;
        diesel.cantidad = 1;
        diesel.franquicia = "PEMEX";
        diesel.calidad = "Alta";
        diesel.motorCombustion = "Diesel";
        
        System.out.println(diesel);
    }
}
