/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval1.captura_auto_practica7;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eval1Captura_Auto_practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture;
        String modelo;
        String marca;
        int año;
        double precio;
        
        capture= new Scanner(System.in);
        System.out.println("Ingresa la marca");
        marca=capture.nextLine();
        System.out.println("Ingresa el modelo");
        modelo=capture.nextLine();
        System.out.println("Ingresa el año");
        año= capture.nextInt();
        System.out.println("Ingresa su precio");
        precio =capture.nextDouble();
        
        
        
        System.out.println("Datos Capturados");
        System.out.println(precio);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        
        
    }
    
    
}
