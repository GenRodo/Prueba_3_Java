package cl.duoc.bestpaws.DTO;

public class Cliente extends Persona{
    
    private String Comuna;
    private int Telefono;
    private boolean Particular;

    public Cliente(String Comuna, int Telefono, boolean Particular, int Rut, String NombreCompleto, String Direccion, String Correo) {
        super(Rut, NombreCompleto, Direccion, Correo);
        this.Comuna = Comuna;
        this.Telefono = Telefono;
        this.Particular = Particular;
    }

    public Cliente() {
        this.Comuna = "";
        this.Telefono = 0;
        this.Particular = false;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public boolean isParticular() {
        return Particular;
    }

    public void setParticular(boolean Particular) {
        this.Particular = Particular;
    }

    @Override
    public String toString(){
        return "";
    }
    
}
