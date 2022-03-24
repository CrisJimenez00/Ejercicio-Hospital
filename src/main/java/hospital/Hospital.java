/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class Hospital {
     private String nombre;
    private String direccion;
    private int numCamas;
    
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Paciente> listaPacientes;

    public void contratarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    
    public void ingresarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }
    
    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numCamas = numeroCamas;
        this.listaEmpleados = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numCamas = numeroCamas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

}
