/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestTaza {
    public static void main (String[]args){
        //Intanciar objeto a clase
        Taza tazaRoja = new Taza();
        tazaRoja.material = "Plastico";
        tazaRoja.color = "Rojo";
        tazaRoja.tamanio = 5.0;
        tazaRoja.modelo = "Navideño";
        tazaRoja.precio = 350.9;
        
        System.out.println(tazaRoja);
        
        Taza tazaNaranja = new Taza("Naranja",119.50,"Industrial",10.5,"Plata");
        System.out.println(tazaNaranja);
    }
}
