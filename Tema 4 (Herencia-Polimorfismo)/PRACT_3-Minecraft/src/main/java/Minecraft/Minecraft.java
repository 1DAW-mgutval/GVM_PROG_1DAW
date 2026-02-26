package Minecraft;

public class Minecraft {
    private Materiales[] listaMateriales;

    public Minecraft() {
        this.listaMateriales = new Materiales[0];
    }

    public boolean aniadirMaterial(Materiales material) {
        boolean exitoso = false;
        if (this.listaMateriales.length < 10) {
            boolean existe = false;
            for (int i = 0; !existe && i < this.listaMateriales.length; i++) {
                if (this.listaMateriales[i].equals(material)) {
                    existe = true;
                } else if (this.listaMateriales[i] == null) {
                    this.listaMateriales[i] = material;
                    exitoso = true;
                    existe = true;
                }
            }
        }
        return exitoso;
    }

    public void borrarMaterialSinMasa () {
        int contadoresSinMasa=0;
        for (int i = 0; i < this.listaMateriales.length; i++) {
            if (this.listaMateriales[i].tieneMasa()) {
                this.listaMateriales = null;
                contadoresSinMasa++;
            }
        }
        Materiales[] listaNueva = new Materiales[listaMateriales.length-contadoresSinMasa];
        int contadorNuevaLista = 0;
        for (int i = 0; i < this.listaMateriales.length; i++) {
            if (this.listaMateriales[i] != null) {
                listaNueva[contadorNuevaLista] = this.listaMateriales[i];
                contadorNuevaLista++;
            }
        }
        this.listaMateriales = listaNueva;
    }

    public void mostrarEstado() {
        for (int i = 0; i < this.listaMateriales.length; i++) {
            System.out.println(this.listaMateriales[i].toString());
        }
    }
}
