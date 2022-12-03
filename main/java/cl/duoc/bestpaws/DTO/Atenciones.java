package cl.duoc.bestpaws.DTO;

import java.time.LocalDate;

public class Atenciones {
    
    private LocalDate fechaAtencion;
    private Medico medico;
    private Mascota mascota;
    private String Procedimiento;
    private String Observaciones;
    private int Valor;

    public Atenciones(LocalDate fechaAtencion, Medico medico, Mascota mascota, String Procedimiento, String Observaciones, int Valor) {
        this.fechaAtencion = fechaAtencion;
        this.medico = medico;
        this.mascota = mascota;
        this.Procedimiento = Procedimiento;
        this.Observaciones = Observaciones;
        this.Valor = Valor;
    }
    
    public Atenciones() {
        this.fechaAtencion = LocalDate.now();
        this.medico = medico;
        this.mascota = mascota;
        this.Procedimiento = "";
        this.Observaciones = "";
        this.Valor = 0;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
     @Override
    public String toString(){
        return "";
    }

}
