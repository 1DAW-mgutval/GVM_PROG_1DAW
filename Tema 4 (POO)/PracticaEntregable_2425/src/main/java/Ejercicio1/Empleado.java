package Ejercicio1;

import java.time.LocalDate;

public class Empleado {
    private static int idEmpleados = 0;

    private String nombreCompleto;
    private int id;
    private String telefono;
    private LocalDate fechaContratacion;
    private tipoEmpleado tipo;

    public Empleado (String nombreCompleto, String telefono, LocalDate fechaContratacion, tipoEmpleado tipo) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.id = ++idEmpleados;
        this.fechaContratacion = fechaContratacion;
        this.tipo = tipo;
    }

    public Empleado (String nombreCompleto, String telefono, LocalDate fechaContratacion) {
        this(nombreCompleto, telefono, fechaContratacion, tipoEmpleado.CAMARERO);
    }

    public Empleado (String nombreCompleto, String telefono) {
        this(nombreCompleto, telefono, LocalDate.now(), tipoEmpleado.CAMARERO);
    }

    public void mostrarDatos () {
        System.out.println("-------------------");
        System.out.println("Nombre: "+this.nombreCompleto);
        System.out.println("ID: "+this.id);
        System.out.println("Telefono: "+this.telefono);
        System.out.println("Fecha de contratación: "+this.fechaContratacion);
        System.out.println("Tipo de empleado: "+this.tipo);
        System.out.println("-------------------");
    }

    public int getId() {
        return id;
    }

    public static int empleadosTotal() {
        return idEmpleados;
    }
}
