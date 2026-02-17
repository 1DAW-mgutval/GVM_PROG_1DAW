package Carnaval;

public abstract class Agrupacion {
    static int agrupaciones_totales = 0;

    protected String nombre;
    protected String autor;
    protected String autor_musica;
    protected String autor_letras;
    protected String tipo_disfraz;

    public Agrupacion (String nombre, String autor, String autor_musica, String autor_letras, String tipo_disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letras = autor_letras;
        this.tipo_disfraz = tipo_disfraz;

        agrupaciones_totales++;
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de el/la "+this.tipoAgrupacion()+" con nombre "+this.nombre);
    }

    public void hacer_tipo() {
        System.out.println("El/La "+this.tipoAgrupacion()+" "+this.nombre+" va de "+this.tipo_disfraz);
    }

    abstract String tipoAgrupacion();

    public static int getAgrupaciones_totales() {
        return agrupaciones_totales;
    }
}
