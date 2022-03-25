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
        int contador = 0;//nos sirve para saber el número del documento

        //Las listas que nos servirán para organizar los pacientes y trabajadores
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Medico> listaMedicos = new ArrayList<>();
        ArrayList<Paciente> listaPaciente = new ArrayList<>();

        //Se crea el hospital
        Hospital hospital = new Hospital("Costa del Sol", "Tatiana Vera", 10000);

        //Se crean 3 administrativos
        Empleado a1 = new Administrativo(Grupo.C, "223-81-8142", 1200, "Salud", "Alfonso", new NIF("50243110", LocalDate.of(2019, 7, 30)));
        Empleado a2 = new Administrativo(Grupo.E, "223-81-8178", 1800, "María", "González", new NIF("50243740", LocalDate.of(2020, 8, 20)));
        Empleado a3 = new Administrativo(Grupo.D, "223-81-8177", 1900, "Antonio", "Ramíred", new NIF("50243770", LocalDate.of(2025, 2, 18)));
        hospital.contratar(a1);
        hospital.contratar(a2);
        hospital.contratar(a3);
        listaEmpleados.add(a1);
        listaEmpleados.add(a2);
        listaEmpleados.add(a3);

        //Se crean dos médicos
        Empleado m1 = new Medico("cirujano", "510-42-8735", 2500, "Eduard", "Antolin", new NIF("36606402", LocalDate.of(2021, 2, 14)));
        Empleado m2 = new Medico("pediatria", "510-42-8740", 1500, "Eduarda", "Fernández", new NIF("36606782", LocalDate.of(2021, 5, 17)));
        hospital.contratar(m1);
        hospital.contratar(m2);
        listaEmpleados.add(m1);
        listaEmpleados.add(m2);

        Paciente p1 = new Paciente("111111111", "Justa", "Andres", new NIF("35349258", LocalDate.of(2028, 2, 1)));
        Paciente p2 = new Paciente("111111221", "Blas", "Castaño", new NIF("94829322", LocalDate.of(2022, 12, 17)));
        Paciente p3 = new Paciente("111111222", "Juan-Jose", "del Castillo", new NIF("47766403", LocalDate.of(2024, 9, 14)));
        Paciente p4 = new Paciente("111111223", "Fran", "Cabezas", new NIF("54679875", LocalDate.of(2026, 9, 5)));
        Paciente p5 = new Paciente("111111224", "Marius", "Hinojosa", new NIF("34411936", LocalDate.of(2027, 8, 6)));
        hospital.ingresar(p1);
        hospital.ingresar(p2);
        hospital.ingresar(p3);
        hospital.ingresar(p4);
        hospital.ingresar(p5);
        listaPaciente.add(p1);
        listaPaciente.add(p2);
        listaPaciente.add(p3);
        listaPaciente.add(p4);
        listaPaciente.add(p5);
        
        for (Empleado listaEmpleado : listaEmpleados) {
            if (listaEmpleado instanceof Medico) {
                listaMedicos.add((Medico) listaEmpleado);
            }
            if (listaEmpleado instanceof Administrativo) {
                ((Administrativo) listaEmpleado).registrarDocumento("Documento " + (contador + 1));
                contador++;
            }
        }
        
        System.out.println("\n\n");
        //Numero aleatorio específico para los médicos
        int numRandomMedico = random.nextInt(2);
        for (int i = 0; i < listaMedicos.size(); i++) {
            if (i == numRandomMedico) {
                //Número aleatorio específico para elegir el paciente
                int numRandomPaciente = random.nextInt(5);
                for (int j = 0; j < listaPaciente.size(); j++) {
                    if (j == numRandomPaciente) {
                        listaMedicos.get(i).tratarPaciente(listaPaciente.get(j), "Pancetamol :)");
                    }
                }
            }
        }

        System.out.println("\n\n");

        System.out.println("El IRPF del cirujanoes de: " + m1.calcularIRPF()
                + "\nDe otro médico: " + m2.calcularIRPF());

        System.out.println("\n\nEl IRPF del sueldo de los distintos administrativos es de:\n"
                + "Administrativo 1 grupo C-> " + a1.calcularIRPF()
                + "\nAdministrativo 2 grupo E-> " + a2.calcularIRPF()
                + "\nAdministrativo 3 grupo D-> " + a3.calcularIRPF());

        System.out.println("\n\n");
        p1.renovarNif(p1.getNif().getFechaCaducidad());

    }

}
