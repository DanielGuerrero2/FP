import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tu calificación");
        int calificacion = scanner.nextInt();
        String letraCalificacion = "";
        if (calificacion >= 90) {
            letraCalificacion = "A";
        } else if (calificacion >= 80) {
            letraCalificacion = "B";
        } else if (calificacion >= 70) {
            letraCalificacion = "C";
        } else if (calificacion >= 69) {
            letraCalificacion = "D";
        } else {
            letraCalificacion = "F";
        }
        System.out.println("Tu calificación es: " + letraCalificacion);
    }

}