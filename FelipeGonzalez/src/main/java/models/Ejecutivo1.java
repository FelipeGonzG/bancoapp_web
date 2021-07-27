package models;

import javax.persistence.*;

@Entity

@NamedQueries({
    @NamedQuery(name = "Ejecutivo.findAll", query = "SELECT e FROM Ejecutivo e ORDER BY e.rut")
})

public class Ejecutivo1 {
    
    @Id
    @Column (name="rut")
    private String rut;
    private String nombre;
    private String apellido;
    private String clave;

    public Ejecutivo1() {
    }

    public Ejecutivo1(String rut, String nombre, String apellido, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }


    public String getRut() {
        return rut;
    }


    public void setRut(String rut) {
        this.rut = rut;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    public String getClave() {
        return clave;
    }

   
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Ejecutivo{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", clave=" + clave + '}';
    }
    
    
}
