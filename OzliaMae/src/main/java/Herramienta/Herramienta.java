package Herramienta;

/**
 *
 * @author celes
 */
public class Herramienta {
    private int herrID,torque;
    private int noSerie;
    private String marca,ubicacion;

    public Herramienta() {
    }

    public Herramienta(int herrID, int torque, int noSerie, String marca, String ubicacion) {
        this.herrID = herrID;
        this.torque = torque;
        this.noSerie = noSerie;
        this.marca = marca;
        this.ubicacion = ubicacion;
    }
    
    public Herramienta(int torque, int noSerie, String marca, String ubicacion) {
        this.torque = torque;
        this.noSerie = noSerie;
        this.marca = marca;
        this.ubicacion = ubicacion;
    }

    public Herramienta(int herrID) {
        this.herrID = herrID;
    }
    
    @Override
    public String toString() {
        return "Herramienta:" + getHerrID()+ " " + getUbicacion();
    }
    
    public String datosCompletos() {
        return "Herramienta{" + "herrID=" + herrID + ", torque=" + torque + ", noSerie=" + noSerie + ", marca=" + marca + ", ubicacion=" + ubicacion + '}';
    }

    public int getHerrID() {
        return herrID;
    }

    public void setHerrID(int herrID) {
        this.herrID = herrID;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(int noSerie) {
        this.noSerie = noSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
