import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        // Utilizando la sentencia lógica &&
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primera docena");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercera docena");
        } else {
            System.out.println("El número " + numero + " está fuera de rango");
        }
        
        // Utilizando la sentencia lógica ||
        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            System.out.println("El número pertenece a una de las docenas");
        } else {
            System.out.println("El número " + numero + " está fuera de rango");
        }
        
        scanner.close();
    }
}