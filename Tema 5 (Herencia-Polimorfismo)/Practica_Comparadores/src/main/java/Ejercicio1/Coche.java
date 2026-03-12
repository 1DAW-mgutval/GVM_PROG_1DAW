package Ejercicio1;

public class Coche extends Vehiculo {
    protected String matricula;

    public Coche() {
        this.matricula = null;
    }

    public boolean matricular(String matricula) {
        boolean res = false;
        if (this.matricula != null) {
            this.matricula = matricula;
            res = true;
        }
        return res;
    }

//    @Override
//    public int compareTo(Object o) {
//        int res = 0;
//        if (o instanceof Coche otro) {
//            if (this.matricula == null && otro.matricula != null) {
//                res = 1;
//            } else if (otro.matricula == null && this.matricula != null) {
//
//            }
//        }
//    }
}
