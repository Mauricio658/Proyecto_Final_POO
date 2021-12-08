/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectov04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Ariadna Álvarez, Angel Jimenez, Melissa Matias, Daniel Miranda, Gustavo Bernal
 * 
 * Clase alumno donde estara la funcion generar archivo exportable
 */
public class Alumno {
    protected String[] nombreCompleto = new String[500];// Almacena los nombres de los alumnos
    protected int[] edades = new int[500];// Almacena las edades de los alumnos
    protected int[] semestres = new int[500];// Almacena los semestres de los alumnos
    protected int[][] asiganturasCreditos = new int[500][2];// Almacena el numero de asignaturas y creditos del alumno
    protected int[] numeroInscripcion = new int[500];// Almacena los numeros de inscripción
    protected float[] promedios = new float[500];
    protected String[] direcciones = new String[500];
    protected String[] materias = new String[500];
    protected String[] calificaciones = new String[500];
    protected String[] numDeCuenta = new String[500];
    
    KeyboardInput in = new KeyboardInput();
    
    /**
     * Encargada de exportar todos los atributos de la clase alumno a un archivo .cvs
     * El cual recibe los registros de los alumnos y lo concatenamos antes de guardar en el 
     * exportable
     * @param registrosAlumnos 
     */
    public void archivoAlumnos(String[][] registrosAlumnos){
        
        String texto = "Nombre, Edad, Semestre, NumeroInscripcion, NumeroDeCuenta \n";
        for (int i = 0; i < registrosAlumnos.length; i++) {
            texto += registrosAlumnos[i][0] + ", " + registrosAlumnos[i][1]+"\n";
        }
        
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("datosExportables.csv");//Se crea un archivo
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.close();
        }catch(IOException ioe){
            System.out.println("\n\nError al abrir o guardar el archivo: ");
            ioe.printStackTrace();
        }catch(Exception e){
            System.out.println("\n\nError al leer de teclado: ");
            e.printStackTrace();
        }
    }
}
