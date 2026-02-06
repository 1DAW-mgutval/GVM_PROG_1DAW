package Ej1_2_3;

public class Hora {
    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        this.setHora(hora);
        this.setMinutos(minuto);
    }

    public void inc() {
        if (!setMinutos(this.minuto+1)) {
            if (!setHora(this.hora+1)) {
                this.hora = 0;
            } else {
                setHora(this.hora+1);
            }
            this.minuto = 0;
        } else {
            setMinutos(this.minuto+1);
        }
    }

    public boolean setMinutos(int valor) {
        boolean exitoso = false;
        if (valor > -1 && valor < 60) {
            this.minuto = valor;
            exitoso = true;
        }
        return exitoso;
    }

    public boolean setHora (int valor) {
        boolean exitoso = false;
        if (valor > -1 && valor < 24) {
            this.hora = valor;
            exitoso = true;
        }
        return exitoso;
    }

    @Override
    public String toString() {
        return this.hora+":"+this.minuto;
    }
}
