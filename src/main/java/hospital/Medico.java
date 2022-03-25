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

    //Método el cual hace que un médico trate a un paciente, indicando así el 
    //nombre del paciente, el medicamento e indirectamente llama al método de 
    //tomarMedicina de la clase paciente
    public void tratarPaciente(Paciente paciente, String medicina) {
        System.out.println("El médico " + this.getNombre() + " " + this.getApellidos() + " le ha recetado al paciente "
                + paciente.getNombre() + " la medicina " + medicina);

        paciente.tomarMedicina(medicina);

    }

    //Calcula el IRPF dependiendo si es cirujano o no
    @Override
    public double calcularIRPF() {
        if (getEspecialidad().equalsIgnoreCase("cirujano")) {
            return this.getSalario() * 0.25;
        } else {
            return this.getSalario() * 0.235;
        }
    }
}
