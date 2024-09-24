/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval1_18_rango;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eval1_18_Rango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("introdce tu calificacion: ");

        int calificacion = sc.nextInt();
        sc.close();
        if(calificacion>0 && calificacion<=100){
        System.out.println("Calificacion valida");
        if(calificacion>=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("NA");
        }


    }else{
        System.out.println("Calificacion no valida");
    }
}
    
}
