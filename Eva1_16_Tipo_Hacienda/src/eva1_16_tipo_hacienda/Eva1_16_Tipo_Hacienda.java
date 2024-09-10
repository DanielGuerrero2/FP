/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_16_Tipo_Hacienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipoHacienda;
        Scanner scanner;

        System.out.println("Introduce el tipo de hacienda: ");
        scanner = new Scanner(System.in);
        tipoHacienda = scanner.next().charAt(0);
        scanner.close();
        if (tipoHacienda=='F') {
            System.out.println("Hacienda de tipo Fisica");
            
        }
        else if (tipoHacienda=='M') {
            System.out.println("Hacienda de tipo Moral");
        }
        else{
            System.out.println("Tipo de hacienda no valido");
        }
        
        
    }
    
}
