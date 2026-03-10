package boletin1;

public class ejercicio3 {
    public static void main(String[] args) {
        cilindro_area_volumen(2, 3, "volumen");
    }

    public static void cilindro_area_volumen(int r, int h, String operacion) {
        double resultado;
        if (operacion.equals("area")) {
            resultado = 2 * Math.PI * r * (h + r);
            System.out.println(resultado);
        } else if (operacion.equals("volumen")) {
            resultado = Math.PI * Math.pow(r, 2) * h;
            System.out.println(resultado);
        }
    }
}
