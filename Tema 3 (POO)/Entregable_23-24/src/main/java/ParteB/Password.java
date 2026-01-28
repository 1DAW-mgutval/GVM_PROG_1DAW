package ParteB;

public class Password {
    private int longitud;
    private String contrasena;

    public Password (String contrasena) {
        this.longitud = 8;
        if (contrasena.length() > this.longitud) {
            this.contrasena = "";
        } else {
            this.contrasena = contrasena;
        }
    }

    public Password () {
        this("");
    }

    public boolean esFuerte() {
        boolean fuerte = false;
        int contadorMayus = 0, contadorMinus = 0, contadorNum = 0;
        for (int i = 0; i < this.contrasena.length(); i++) {
            if (Character.isUpperCase(this.contrasena.charAt(i))) {
                contadorMayus++;
            } else if (Character.isLowerCase(this.contrasena.charAt(i))) {
                contadorMinus++;
            } else if (Character.isDigit(this.contrasena.charAt(i))) {
                contadorNum++;
            }
        }
        if (contadorMayus > 2 && contadorMinus > 1 && contadorNum > 5) {
            fuerte = true;
        }
        return fuerte;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
