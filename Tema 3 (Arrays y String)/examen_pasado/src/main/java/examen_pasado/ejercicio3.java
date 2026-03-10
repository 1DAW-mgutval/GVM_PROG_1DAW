package examen_pasado;

public class ejercicio3 {
    public static void main(String[] args) {
        String ejemplo = "Hola que tal estás joseda?";
        char resultado[][] = dividirFrase(ejemplo);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j]+" |");
            }
            System.out.println("");
        }
    }

    public static char[][] dividirFrase (String frase) {
        int numFilas;
        int caracteresSinEspacio = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (!Character.isWhitespace(frase.charAt(i))) {
                caracteresSinEspacio++;
            }
        }
        if (caracteresSinEspacio % 10 == 0 || caracteresSinEspacio % 10 == 5) {
            numFilas = caracteresSinEspacio / 5;
        } else {
            numFilas = caracteresSinEspacio / 5 + 1;
        }
        char resultado[][] = new char[numFilas][5];
        int indiceFrase = 0;

        for (int i = 0; i < resultado.length && indiceFrase < frase.length(); i++) {
            for (int j = 0; j < resultado[i].length && indiceFrase < frase.length(); j++) {
                while (Character.isWhitespace(frase.charAt(indiceFrase))) {
                    indiceFrase++;
                }
                if (!Character.isWhitespace(frase.charAt(indiceFrase))) {
                    resultado[i][j] = frase.charAt(indiceFrase);
                }
                indiceFrase++;
            }
        }
        return resultado;

    }
}
