/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celes
 */
public class Usuario {
    private int id;
    private String nombreUs,contraseña,fechaAlta;
    private boolean status;

    public Usuario() {
    }

    public Usuario(int id, String nombreUs, String contraseña, String fechaAlta, boolean status) {
        this.id = id;
        this.nombreUs = nombreUs;
        this.contraseña = contraseña;
        this.fechaAlta = fechaAlta;
        this.status = status;
    }

    public Usuario(int id, String nombreUs) {
        this.id = id;
        this.nombreUs = nombreUs;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + getId() + ", nombreUs=" + getNombreUs() + ", contrase\u00f1a=" + getContraseña() + ", fechaAlta=" + getFechaAlta() + ", status=" + isStatus() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}