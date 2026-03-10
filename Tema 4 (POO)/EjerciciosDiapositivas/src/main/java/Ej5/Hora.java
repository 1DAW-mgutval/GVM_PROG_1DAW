package Ej5;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

//    Los métodos set devuelven -1 en caso de error
    public void setHora(int hora) {
        if (hora > 24 || hora < 0) {
            this.hora = -1;
        } else {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 60 || minuto < 0) {
            this.minuto = -1;
        } else {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > 60 || segundo < 0) {
            this.segundo = -1;
        } else {
            this.segundo = segundo;
        }
    }

    public void incrementarHora(int segundos) {
        while (segundos > 0) {
            if (this.segundo == 59) {
                this.segundo = 0;
                if (this.minuto == 59) {
                    this.minuto = 0;
                    if (this.hora == 23) {
                        this.hora = 0;
                    } else {
                        this.hora++;
                    }
                } else {
                    this.minuto++;
                }
            } else{
                this.segundo++;
            }
            segundos--;
        }
    }
}
