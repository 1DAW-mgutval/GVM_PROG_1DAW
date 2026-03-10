package Minecraft;

public abstract class Materiales {
    protected String nombre;
    protected int masa;
    protected int quemado;
    protected int diluido;
    protected boolean movible;


    protected boolean tieneMasa() {
        boolean tiene = false;
        if (masa > 0) tiene = true;
        return tiene;
    }

    public void setMasa(int masa) {
        if (masa >= 0 && masa < 1001) this.masa = masa;
    }

    public void setQuemado(int quemado) {
        if (quemado >= 0 && quemado < 100) this.quemado = quemado;
    }

    public void setDiluido(int diluido) {
        if (diluido >= 0 && diluido < 100) this.diluido = diluido;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nombre='" + nombre +
                ", masa=" + masa +
                ", quemado=" + quemado +
                ", diluido=" + diluido +
                ", movible=" + movible +
                '}';
    }
}
