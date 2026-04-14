public class Pruebas {
    public static void main(String[] args) {
        Matricula matricula = new Matricula();

        for (int i = 0; i < 5 ; i++) {
            matricula.matricularAlumno("Joseda");
            matricula.matricularAlumno("Jorge");
        }
        matricula.matricularAlumno("Hugo");
        System.out.println(matricula.contarMatriculasAgotadas());
        System.out.println(matricula.obtenerPosiblesAlumnos());
    }
}
