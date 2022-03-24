/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cris
 */
public class GestionHospital {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        //Se crea el hospital
        Hospital hospital = new Hospital("Costa del Sol", "Tatiana Vera", 10000);
        //Se crean 3 administrativos
        Empleado a1 = new Administrativo(Grupo.C, "223-81-8142", 1200, "Salud", "Alfonso", new NIF("50243110"));
        Empleado a2 = new Administrativo(Grupo.E, "223-81-8178", 1800, "María", "González", new NIF("50243740"));
        Empleado a3 = new Administrativo(Grupo.D, "223-81-8177", 1900, "Antonio", "Ramíred", new NIF("50243770"));
        hospital.contratarEmpleado(a1);
        hospital.contratarEmpleado(a2);
        hospital.contratarEmpleado(a3);
        listaEmpleados.add(a1);
        listaEmpleados.add(a2);
        listaEmpleados.add(a3);

        //Se crean dos médicos
        Empleado m1 = new Medico("cirujano", "510-42-8735", 2500, "Eduard", "Antolin", new NIF("36606402"));
        Empleado m2 = new Medico("pediatria", "510-42-8740", 1500, "Eduarda", "Fernández", new NIF("36606782"));
        hospital.contratarEmpleado(m1);
        hospital.contratarEmpleado(m2);
        listaEmpleados.add(m1);
        listaEmpleados.add(m2);

        Paciente p1 = new Paciente("111111111", "Justa", "Andres", new NIF("35349258"));
        Paciente p2 = new Paciente("111111221", "Blas", "Castaño", new NIF("94829322"));
        hospital.ingresarPaciente(p1);
        hospital.ingresarPaciente(p2);

        for (Empleado listaEmpleado : listaEmpleados) {
            if (listaEmpleado instanceof Medico) {
                ((Medico) listaEmpleado).tratarPaciente(p2, "Pancetamol :)");
                break;
            }
        }
//        p1.reovarNif(LocalDate.now());
        
        System.out.println("El paciente p1 ha renovado su dni para: " + p1.getNif().renovar(LocalDate.now()));
    }

}
