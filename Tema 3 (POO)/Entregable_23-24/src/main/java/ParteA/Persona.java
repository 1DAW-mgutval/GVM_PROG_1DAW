package ParteA;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    private final Sexo sexo;

    public Persona (String nombre, int edad, String dni, double peso, double altura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        if (sexo == null) {
            this.sexo = Sexo.HOMBRE;
        } else {
            this.sexo = sexo;
        }
    }

    public Persona (String nombre) {
        this(nombre, 0, null, 0, 0, null);
    }

    public Persona () {
        this("", 0, null, 0, 0, null);
    }

    public int calcularIMC(){
        int resultado;
        double imc = this.peso/Math.pow(this.altura,2);
        if (imc < 20) {
            resultado = -1;
        } else if (imc < 26) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }
}
