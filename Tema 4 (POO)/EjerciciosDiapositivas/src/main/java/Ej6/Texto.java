package Ej6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
//    Longitud máxima de "cadena" es 25.
    private String cadena;
    private LocalDate fechaCreacion;
    private LocalDateTime fechaHora_modificacion;

//    Si se excede la longitud máxima permitida, la cadena estará vacía.
    public Texto (String cadena) {
        if (cadena.length() < 26) {
            this.cadena = cadena;
        }
        this.fechaCreacion = LocalDate.now();
        this.fechaHora_modificacion = LocalDateTime.now();
    }

//    Si el booleano que se le pasa es true, se añadirá al principio, si es false al final.
    public void anadirCaracterPrincipio (char caracter, boolean principio) {
        if (this.cadena.length() < 25) {
            if (principio) {
                this.cadena = caracter+this.cadena;
            } else {
                this.cadena += caracter;
            }
            this.fechaHora_modificacion = LocalDateTime.now();
        } else {
            System.out.println("ERROR. La cadena ha llegado a su longitud máxima.");
        }
    }

    public void anadirCadenaPrincipio (String cadena, boolean principio) {
        if (this.cadena.length()+cadena.length() < 26) {
            if (principio) {
                this.cadena = cadena+this.cadena;
            } else {
                this.cadena += cadena;
            }
            this.fechaHora_modificacion = LocalDateTime.now();
        } else {
            System.out.println("ERROR. La cadena es demasiado larga.");
        }
    }

    private boolean esVocal (char caracter) {
        boolean vocal = false;
        switch (Character.toLowerCase(caracter)) {
            case 'a', 'e', 'i', 'o', 'u' -> vocal = true;
        }
        return vocal;
    }

    public int numVocalesMayusculas() {
        int vocalesMayusculas = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            if (Character.isUpperCase(this.cadena.charAt(i)) && esVocal(this.cadena.charAt(i))) {
                vocalesMayusculas++;
            }
        }
        return vocalesMayusculas;
    }

    public int numVocalesMinusculas() {
        int vocalesMinusculas = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            if (Character.isLowerCase(this.cadena.charAt(i)) && esVocal(this.cadena.charAt(i))) {
                vocalesMinusculas++;
            }
        }
        return vocalesMinusculas;
    }

    public void getInfo() {
        System.out.println("Cadena guardada: "+this.cadena);
        System.out.println("Fecha de creación: "+this.fechaCreacion);
        System.out.println("Fecha de modificación: "+this.fechaHora_modificacion);
    }

}
