import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la primera evaluación: ");
        double evaluacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la segunda evaluación: ");
        double evaluacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la tercera evaluación: ");
        double evaluacion3 = scanner.nextDouble();
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3.0;
        
        System.out.println("El promedio es: " + promedio);
        
        switch ((int) promedio) {
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Reprobado");
                break;
        }
        
        scanner.close();
    }
}