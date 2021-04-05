package Refaccion;

/**
 *
 * @author celes
 */
public class Refaccion {
    private int refaID,cc,mattoID;
    private String descripcion,marca;
    private float costo;

    public Refaccion() {
    }

    public Refaccion(int refaID) {
        this.refaID = refaID;
    }

    public Refaccion(int cc, int mattoID, String descripcion, String marca, float costo) {
        this.cc = cc;
        this.mattoID = mattoID;
        this.descripcion = descripcion;
        this.marca = marca;
        this.costo = costo;
    }

    public Refaccion(int refaID, int cc, int mattoID, String descripcion, String marca, float costo) {
        this.refaID = refaID;
        this.cc = cc;
        this.mattoID = mattoID;
        this.descripcion = descripcion;
        this.marca = marca;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Refaccion:" + getRefaID() + " " + getDescripcion();
    }
    
     public String datosCompletos() {
        return "Refaccion{" + "refaID=" + getRefaID() + ", cc=" + getCc() + ", mattoID=" + getMattoID() + ", descripcion=" + getDescripcion() + ", marca=" + getMarca() + ", costo=" + getCosto() + '}';
    }

    public int getRefaID() {
        return refaID;
    }

    public void setRefaID(int refaID) {
        this.refaID = refaID;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getMattoID() {
        return mattoID;
    }

    public void setMattoID(int mattoID) {
        this.mattoID = mattoID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
