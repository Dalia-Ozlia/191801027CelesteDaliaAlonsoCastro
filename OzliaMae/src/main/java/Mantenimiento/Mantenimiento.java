package Mantenimiento;

/**
 *
 * @author celes
 */
public class Mantenimiento {
    private int mattoID,empID,herrID,status;
    private String fechaHoraInicio, fechaHoraFin, recibe, comentario;

    public Mantenimiento() {
    }

    public Mantenimiento(int mattoID, int empID, int herrID, int status, String fechaHoraInicio, String fechaHoraFin, String recibe, String comentario) {
        this.mattoID = mattoID;
        this.empID = empID;
        this.herrID = herrID;
        this.status = status;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.recibe = recibe;
        this.comentario = comentario;
    }

    public Mantenimiento(int mattoID) {
        this.mattoID = mattoID;
    }
    
    public Mantenimiento(int empID, int herrID, int status, String comentario) {
        this.empID = empID;
        this.herrID = herrID;
        this.status = status;
        this.comentario = comentario;
    }
    
    public Mantenimiento(int empID, int status, String fechaHoraFin, String recibe, String comentario) {
        this.empID = empID;
        this.status = status;
        this.fechaHoraFin = fechaHoraFin;
        this.recibe = recibe;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Mantenimiento:" + getMattoID() + getEmpID() + getHerrID();
    }
    
    public String datosCompletos() {
        return "Mantenimiento{" + "mattoID=" + getMattoID() + ", empID=" + getEmpID() + ", herrID=" + getHerrID() + ", status=" + getStatus() + ", fechaHoraInicio=" + getFechaHoraInicio() + ", fechaHoraFin=" + getFechaHoraFin() + ", recibe=" + getRecibe() + ", comentario=" + getComentario() + '}';
    }

    public int getMattoID() {
        return mattoID;
    }

    public void setMattoID(int mattoID) {
        this.mattoID = mattoID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getHerrID() {
        return herrID;
    }

    public void setHerrID(int herrID) {
        this.herrID = herrID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(String fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(String fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
