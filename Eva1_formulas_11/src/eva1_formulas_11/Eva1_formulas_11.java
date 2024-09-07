/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_formulas_11;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_formulas_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        
        double dDistancia, dVelocidad, dTiempo, dAceleracion;
        

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la velocidad: ");
        dVelocidad = input.nextDouble();
        System.out.println("Introduce el tiempo: ");
        dTiempo = input.nextDouble();
        //pide la aceleracion
        System.out.println("Introduce la aceleracion: ");
        dAceleracion = input.nextDouble();
        dDistancia = dVelocidad * dTiempo + 0.5 * dAceleracion * dTiempo * dTiempo;
        

        
      
        


        
        
        input.close();
        System.out.println("La distancia recorrida es: " + dDistancia);



        

    }
    
}
