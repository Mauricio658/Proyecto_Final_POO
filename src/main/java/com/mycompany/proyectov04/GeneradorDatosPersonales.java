/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyectov04;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Ariadna Álvarez, Angel Jimenez, Melissa Matias, Daniel Miranda, Gustavo Bernal
 * 
 * Clase donde generaremos los datos personales los cuales son:
 * Edad
 * Semestre
 * Dirección
 */
public class GeneradorDatosPersonales extends Alumno {

    private int edadAleatoria, semestreAleatorio;
    
    /**
     *Edad es aleatoria, de edades de entre 18 – 27. 
     * @return El valor de la Edad generado
     */
    protected int[] generarEdades() {
        for (int i = 0; i < this.edades.length; i++) {
            edadAleatoria = (int) (Math.random() * (17 - 28 + 1) + 28);
            edades[i] = edadAleatoria;
        }
        return edades;
    }
    
    /**
     * Generamos el semestre de acuerdo a la edad.
     * Un alumno de 5to semestre no puede tener 18.
     * @return semestre en curso
     */
    protected int[] generarSemestre() {
        for (int i = 0; i < this.semestres.length; i++) {
            if (edades[i] == 18) {
                semestreAleatorio = (int) (Math.random() * (0 - 5 + 1) + 5);
                semestres[i] = semestreAleatorio;
            } else if (edades[i] > 18) {
                semestreAleatorio = (int) (Math.random() * (6 - 11 + 1) + 11);
                semestres[i] = semestreAleatorio;
            }
        }
        return semestres;
    }

    /**
     * Generamos las 500 direcciones,las cuales leeemos 
     * desde un archivo .txt con la funcion leerArchivo()
     * @return
     * @throws IOException 
     */
    protected String[] generarDirecciones() throws IOException {
        int i=0;
        String texto = leerArchivo();
	StringTokenizer tokens=new StringTokenizer(texto, ";");
        while(tokens.hasMoreTokens()){
                direcciones[i]=""+tokens.nextToken();
                i++;
                if (i == 500)
                    break;
            //System.out.println(tokens.nextToken());
        }
        return direcciones;
    }
    
    /**
     * Encargado de leer las direcciones del txt
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private String leerArchivo () throws FileNotFoundException, IOException{
        FileInputStream direccion = null;
        byte[] buffer = new byte[100000];
        int nBytes;
        direccion = new FileInputStream("archivoConDirecciones.txt");
        nBytes = direccion.read(buffer, 0, 100000);
        String texto = new String(buffer, 0, nBytes); 
        return texto;
    }
}
