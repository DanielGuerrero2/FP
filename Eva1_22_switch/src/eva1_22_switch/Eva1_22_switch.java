/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_22_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int diaClase;
        Scanner sc = new Scanner(System.in);
        diaClase = sc.nextInt();
        sc.close();
     if(diaClase>0 && diaClase<8){
            switch (diaClase) {
                case 1:
                    System.out.println("es lunes y toca programacion");
                    
                case 3:
                    System.out.println("es miercoles y programación");
                    
                case 5:
                {
                    
                    System.out.println("es viernes y toca programación");
                }      
                default:
                    System.out.println("no hay clase de programación");
                    
            }

    }else{
        System.out.println("no es un dia valido");
    }
    
         }
    }
    
 
