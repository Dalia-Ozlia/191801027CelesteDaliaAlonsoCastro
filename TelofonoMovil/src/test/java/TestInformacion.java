/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestInformacion {
    public static void main (String []arg){
        Informacion telefono = new Informacion("SAMSUNG","ACDA.1416","SAMSUNG NOTE 10+",8);
        System.out.println(telefono);
        telefono.setMarca("MOTOROLA");
        telefono.setMac("ACDA.1516");
        telefono.nombre = "MOTO G5";
        telefono.setRam(3);
        System.out.println(telefono);
    }
}
