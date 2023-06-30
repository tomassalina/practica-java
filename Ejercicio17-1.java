public class Ejercicio17-1 {
    public static void main(String[] args) {
        int valor1 = 4;
        int valor2 = 9;
        int valor3 = 12;
        int sumaPares = 0;
        
        if (valor1 % 2 == 0) {
            sumaPares += valor1;
        }
        
        if (valor2 % 2 == 0) {
            sumaPares += valor2;
        }
        
        if (valor3 % 2 == 0) {
            sumaPares += valor3;
        }
        
        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}