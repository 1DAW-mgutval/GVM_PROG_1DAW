package matematicas;

public class FuncionesVarias {
    public static void main(String[] args) {
        long numero_largo = 123456000;
        int numero_corto = 54321;

        System.out.println(voltea(numero_largo));
        System.out.println(voltea(numero_corto));
        System.out.println(esCapicua(numero_corto));
        System.out.println(esCapicua(numero_largo));
        System.out.println(esPrimo(numero_corto));
        System.out.println(esPrimo(numero_largo));
        System.out.println(siguientePrimo(numero_corto));
        System.out.println(primoCercano(numero_corto, false));
        System.out.println(primoCercano(numero_corto, true));
        System.out.println(potencia(3, 2));
        System.out.println(potencia(3, -3));
        System.out.println(digitos(numero_corto));
        System.out.println(digitos(numero_corto));
        System.out.println(digitoN(numero_corto, 3));
        System.out.println(digitoN(numero_corto, 20));
        System.out.println(posicionDeDigito(numero_corto, 3));
        System.out.println(posicionDeDigito(numero_largo, 2));
        System.out.println(quitarPorDelante(numero_largo));
        System.out.println(quitarPorDetras(numero_largo));
        System.out.println(quitarPorDelante(numero_largo, 3));
        System.out.println(quitarPorDetras(numero_largo, 2));
        System.out.println(pegaPorDetras(numero_largo, 2));
        System.out.println(pegaPorDelante(numero_largo, 4));
        System.out.println(trozoDeNumero(numero_largo, 2, 6));
        System.out.println(juntaNumeros(numero_largo, numero_largo));
    }

    // COMPROBACIÓN DE PROPIEDADES MATEMÁTICAS

    // Invierte el orden de los dígitos de un número.
    public static long voltea (long x) {
        long reves = 0, cifra;
        for (long i = x; i > 0; i/=10) {
            cifra = i % 10;
            reves = reves * 10 + cifra;
        }
        return reves;
    }

    public static int voltea (int x) {
        return (int)voltea((long)x);
    }

    // Números capicúa
    public static boolean esCapicua(long x) {
        boolean resultado = false;
        if (voltea(x) == x) {
            resultado = true;
        }
        return resultado;
    }

    public static boolean esCapicua(int x) {
        return esCapicua((long)x);
    }

    // Números primos
    public static boolean esPrimo (long x) {
        boolean resultado = true;
        long contador = 2;
        while (contador < x && resultado) {
            if (x % contador == 0) {
                resultado = false;
            }
            contador++;
        }
        return resultado;
    }

    public static boolean esPrimo (int x) {
        return esPrimo((long)x);
    }

    // Número primo más pequeño mayor que el valor dado.
    public static int siguientePrimo (int x) {
        int resultado = x+1;
        while (!esPrimo(resultado)) {
            resultado++;
        }
        return resultado;
    }

    // Número primo más grande menor que el valor dado x si anterior es verdadero. El primo siguiente a x si anterior es falso.
    public static int primoCercano (int x, boolean anterior) {
        if (anterior) {
            return siguientePrimo(x);
        } else {
            int resultado = x-1;
            while (!esPrimo(resultado)) {
                resultado--;
            }
            return resultado;
        }
    }

    // OPERACIONES MATEMÁTICAS BÁSICAS

    // Potencia de un número.
    public static double potencia (int base, int exponente) {
        double resultado = 1;
        if (exponente > 0) {
            while (exponente > 0) {
                resultado *= base;
                exponente--;
            }
        } else {
            while (exponente < 0) {
                resultado *= base;
                exponente++;
            }
            resultado = 1/resultado;
        }
        return resultado;
    }

    // MANIPULACIÓN DE DÍGITOS

    // Cuenta cuántos dígitos tiene un número
    public static int digitos (long x) {
        int resultado = 0;
        if (x == 0) {
            resultado = 1;
        }
        while (x > 0) {
            resultado++;
            x /= 10;
        }
        return resultado;
    }

    public static int digitos (int x) {
        return (int)digitos((long)x);
    }

    // Devuelve el dígito que ocupa la posición n (de izquierda a derecha).
    public static long digitoN (long x, long n) {
        long resultado = 0, contador = 0, cifra, num = voltea(x);
        if (digitos(x) < 1 ) {                                                              
            
        }
        while (num > 10) {
            cifra = x % 10;
            if (n == contador+1) {
                resultado = cifra;
            }
            num /= 10;
            contador++;
        }
        return resultado;
    }

    public static int digitoN (int x, int n) {
        return (int)digitoN((long)x, (long)n);
    }

    // Devuelve la posición de la primera aparición del dígito d o -1 si no se encuentra.
    public static int posicionDeDigito (long x, int d) {
        long cifra;
        int resultado = 0;
        while (x > 0) {
            cifra = x % 10;
            resultado++;
            if (d == cifra) {
                return resultado;
            }
            x /= 10;
        }
        return -1;
    }

    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long)x, d);
    }

    // MODIFICACIÓN DE NÚMEROS

    // Elimina 1 dígito del número por detrás.

    public static long quitarPorDetras (long x) {
        return x/10;
    }

    // // Elimina 1 dígito del número por delante.
    public static long quitarPorDelante (long x) {
        long num = voltea(x);
        num = num/10;
        num = voltea(num);
        while (digitos(x)-1 > digitos(num)) {
            num *= 10;
        }
        return num;
    }

    // Elimina n dígitos del número por detrás.
    public static long quitarPorDetras (long x, int n) {
        long resultado = -1;
        if (digitos(n) > digitos(x)) {
            return resultado;
        }
        long num = x;
        while (n > 0) {
            num = quitarPorDetras(num);
            if (n == 1) {
                resultado = num;
            }
            n--;
        }
        return resultado;
    }

    // Elimina n dígitos del número por delante.
    public static long quitarPorDelante (long x, int n) {
        long num = voltea(x);
        num = quitarPorDetras(num, n);
        num = voltea(num);
        while (digitos(x)-n > digitos(num)) {
            num *= 10;
        }
        return num;
    }

    // Añade un dígito al final del número.
    public static long pegaPorDetras (long x, int d) {
        if (digitos(d) > 1) {
            return -1;
        }
        return x*10 + d;
    }

    //  Añade un dígito al principio del número.
    public static long pegaPorDelante (long x, int d) {
        long num = voltea(x);
        num = pegaPorDetras(num, d);
        num = voltea(num);
        while (digitos(x)+1 > digitos(num)) {
            num *= 10;
        }
        return num;
    }

    // Extrae una porción de un número entre dos posiciones dadas.
    public static long trozoDeNumero (long x, int inicio, int fin) {
        int digitos = digitos(x);
        long recorte_inicio = quitarPorDetras(x, digitos-inicio);
        long recorte_fin = quitarPorDelante(x, fin);
        return recorte_inicio * (long)potencia(10, digitos(recorte_fin)) + recorte_fin;
    }

    // Une dos números formando uno solo.
    public static long juntaNumeros(long x, long y) {
        int digitos = digitos(y);
        return x * (long)potencia(10, digitos) + y;
    }
}
