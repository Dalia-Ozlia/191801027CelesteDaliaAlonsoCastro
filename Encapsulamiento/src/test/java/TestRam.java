
import Hardware.Ram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestRam {
    public static void main (String[] arg) {
        Ram ramInformacion = new Ram(8,2,"DRAM");
        System.out.println(ramInformacion);
        ramInformacion.setTamanio(2);
        ramInformacion.setModulos(1);
        ramInformacion.setTipo("SRAM");
        System.out.println(ramInformacion);
    }
}
