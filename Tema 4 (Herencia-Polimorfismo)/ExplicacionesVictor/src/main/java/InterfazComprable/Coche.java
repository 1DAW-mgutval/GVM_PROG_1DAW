package InterfazComprable;

public class Coche implements Comparable{
    String matricula;
    int anioMatriculacion;

    public Coche(String matricula, int anioMatriculacion) {
        this.matricula = matricula;
        this.anioMatriculacion = anioMatriculacion;
    }

    @Override
    public int compareTo(Object o) {
        int res;
        Coche other = (Coche) o;
        if (this.anioMatriculacion > other.anioMatriculacion) {
            res = 1;
        } else if (this.anioMatriculacion < other.anioMatriculacion) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }
}

