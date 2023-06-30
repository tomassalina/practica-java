public class Ejercicio1 {
    public static void main(String[] args) {
        double evaluacion1 = 8.5;
        double evaluacion2 = 7.0;
        double evaluacion3 = 6.5;
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
        
        if (promedio >= 7.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
