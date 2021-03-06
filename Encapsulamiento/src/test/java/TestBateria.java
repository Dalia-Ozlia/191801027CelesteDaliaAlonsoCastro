
import Hardware.Bateria;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestBateria {
    public static void main (String[] arg) {
        Bateria batPorcentaje = new Bateria(100);
        System.out.println(batPorcentaje);
        batPorcentaje.setProcentaje(99);
        batPorcentaje.getPorcentaje();
        System.out.println(batPorcentaje);
    }
}
