/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eval1_practica_control_acceso;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eval1_Practica_control_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // TODO code application logic here
        String user ="Daniel";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu usuario");
        String userIntroducido = sc.nextLine();
        System.out.println("Introduce tu contraseña");
        String passwordIntroducido = sc.nextLine();
        if(user.equals(userIntroducido) && password.equals(passwordIntroducido)){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Usuario o contraseña incorrectos");
        }
        

        
    }
    
}
