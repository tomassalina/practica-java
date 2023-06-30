public class Ejercicio3 {
    public static void main(String[] args) {
        String nombreMes = "Noviembre";
        int cantidadDias = 0;
        
        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            default:
                System.out.println("Nombre de mes inválido");
                break;
        }
        
        if (cantidadDias > 0) {
            System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
        }
    }
}