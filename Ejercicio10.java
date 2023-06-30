import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int maximo = num1;
        
        if (num2 > maximo && num2 > num3) {
            maximo = num2;
        }
        
        if (num3 > maximo && num3 > num2) {
            maximo = num3;
        }
        
        System.out.println("El número mayor es: " + maximo);
        
        scanner.close();
    }
}