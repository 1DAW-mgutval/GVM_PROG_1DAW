package EjemplosVictor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EjemplosStreams {

    public static void main(String[] args) {

        System.out.println("--- 1. EJEMPLOS DE PREDICATE ---");
        
        Predicate<Integer> esPar = num -> num % 2 == 0;
        Predicate<Integer> mayorQueDiez = num -> num > 10;

        // Método test()
        System.out.println("¿Es 4 par? " + esPar.test(4));

        // Métodos por defecto: and(), or(), negate()
        System.out.println("¿Es 12 par Y mayor que 10? " + esPar.and(mayorQueDiez).test(12)); // true
        System.out.println("¿Es 8 par Y mayor que 10? " + esPar.and(mayorQueDiez).test(8));  // false
        System.out.println("¿Es 8 par O mayor que 10? " + esPar.or(mayorQueDiez).test(8));   // true
        System.out.println("¿NO es par el número 5? " + esPar.negate().test(5));             // true


        System.out.println("\n--- 2. EJEMPLO DE FUNCTION ---");
        // Transforma un String en un Integer (su longitud)
        Function<String, Integer> obtenerLongitud = texto -> texto.length();
        System.out.println("La longitud de 'Java' es: " + obtenerLongitud.apply("Java"));


        System.out.println("\n--- 3. EJEMPLO DE CONSUMER ---");
        // Consume un String y lo imprime en mayúsculas
        Consumer<String> imprimirMayusculas = texto -> System.out.println(texto.toUpperCase());
        System.out.print("Consumiendo la palabra 'hola': ");
        imprimirMayusculas.accept("hola");


        System.out.println("\n--- 4 y 5. CREACIÓN, ENCADENAMIENTO Y MÉTODOS DE STREAMS ---");
        // Creación sencilla de un Stream a partir de una Colección
        List<String> lenguajes = Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Rust");
        System.out.println("Lista original: " + lenguajes);
        
        
        // Ejemplo completo encadenando operaciones intermedias y una terminal
        List<String> resultadoPipeline = lenguajes.stream() // CREACIÓN
                .filter(lang -> lang.length() > 3)          // INTERMEDIA: filtra (solo > 3 letras)
                .map(x -> x.toUpperCase())                   // INTERMEDIA: transforma (a mayúsculas)
                .sorted()                                   // INTERMEDIA: ordena alfabéticamente
                .collect(Collectors.toList());              // TERMINAL: empaqueta en una nueva Lista

        System.out.println("Resultado tras el pipeline (encadenamiento): " + resultadoPipeline);
        
        System.out.println("Lista original: " + lenguajes);
        
        // Ejemplo de otra operación terminal: reduce (para concatenar todos en un solo String)
        String concatenados = lenguajes.stream()
                .reduce((lang1, lang2) -> lang1 + " - " + lang2)
                .orElse("Lista vacía");
        System.out.println("Resultado usando reduce: " + concatenados);

        // Ejemplo de operación terminal forEach usando un Consumer
        System.out.println("Recorriendo con forEach:");
        lenguajes.stream()
                .filter(lang -> lang.startsWith("J")) // Filtramos los que empiezan por J
                .forEach(System.out::println); 
    }
}
