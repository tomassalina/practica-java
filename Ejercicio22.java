public class Ejercicio22 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Empleado " + contador + ":");

            // Generar categoría aleatoria (A, B o C)
            String categoria;
            int categoriaAleatoria = (int) (Math.random() * 3); // Genera un número aleatorio entre 0 y 2

            switch (categoriaAleatoria) {
                case 0:
                    categoria = "A";
                    break;
                case 1:
                    categoria = "B";
                    break;
                case 2:
                    categoria = "C";
                    break;
                default:
                    categoria = "A";
                    break;
            }

            // Generar antigüedad aleatoria (1 a 15 años)
            int antiguedad = (int) (Math.random() * 15) + 1;

            // Generar sueldo bruto aleatorio (1000 a 5000)
            double sueldoBruto = (Math.random() * 4000) + 1000;

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto;

            switch (categoria) {
                case "A":
                    sueldoNeto += 1000;
                    break;
                case "B":
                    sueldoNeto += 2000;
                    break;
                case "C":
                    sueldoNeto += 3000;
                    break;
                default:
                    System.out.println("Categoría inválida");
                    continue;
            }

            if (antiguedad >= 1 && antiguedad <= 5) {
                sueldoNeto *= 1.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                sueldoNeto *= 1.1;
            } else if (antiguedad > 10) {
                sueldoNeto *= 1.3;
            }

            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: " + sueldoBruto);
            System.out.println("Sueldo neto: " + sueldoNeto);
            System.out.println();

            contador++;
        }
    }
}