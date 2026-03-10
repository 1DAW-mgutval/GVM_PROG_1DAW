package Ej9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Maquinista trabajador1 = new Maquinista("111111-J","Mario", 12,"Mayor");
        Mecanico trabajador2 = new Mecanico("Joseda", "12786764",Especialidad.ELECTRICIDAD);
        JefeEstacion trabajador3 = new JefeEstacion("Jorge","222222-H", LocalDate.of(2007,1,8));
    }
}
