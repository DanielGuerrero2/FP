import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el año: ");

        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}