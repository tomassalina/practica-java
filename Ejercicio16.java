import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para obtener su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}