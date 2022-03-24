/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Cris
 */
public class Medico extends Empleado {

    private String especialidad; // Pediatría, Cirugía, etc

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void tratarPaciente(Paciente paciente, String medicina) {
        System.out.println("El médico " + this.getNombre() + " le ha recetado al paciente "
                + paciente.getNombre() + " la medicina " + medicina);

        paciente.tomarMedicina(medicina);

    }

    @Override
    public double calcularIRPF() {
        if (getEspecialidad().equalsIgnoreCase("cirujano")) {
            return this.getSalario() * (25 / 100);
        } else {
            return this.getSalario() * (23.5 / 100);
        }
    }
}
