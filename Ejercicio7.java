import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int maximo = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("El número mayor es: " + maximo);
        
        scanner.close();
    }
}