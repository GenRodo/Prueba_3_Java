package cl.duoc.bestpaws.DTO;

public abstract class Persona {
    
    private int Rut;
    private String NombreCompleto;
    private String Direccion;
    private String Correo;

    public Persona(int Rut, String NombreCompleto, String Direccion, String Correo) {
        this.Rut = Rut;
        this.NombreCompleto = NombreCompleto;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }
    
    public Persona() {
        this.Rut = 0;
        this.NombreCompleto = "";
        this.Direccion = "";
        this.Correo = "";
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
