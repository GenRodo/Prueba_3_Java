package cl.duoc.bestpaws.DTO;

import java.time.LocalDate;

public class Mascota {
    
    private int CodigoMC;
    private String Nombre;
    private Cliente cliente;
    private LocalDate FechaNacimiento;
    private String Especie;
    private String Raza;
    private String Descripcion;

    public Mascota(int CodigoMC, String Nombre, Cliente cliente, LocalDate FechaNacimiento, String Especie, String Raza, String Descripcion) {
        this.CodigoMC = CodigoMC;
        this.Nombre = Nombre;
        this.cliente = cliente;
        this.FechaNacimiento = FechaNacimiento;
        this.Especie = Especie;
        this.Raza = Raza;
        this.Descripcion = Descripcion;
    }
    
    public Mascota() {
        this.CodigoMC = 0;
        this.Nombre = "";
        this.cliente = cliente;
        this.FechaNacimiento = LocalDate.now();
        this.Especie = "";
        this.Raza = "";
        this.Descripcion = "";
    }

    public int getCodigoMC() {
        return CodigoMC;
    }

    public void setCodigoMC(int CodigoMC) {
        this.CodigoMC = CodigoMC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
     @Override
    public String toString(){
        return "";
    }
      
}
