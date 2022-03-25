/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author Cris
 */
public abstract class Persona {

    private String nombre;
    private String apellidos;
    private NIF nif;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }

    //Método el cual renueva el nif y le suma 10 años
    public final void renovarNif(LocalDate fechaSolicitud) {
        //Pongo un sour dentro para que salga directamente el resultado
        //(la fecha con los 10 años sumados) cuando llamamos al método
        System.out.println("la fecha de renovación ha cambiado a: " + getNif().renovar(fechaSolicitud));

    }
}
