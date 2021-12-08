/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectov04;

import java.io.IOException;
import java.util.Scanner;


/**
 *@version 5.2
 *@author Ariadna Álvarez, Angel Jimenez, Melissa Matias, Daniel Miranda, Gustavo Bernal
 *Clase principal en donde se van a mandar
 *a llamar a las demas clases
 */
public class AdministracionEscolar {
    public static void main(String[] args) throws IOException {
        System.out.println("*********BIENVENIDO AL SISTEMA ESCOLAR***********");
        int operacion = 0;
        GeneraLista admi = new GeneraLista();
        Alumno alumno = new Alumno();
        KeyboardInput in = new KeyboardInput();
        admi.traerDatos();
        /**
         * Se necesita generar el documento antes de Consultar y/o modificar
         */
        do{  
            System.out.println("                      MENU");
            System.out.println("\nSelecciona la opcion que quieres realizar.\n");
            System.out.println(" _____________________________________________________________________");
            System.out.println("|1 -> Modificar datos de un alumno (Necesita Generar el archivo Lista)|");
            System.out.println("|_____________________________________________________________________|");
            System.out.println("|2 -> Consultar datos de un alumno (Necesita Generar el archivo Lista)|");
            System.out.println("|_____________________________________________________________________|");
            System.out.println("|3 -> Crear Archivo con los datos generados                           |");
            System.out.println("|_____________________________________________________________________|");
            System.out.println("|4 -> Salir del programa                                              |");
            System.out.println("|_____________________________________________________________________|");
            Scanner leer=new Scanner(System.in);
            operacion=leer.nextInt();
            switch(operacion){
                case 1:
                    System.out.println("Cerrar el exportable antes de confirmar los cambios");
                    admi.CRUD();
                    alumno.archivoAlumnos(admi.registrosAlumnos);
                    boolean validacion = true;
                    int opcion = 0;
                                while(validacion == true){
                                    System.out.println("Desea realizar otra modificación\n| 1-> Si |\t| 2 -> No |");
                                    opcion = in.readInteger();
                                    if (opcion == 1){
                                        admi.CRUD();
                                        alumno.archivoAlumnos(admi.registrosAlumnos);
                                    }
                                    else if(opcion == 2){
                                        validacion = false;
                                        break;
                                    }
                                    else
                                        System.out.println("**Opción Incorrecta intentelo de nuevo**");
                                }
                break;
                case 2:
                    admi.consultar();
                break;
                case 3:
                   alumno.archivoAlumnos(admi.registrosAlumnos);
                case 4:
                    System.out.println("\n************Gracias por utilizar el sistema***********");
                    break;
                default:
                    System.out.println("\n***************OPCION INVALIDA****************");
                    System.out.println("** TECLEA UNA OPCION VALIDA  O PRESIONA 4 SI DESEAS SALIR **");
                break;
            }
        }
        while(operacion!=4);  
    }
}
