public class Ejericico17-2 {
    public static void main(String[] args) {
        int valor1 = 4;
        int valor2 = 9;
        int valor3 = 12;
        int sumaPares = 0;
        
        sumaPares += valor1 * (valor1 % 2);
        sumaPares += valor2 * (valor2 % 2);
        sumaPares += valor3 * (valor3 % 2);
        
        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}