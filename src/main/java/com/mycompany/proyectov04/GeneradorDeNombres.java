package com.mycompany.proyectov04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariadna Álvarez, Angel Jimenez, Melissa Matias, Daniel Miranda, Gustavo Bernal
 * 
 * Clase donde generaremos los nombres y apellidos de los alumnos de manera aleatoria
 * Tambien generaremos el numero de Cuenta de manera aleatoria
 */
public class GeneradorDeNombres extends Alumno {
    
    /**
     * numeroAleatorio y numeroAleatorio2 son para la funcion 
     * generarNombre
     */
    private int numeroAleatorio, numeroAleatorio2;
    
    /**
     * Estos numeros son para la funcion generaCuenta
     */
    private int numeroAleatorio1,numeroAleatorio3,numeroAleatorio4,numeroAleatorio5,numeroAleatorio6,
                numeroAleatorio7,numeroAleatorio8,numeroAleatorio9,numeroAleatorio22;
    
    public String nombres[] = { "Manuel", "Antonio", "Jose", "William", "George", "Joseph", "Thomas", "Carlos", "Frank",
            "Esteban", "Walter", "Damian", "Martin", "Samuel", "Santiago", "Sebastián", "Alejandro", "Jack", "Donald",
            "Albert", "Paul", "Daniel", "David", "Roy", "Hector", "Alejandra", "Elizabeth", "Maria", "Lucia",
            "Guadalupe", "Adriana", "Veronica", "Isabel", "Erika", "Daniela", "Monica", "Carmen", "Carolina",
            "Patricia", "Pilar", "Rosario", "Juana", "Isabel", "Antonia", "Dolores", "Luisa", "Gabriela", "Sofía",
            "Andrea", "Rosario","Alna","Tania","Raul","Cesar","Aide", "Jose","Angel","Perla","Ximena","Itzel","Julio","Cesar",
            "Juan","Carlos","Angelica","Luis","Miguel","Arat","Mauricio","Alfredo","Maria","Frida","Emma","Alejandra","Pamela","Ariadna",
            "Karen","Paulina","Eva","Daniela","Michelle","Gabriela","Daniel","Leonardo","Rogelio","Pedro","Pablo","Karina","Vivian","Hugo",
            "Victor","Irving","Francisco","Pablo","Jair","Diana","Eduardo","Ricardo","Francisco","Julia" };

    public String apellidos[] = { "Gonzalez", "Rodriguez", "Gomez", "Fernandez", "Lopez", "Diaz", "Alcantara", "Perez",
            "Garcia", "Sanchez", "Romero", "Sosa", "Alvarez", "Torres", "Ruiz", "Ramirez", "Flores", "Acosta",
            "Benitez", "Medina", "Suarez", "Herrera", "Aguirre", "Pereyra", "Gutierrez", "Gimenez", "Molina", "Silva",
            "Castro", "Rojas", "Ortiz", "Nuez", "Luna", "Juarez", "Cabrera", "Rios", "Ferreyra", "Huchin", "Morales",
            "Dominguez", "Moreno", "Peralta", "Vega", "Carrizo", "Hernández", "Quiroga", "Castillo", "Jasso",
            "Ledesma", "Ojeda","Juarez","Cano","Ortiz","Hernandez","Aguilar", "Cervantes","Robledo","Téllez","Estrada",
            "Escobar","Mancilla","Ramirez","Jimenez","Ledezma","Olmedo","Carbajal","Acevedo","Elizalde","Angulo","Espinoza",
            "Frías","Quintana","Morales","Moreno","Rosas","Perez","Terrazas","Reyes","Carrillo","Morales",
            "Escalona","Arroyo","Gasca","Valtierra","Mejia","Ramos","Vertíz","Cruz","Apango","Vargas",
            "Tapia","Barbosa","Pacheco","Silva","Mascareño","Vanegas","Ocasio","Coria","Santos","Pineda" };

    /**
     * Constructor Vacio del Generador de Nombres
     */
    public GeneradorDeNombres() {
    }

    /**
     * Generaremos 2 numeros aleatorios para los nombres y apellidos
     * Si el numero aleatorio1 su modulo es 0 y es numero es menor a 20
     * Entonces el alumno tendra 2 nombres
     * @param nombres
     * @param apellidos
     * @return nombre completo concatenando el nombre(s) y apellido
     */
    public String[] generarNombre(String nombres[], String apellidos[]) {
        for (int i = 0; i < this.nombreCompleto.length; i++) {
            numeroAleatorio1 = (int) (Math.random() * 99);
            numeroAleatorio2 = (int) (Math.random() * 99);
            if (numeroAleatorio % 2 == 0 && numeroAleatorio <= 20) {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.nombres[numeroAleatorio2] + " "
                        + this.apellidos[numeroAleatorio] + " " + this.apellidos[numeroAleatorio2];
            } else {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.apellidos[numeroAleatorio] + " "
                        + this.apellidos[numeroAleatorio2];
            }
        }
        return this.nombreCompleto;
    }
    
    /**
     * Generamos el numero de cuenta de manera aleatoria,conformado por
     * 8 numeros.
     * 
     * Deberia ir en registro academico pero se ve mejor aqui
     * 
     * @return Numero de Cuenta concatenando todos los numeros aleatorios y 
     * colocando un guion medio en tre los ultimos numeros
     */
    public String[] generaCuenta(){
           for (int i = 0; i < this.numDeCuenta.length; i++) {
               numeroAleatorio1 = (int) (Math.random() *8+1);
               numeroAleatorio3 = (int) (Math.random() *8+1);
               numeroAleatorio4 = (int) (Math.random() *8+1);
               numeroAleatorio5 = (int) (Math.random() *8+1);
               numeroAleatorio6 = (int) (Math.random() *8+1);
               numeroAleatorio7 = (int) (Math.random() *8+1);
               numeroAleatorio8 = (int) (Math.random() *8+1);
               numeroAleatorio9 = (int) (Math.random() *8+1);
               numeroAleatorio22 = (int) (Math.random()*8+1);
               
               numDeCuenta[i]= String.valueOf(numeroAleatorio7)+String.valueOf(numeroAleatorio1)+String.valueOf(numeroAleatorio3)
                       +String.valueOf(numeroAleatorio4)+String.valueOf(numeroAleatorio5)
                       +String.valueOf(numeroAleatorio6)+String.valueOf(numeroAleatorio8)+String.valueOf(numeroAleatorio9)
                       +"-"+String.valueOf(numeroAleatorio22);
               }    
           return this.numDeCuenta;
        } 
    }
