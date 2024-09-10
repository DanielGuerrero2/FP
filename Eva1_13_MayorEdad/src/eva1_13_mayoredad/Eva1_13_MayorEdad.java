/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_mayoredad;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_13_MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int iEdad = scanner.nextInt();
        scanner.close();
        if(iEdad >= 18){
            System.out.println("Eres mayor de edad");
    }
        else{
            System.out.println("Eres menor de edad");
        }
    }
    
}
