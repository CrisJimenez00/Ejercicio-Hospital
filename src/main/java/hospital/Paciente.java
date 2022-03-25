/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    //Método el cual dice qué paciente se toma la medicina, qué medicina
    //Y dice aleatoriamente si se ha curado o no
    public void tomarMedicina(String medicamento) {
        Random random = new Random();
        boolean curado = random.nextBoolean();

        System.out.println("Yo "  + getNombre() + " " + getApellidos() + " estoy tomando " + medicamento);
        if (curado) {
            System.out.println("El paciente se ha curado");
        } else {
            System.out.println("El paciente no se ha curado");
        }
    }
}
