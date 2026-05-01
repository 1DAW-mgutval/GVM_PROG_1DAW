package Ej1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author losad
 */
public class pruebaCursos {
    
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 65, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 100, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 45, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 75, 10, 400));

//        Ej1 - A
        Function<Curso, String> informeAlumnos = x -> "El curso "+x.getTitulo()+" tiene "+x.getAlumnos()+" alumnos matriculados";

//        Ej1 - B
        Function<Curso, String> informeHoras = x -> "El curso "+x.getTitulo()+" tiene una duración de "+x.getDuracion()+" horas";

//        Ej1 - C
        System.out.println("---------------- Ejercicio1 C -------------------");
        cursos.stream()
                .filter(x -> x.getTitulo().contains("Python"))
                .forEach(x -> System.out.println(informeAlumnos.apply(x)));

        cursos.stream()
                .filter(x -> x.getTitulo().contains("Android"))
                .forEach(x -> System.out.println(informeHoras.apply(x)));

//        Ej1 - D
        System.out.println("\n---------------- Ejercicio1 D -------------------");
        cursos.stream()
                .filter(x -> x.getVideos() > 50)
                .forEach(System.out::println);

//        Ej1 - E
        System.out.println("\n---------------- Ejercicio1 E -------------------");
        cursos.stream()
                .filter(x -> x.getAlumnos() < 500)
                .forEach(curso -> System.out.println("Duración: "+curso.getDuracion()));

//        Ej1 - F
        System.out.println("\n---------------- Ejercicio1 F -------------------");
        cursos.stream()
                .sorted()
                .forEach(System.out::println);

//        Ej1 - G
        System.out.println("\n---------------- Ejercicio1 F -------------------");
        cursos.stream()
                .sorted((Curso c1, Curso c2) -> c1.getDuracion()-c2.getDuracion())
                .forEach(System.out::println);
    }
    

    
}
