/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlescolar;

/**
 *
 * @author tracher
 */
import java.util.Scanner;

public class ControlEscolar {
    
    public static void main(String[] args) {
        InformacionAlumno alumno = new InformacionAlumno();
        alumno.InformacionPersonal();
        alumno.InformacionAcademica();
        alumno.Horarios();
        
        Calificaciones calificaciones = new Calificaciones();
        calificaciones.Materias();
        calificaciones.Promedio();
    }
    
}

class InformacionAlumno {
    
    private String nombreCompleto;
    private String fechaNacimiento;
    private String telefono;
    private String direccion;
    private String numCuenta;
    private String semestre;
    private String horario;
    
    public void InformacionPersonal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el nombre completo del alumno: ");
        nombreCompleto = input.nextLine();
        System.out.println("Ingresa la fecha de nacimiento del alumno (DD/MM/AAAA): ");
        fechaNacimiento = input.nextLine();
        System.out.println("Ingresa el teléfono del alumno: ");
        telefono = input.nextLine();
        System.out.println("Ingresa la dirección del alumno: ");
        direccion = input.nextLine();
    }
    
    public void InformacionAcademica() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el número de cuenta del alumno: ");
        numCuenta = input.nextLine();
        System.out.println("Ingresa el semestre que cursa el alumno: ");
        semestre = input.nextLine();
    }
    
    public void Horarios() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa las materias que cursa el alumno (horario): ");
        horario = input.nextLine();
    }
    
}

class Calificaciones {
    
    private double promedio;
    private String[] materias = {"programacion", "ingles 7", "arquitectura", "Proyectos_de_isw", "basededatos"};
    private double[] calificaciones = new double[materias.length];
    
    public void Materias() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingresa la calificación de " + materias[i] + ": ");
            calificaciones[i] = input.nextDouble();
        }
    }
    
    public void Promedio() {
        double sumaCalificaciones = 0;
        for (int i = 0; i < materias.length; i++) {
            sumaCalificaciones += calificaciones[i];
        }
        promedio = sumaCalificaciones / materias.length;
        System.out.printf("El promedio del alumno es: %.2f\n", promedio);
    }
    
}

