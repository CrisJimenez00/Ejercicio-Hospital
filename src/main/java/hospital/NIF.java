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
public class NIF {

    //Atributos
    private String numero;
    private char letraDNI;
    private static int contador;
    private LocalDate fechaCaducidad;

    //metodo para renorvar dni
    public LocalDate renovar(LocalDate fechaSolicitudRenovacion) {
        LocalDate fecha = LocalDate.now();
        fecha = fechaSolicitudRenovacion.plusYears(10);

        return fecha;
    }

    //Metodo para generar la letra
    private char generaLetra(String numero) {
        char letra;
        //El switch con un caso para cada letra
        switch (Integer.parseInt(numero) % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            default:
                letra = 'E';
                break;
        }
        return letra;
    }

    //Constructores
    public NIF(String numero) {
        this.numero = numero;
        if (numero.length() == 8) {
            this.letraDNI = generaLetra(numero);
            contador++;
        } else {
            System.out.println("El numero tiene que tener 8 dígitos");
        }

    }

    //getters, no setters
    public String getNumero() {
        return numero;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    public int getContador() {
        return contador;
    }

    //toString
    @Override
    public String toString() {
        return numero + "-" + letraDNI;
    }

}
