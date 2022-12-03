package cl.duoc.bestpaws.DTO;

public class Medico extends Persona{
    
    private String Especialidad;

    public Medico(String Especialidad, int Rut, String NombreCompleto, String Direccion, String Correo) {
        super(Rut, NombreCompleto, Direccion, Correo);
        this.Especialidad = Especialidad;
    }

    public Medico() {
        this.Especialidad = "";
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
     @Override
    public String toString(){
        return "";
    }
      
}
