package Empleado;

/**
 *
 * @author celes
 */
public class Empleado {
    private int empID;
    private String nombre,empTipo,password;

    public Empleado() {
    }

    public Empleado(int empID, String password) {
        this.empID = empID;
        this.password = password;
    }

    public Empleado(int empID, String nombre, String empTipo, String password) {
        this.empID = empID;
        this.nombre = nombre;
        this.empTipo = empTipo;
        this.password = password;
    }

    public Empleado(String nombre, String empTipo, String password) {
        this.nombre = nombre;
        this.empTipo = empTipo;
        this.password = password;
    }

    public Empleado(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Empleado:" + getEmpID() + getNombre();
    }
    
    public String datosCompletos() {
        return "Empleado{" + "empID=" + getEmpID() + ", nombre=" + getNombre() + ", empTipo=" + getEmpTipo() + ", password=" + getPassword() + '}';
    }
    
    public String acceso() {
        return "Empleado: " + getEmpID() + " " + getPassword();
    }
    
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmpTipo() {
        return empTipo;
    }
    public void setEmpTipo(String empTipo) {
        this.empTipo = empTipo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
