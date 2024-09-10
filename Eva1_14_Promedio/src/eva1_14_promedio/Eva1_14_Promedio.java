/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_promedio;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_14_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa tu promedio de la materia ");
        double promedio = scanner.nextDouble();
        if (promedio >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("N/A");
        }
        scanner.close();
    }
    
}
