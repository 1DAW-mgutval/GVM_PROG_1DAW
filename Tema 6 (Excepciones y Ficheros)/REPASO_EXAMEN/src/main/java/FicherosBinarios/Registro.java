package FicherosBinarios;

import java.io.Serializable;
import java.time.LocalDateTime;
//--------------------------------------------------------------------- implementa SERIALIZABLE ------------------------------------------------------------
public class Registro implements Serializable {
    private int temp;
    private LocalDateTime hora;

    public Registro(int temp) {
        this.temp = temp;
        this.hora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Fecha y Hora: "+hora+"\nTemperatura: "+temp+"ºC";
    }
}
