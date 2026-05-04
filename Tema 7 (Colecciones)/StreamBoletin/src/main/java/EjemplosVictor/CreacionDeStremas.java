/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosVictor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author losad
 */
public class CreacionDeStremas {
    
    // ******* 1. A partir de Colecciones (Collection)
    // Ejemplo con una Lista (List)
    List<String> listaNombres = Arrays.asList("Ana", "Luis", "Carlos");
    Stream<String> streamDesdeLista = listaNombres.stream();

    // Ejemplo con un Conjunto (Set)
    Set<Integer> conjuntoNumeros = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    Stream<Integer> streamDesdeSet = conjuntoNumeros.stream();
    
    // ******* 2. A partir de Arrays (Arrays.stream)
    String[] arrayNombres = {"Ana", "Luis", "Carlos"};
    Stream<String> streamDesdeArray = Arrays.stream(arrayNombres);
    Integer[] arrayNumeros = {1, 2, 3, 4, 5};
    // Genera un IntStream (un Stream especializado para primitivos int)
    Stream<Integer> streamPrimitivo = Arrays.stream(arrayNumeros);

    //******* 3. A partir de valores sueltos (Stream.of)
    //Creando un Stream directamente pasando los valores separados por comas
    Stream<String> streamDeValores = Stream.of("Java", "Spring", "Hibernate");
    Stream<Integer> streamDeNumeros = Stream.of(10, 20, 30, 40);
    
}
