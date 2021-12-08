/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectov04;

/**
 *
 *@author Ariadna Álvarez, Angel Jimenez, Melissa Matias, Daniel Miranda, Gustavo Bernal
 * 
 * Para el promedio artimetico solo se considera las calificaciones numericas (5 a 10)
 * El numero de inscripción considera toda la trayectoria escolar y no solo el rendimiento
 * del semestre anterios
 */

public class GeneradorNumerosInscripcion extends Alumno {
    private int indicadorEscolar; // (Promedio)(Escolaridad)(Velacidad)
    private float escolaridad; // (Asignatura aprobadas en ordinario/Asignaturas inscritas en ordinario)*100
    private float velocidad; // (Creditos del alumno/Creditos desde el ingreso)*100
    private float promedio;
    private int asignaturasAprobadas, creditosAlumno;
/**
 * Generamos el Indicador Escolar que es  (Promedio) x (Escolaridad) x (Velocidad )
 * @param totalReprobadas
 * @param asignaturas_y_creditos
 * @param promedio
 * @param creditosDescontar
 * @return El valor del Numero de Inscripción el caul pondera el promedio de los alumnos respecto
 * a su aprovechamiento y avance,con base en su semestre de ingreso y plan de estudios
 */
    public int[] generarNumero(int[] totalReprobadas, int[][] asignaturas_y_creditos, float[] promedio, int[] creditosDescontar) {
        for (int i = 0; i < 500; i++) {
            this.escolaridad = generarEscolaridad(totalReprobadas, asignaturas_y_creditos);
            this.velocidad = generarVelocidad(creditosDescontar, asignaturas_y_creditos);
            this.promedio = promedio[i];
            indicadorEscolar = (int) (this.promedio * this.escolaridad * this.velocidad);
            numeroInscripcion[i] = indicadorEscolar;
        }
        return numeroInscripcion;
    }

    /**
     * Generamos la Escolaridad que es (asiganutras aprobadas)/ (asignaturas inscritas)
     * Restamos las asignturas reprobadas,pero originalmente es la parte de arriba(se adapto asi)
     * @param totalReprobadas
     * @param asignaturas_y_creditos
     * @return El valor de la Escolaridad,donde originalmente no contabiliza los examenes
     * extraordinarios
     */
    public float generarEscolaridad(int[] totalReprobadas, int[][] asignaturas_y_creditos) {
        for (int i = 0; i < asignaturas_y_creditos.length; i++) {
            asignaturasAprobadas = asignaturas_y_creditos[i][0] - totalReprobadas[i];
            escolaridad = (float) ((float) asignaturasAprobadas / (float) asignaturas_y_creditos[i][0]) * 100;
        }
        return escolaridad;
    }
    
    /**
     * Generamos la Velocidad  que es  (Creditos del alumno/Creditos desde el ingreso)*100
     * Restamos los creditos de las asignaturas no aprobadas,pero originalmente es la parte de arriba(se adapto asi)
     * @param creditosDescontar
     * @param asignaturas_y_creditos
     * @return El valor de la velocidad,originalmente tambien descuenta los creditos
     * de los semestres autorizados en suspension escolar temporal
     */
    public float generarVelocidad(int[] creditosDescontar, int[][] asignaturas_y_creditos) {
        for (int i = 0; i < 500; i++) {
            creditosAlumno = (asignaturas_y_creditos[i][1]) - (creditosDescontar[i]);
            velocidad = (float) (((float) creditosAlumno / (float) asignaturas_y_creditos[i][1]) * 100);
        }
        return velocidad;
    }
}