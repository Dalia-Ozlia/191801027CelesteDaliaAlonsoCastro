/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestAk {
    public static void main(String[]args) {
        //Crear un objeto, intanciar una clase
        Ak cobre = new Ak();
        cobre.material = "Cobre";
        cobre.disponibilidad = "Alta";
        cobre.municion = 5;
        cobre.precio = 10;
        cobre.velocidadDisparo = 10.5;
        cobre.danio = 5;
        
        System.out.println(cobre);
        
        Ak diamante = new Ak();
        diamante.material = "Diamante";
        diamante.disponibilidad = "Baja";
        diamante.municion = 20;
        diamante.precio = 12000;
        diamante.velocidadDisparo = 13;
        diamante.danio = 15;
        
        System.out.println(diamante);
    }
}
