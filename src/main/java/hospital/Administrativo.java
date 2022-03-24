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
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println(getNombre() + " " + getApellidos() + " " + nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {
        double resultado = 0;
        //Dependiendo del grupo lo calcula de una forma u otra
        switch (getGrupo()) {
            case C:
                resultado = getSalario() * (grupo.getIrpf() / 100);
                break;
            case D:
                resultado = getSalario() * (grupo.getIrpf() / 100);
                break;
            case E:
                resultado = getSalario() * (grupo.getIrpf() / 100);
                break;
        }
        return resultado;
    }

}
