
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class TestDisco {
    public static void main (String[] arg){
        ArrayList <Cancion> canciones = new ArrayList();
        Cancion cancion1 = new Cancion (1,"Como una novela",3.46);
        Cancion cancion2 = new Cancion (2,"Contra el dragón",3.38);
        Cancion cancion3 = new Cancion (3,"Como la flor",3.50);
        Cancion cancion4 = new Cancion (3,"Ramito de violetas",3.50);
        
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        
        Disco losAcosta = new Disco ("Los Acosta Exitos","Los Acosta",2010,canciones);
        System.out.println(losAcosta);
    }
}
