/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroestudiantes;

/**
 *
 * @author nicol
 */
public abstract class Estudiantes {
    protected String nombre;
    protected String rut;
    protected int edad;
    protected int descuento;    
    protected String extra;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String rut, int edad, int descuento, String extra) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.descuento = descuento;
        this.extra = extra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    
}
