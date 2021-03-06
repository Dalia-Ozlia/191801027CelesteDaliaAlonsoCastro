
import ArchivoInformacion.Archivo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestArchivo {
    public static void main (String [] arg) {
        Archivo nuevoArc = new Archivo (1,"Proyecto 1",".pdf",1.0);
        System.out.println ("\nInformación de archivos:");
        System.out.println(nuevoArc);
        nuevoArc.setId(2);
        nuevoArc.setNombre("Proyecto 2");
        nuevoArc.setTipo(".dox");
        nuevoArc.setVersion(2.5);
        System.out.println(nuevoArc);
    }
}
