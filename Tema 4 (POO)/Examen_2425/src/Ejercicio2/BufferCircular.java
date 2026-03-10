package Ejercicio2;

public class BufferCircular {
    private Integer[] listaEnteros;
    private int ultimoCreado;
    private int primeroCreado;

    public BufferCircular () {
        this.listaEnteros = new Integer[10];
        this.ultimoCreado = 0;
        this.primeroCreado = 0;
    }

    public boolean insertar(Integer num) {
        boolean exitoso = false;
        for (int i = this.ultimoCreado; !exitoso && i < this.listaEnteros.length; i++) {
            if (this.listaEnteros[i] == null ) {
                this.listaEnteros[i] = num;
                exitoso = true;
            }
        }
        if (exitoso) {
            this.ultimoCreado++;
            if (this.ultimoCreado == 10) {
                this.ultimoCreado = 0;
            }
        } else {
            for (int i = 0; !exitoso && i < this.ultimoCreado; i++) {
                if (this.listaEnteros[i] == null ) {
                    this.listaEnteros[i] = num;
                    exitoso = true;
                }
            }
        }
        return exitoso;
    }

    public Integer leer() {
        Integer borrado = null;
        if (this.listaEnteros[this.primeroCreado] != null) {
            borrado = this.listaEnteros[this.primeroCreado];
            this.listaEnteros[this.primeroCreado] = null;
            this.primeroCreado++;
        }
        if (this.primeroCreado == 10) {
            this.primeroCreado = 0;
        }
        return borrado;
    }

    public void mostrarBuffer() {
        for (Integer listaEntero : this.listaEnteros) {
            if (listaEntero != null) {
                System.out.print("|" + listaEntero);
            } else {
                System.out.print("|*");
            }
        }
        System.out.println();
    }

    public int estadoBuffer() {
        int estado = 0;
        for (Integer enteroActual : this.listaEnteros) {
            if (enteroActual != null) {
                estado += 10;
            }
        }
        return estado;
    }
}
