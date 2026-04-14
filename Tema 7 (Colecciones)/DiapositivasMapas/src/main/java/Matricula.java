import java.util.*;

public class Matricula {
    protected HashMap<String, Integer> alumnoConvocatoria;

    public Matricula() {
        alumnoConvocatoria = new HashMap<>();
    }

    public boolean matricularAlumno(String alumno) {
        boolean matriculado = false;
        if (!alumnoConvocatoria.containsKey(alumno)) {
            alumnoConvocatoria.put(alumno, 1);
            matriculado = true;
        } else if (alumnoConvocatoria.get(alumno) < 4) {
            alumnoConvocatoria.replace(alumno, (alumnoConvocatoria.get(alumno)+1));
            matriculado = true;
        }
        return matriculado;
    }

    public int contarMatriculasAgotadas() {
        Collection<Integer> agotados = new ArrayList<>(alumnoConvocatoria.values());
        Collection<Integer> numBorrar = new HashSet<>(Set.of(1,2,3));

        agotados.removeAll(numBorrar);
        return agotados.size();
    }

    public Set<String> obtenerPosiblesAlumnos() {
        Set<String> posibles = alumnoConvocatoria.keySet();
        Iterator<String> it = posibles.iterator();
        while (it.hasNext()) {
            if (alumnoConvocatoria.get(it.next()) == 4) {
                it.remove();
            }
        }
        return posibles;
    }

}
