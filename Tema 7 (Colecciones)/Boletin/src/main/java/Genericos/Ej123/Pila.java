package Genericos.Ej123;

public interface Pila<T> {
    void apilar(T nuevo);
    T desapilar();
    int size();
}
