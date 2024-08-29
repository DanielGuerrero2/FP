/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval1_entradadedatos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eval1_EntradaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner capture;
        
        capture = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo");
        //Capturar la entrada
        nombre= capture.nextLine();
        System.out.println("Datos capturados!!!");
        System.out.println(nombre);
        
    }
    
}
