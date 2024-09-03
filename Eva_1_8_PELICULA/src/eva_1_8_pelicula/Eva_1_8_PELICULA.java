/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva_1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        String reparto;
        char clasificacion;

        Scanner capture;

        capture = new Scanner(System.in);

        System.out.println("Introduce el nombre de la pelicula");
        nombre = capture.nextLine();
        System.out.println("Introduce el reparto de la pelicula");
        reparto = capture.nextLine();
        System.out.println("Introduce la clasificacion de la pelicula");

        clasificacion = capture.next().charAt(0);
        System.out.println("Introduce la duracion de la pelicula");

        int duracion = capture.nextInt();
        System.out.println("Introduce el genero de la pelicula");
        genero = capture.nextLine();
        
        capture.close();

        System.out.println("Estos son los datos de la pelicula");
        System.out.println("Nombre: " + nombre);
        System.out.println("Reparto: " + reparto);
        System.out.println("Clasificacion: " + clasificacion);
        System.out.println("Duracion: " + duracion);
        System.out.println("Genero de la pelicula"+ genero);

    }

}
