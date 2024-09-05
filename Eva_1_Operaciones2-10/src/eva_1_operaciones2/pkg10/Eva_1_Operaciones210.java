/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_operaciones2.pkg10;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva_1_Operaciones210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pide los grados centigrados al usuario
        Scanner capture;
        //Pide datos farenheit al usuario y conviertelo a centigrados
        //
        double dFarenheit;
        double dCentigrados;
        double dkelvins;
        capture = new Scanner(System.in);
        System.out.println("Introduce los grados Farenheit: ");
        dFarenheit = capture.nextDouble();
        dCentigrados = (dFarenheit - 32) / 1.8;
        System.out.println("Los grados centigrados son: " + dCentigrados);
        //Pide datos centigrados al usuario y conviertelo a  kelvin
        System.out.println("Introduce los grados centigrados: ");
        dCentigrados = capture.nextDouble();
        dkelvins = dCentigrados + 273.15;
        System.out.println("Los grados kelvin son: " + dkelvins);
        System.out.println("Introduce los grados celcius: ");
        dCentigrados = capture.nextDouble();
        dFarenheit = (dCentigrados * 1.8) + 32;
        System.out.println("Los grados farenheit son: " + dFarenheit);
        capture.close();
    
        
        

        
        
    }
    
}
