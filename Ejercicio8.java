import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jugador 1");
        System.out.print("Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int jugador1 = scanner.nextInt();
        
        System.out.println("Jugador 2");
        System.out.print("Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int jugador2 = scanner.nextInt();
        
        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("Jugador 1 es el ganador");
        } else {
            System.out.println("Jugador 2 es el ganador");
        }
        
        scanner.close();
    }
}