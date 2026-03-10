package Ejercicio1;

public class Plato {
    private static int platosTotales = 0;

    private String nombre;
    private double precio;
    private categoriaPlato categoria;
    private int unidades;

    public Plato (String nombre, double precio, categoriaPlato categoria, int unidades) {
        this.nombre = nombre;
//        En caso de que el precio no sea válido, el valor que indique error será -1.
        if (precio < 0.01 || precio > 999.99) {
            precio = -1;
        } else  {
            this.precio = precio;
        }
        this.categoria = categoria;
        this.unidades = unidades;
        platosTotales++;
    }

    public Plato (String nombre, double precio, int unidades) {
        this(nombre, precio, categoriaPlato.TAPA, unidades);
    }

    public void mostrarDatos () {
        System.out.println("-------------");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio+"€");
        System.out.println("Categoría: "+this.categoria);
        System.out.println("Unidades disponibles: "+this.unidades);
        System.out.println("-------------");
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }
}
