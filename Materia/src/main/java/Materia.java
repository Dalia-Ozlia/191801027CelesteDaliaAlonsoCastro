
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
public class Materia {
     //Atributos
    public String nombreMateria,codigoMateria,carreraMateria;
    public int cuatrimestre,creditosMateria;
    
    //Metodo
    //Declarar Constructores
    //Constructor vacio
    public Materia(){
    }
    //Constructor completo
    public Materia (String nombreMateria,String codigoMateria,String carreraMateria,int cuatrimestre,int creditosMateria){
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
        this.carreraMateria = carreraMateria;
        this.carreraMateria= carreraMateria;
        this.cuatrimestre = cuatrimestre;
        this.creditosMateria = creditosMateria;
    }

    //Constructor toString
    @Override
    public String toString(){
        return "\n\n\tMATERIA\nNombre: "+nombreMateria+"\nCodigo: "+codigoMateria+"\nCarrera: "+carreraMateria+"\nCuatrimestre: "+cuatrimestre+"\nCreditos: "+creditosMateria;
    }
}
