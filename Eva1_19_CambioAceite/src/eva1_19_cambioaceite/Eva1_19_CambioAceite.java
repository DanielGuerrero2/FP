/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_cambioaceite;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva1_19_CambioAceite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Kilometraje;
        int meses;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el kilometraje del auto: ");
        Kilometraje = input.nextInt();
        System.out.println("Introduce los meses que han pasado desde el ultimo cambio de aceite: ");
        meses = input.nextInt();

        input.close();


        if(Kilometraje >= 5000 || meses >= 6){
            System.out.println("Cambio de aceite");
            }
        else{

            System.out.println("No es necesario cambio de aceite");
        }

    }
    
}
