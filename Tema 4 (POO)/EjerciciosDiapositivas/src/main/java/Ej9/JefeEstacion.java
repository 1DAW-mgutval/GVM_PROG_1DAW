package Ej9;

import java.time.LocalDate;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private LocalDate fechaNombramiento;

    public JefeEstacion (String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
}
