/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Pagos extends Usuario {
    private String nombre,fechaExpiracion;
    private int cvv,folio;
    private long numero;
    private double total;

    public Pagos() {
    }

    public Pagos(int id,String nombreUs, String nombre, String fechaExpiracion, int cvv, int folio, long numero, double total) {
        super(id, nombreUs);
        this.nombre = nombre;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
        this.folio = folio;
        this.numero = numero;
        this.total = total;
    }

    @Override
    public String toString() {
        return "ID Usuario: "+super.getId()+" Nombre Usuario: "+super.getNombreUs()+" Pagos{" + "nombre=" + getNombre() + ", fechaExpiracion=" + getFechaExpiracion() + ", cvv=" + getCvv() + ", folio=" + getFolio() + ", numero=" + getNumero() + ", total=" + getTotal() + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}