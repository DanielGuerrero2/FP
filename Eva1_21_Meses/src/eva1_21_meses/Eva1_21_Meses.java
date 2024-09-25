/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_21_Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 12");
        int mes = sc.nextInt();
        if(mes < 1 || mes > 12){
            System.out.println("Número inválido");
            
        }
        if (mes == 1){
            System.out.println("Enero");
        }else if (mes == 2){
            System.out.println("Febrero");
        }else if (mes == 3){
            System.out.println("Marzo");
        }else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Mayo");
        }else if (mes == 6){
            System.out.println("Junio");
        }else if (mes == 7){
            System.out.println("Julio");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Septiembre");
        }else if (mes == 10){
            System.out.println("Octubre");
        }else if (mes == 11){
            System.out.println("Noviembre");
        }else if (mes == 12){
            System.out.println("Diciembre");
        }
        
           
        

        

    }
    
}
