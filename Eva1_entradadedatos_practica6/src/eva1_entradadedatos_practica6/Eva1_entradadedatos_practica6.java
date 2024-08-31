/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_entradadedatos_practica6;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_entradadedatos_practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner capture;
        String nombre;
        String curp;
        double promedio;
        int edad;
        capture= new  Scanner(System.in);
        System.out.println("Captura tu nombre completo:");
        nombre=capture.nextLine();
        System.out.println("Captura tu curp");
        curp= capture.nextLine();
        System.out.println("Captura tu edad");
        edad= capture.nextInt();
        System.out.println("Captura tu promedio:");
        promedio=capture.nextDouble();
        System.out.println("Datos registrados!");
        
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
    
}
