package Ej1_2_3;

public class HoraExacta extends Hora{
    private int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.setSegundos(segundos);
    }

    public boolean setSegundos(int valor) {
        boolean exitoso = false;
        if (valor > -1 && valor < 60) {
            this.segundos = valor;
            exitoso = true;
        }
        return exitoso;
    }

    @Override
    public void inc() {
        if (!setSegundos(this.segundos+1)) {
            this.segundos = 0;
            super.inc();
        } else {
            setSegundos(this.segundos+1);
        }
    }

    public boolean equals(HoraExacta hora2) {
        return hora2 != null && this.segundos == hora2.segundos && this.minuto == hora2.minuto && this.hora == hora2.minuto;
    }
}
