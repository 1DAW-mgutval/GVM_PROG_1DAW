package Ej7;

public class Emisora {
    private double frecuencia;

    public Emisora (double frecuencia) {
        if (frecuencia > 108 || frecuencia<80) {
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = 80;
        }
    }

    public Emisora () {
        this(80);
    }

    public void subirFrecuencia(double subida) {
        if ((subida+this.frecuencia) > 180) {
            this.frecuencia = ((subida+this.frecuencia) - 180) + 80;
        } else{
            this.frecuencia += subida;
        }
    }

    public void bajarFrecuencia(double bajada) {
        if ((this.frecuencia-bajada) < 80) {
            this.frecuencia = 180-(80-(this.frecuencia-bajada));
        } else{
            this.frecuencia -= bajada;
        }
    }

    public double getFrecuencia () {
        return this.frecuencia;
    }

}
