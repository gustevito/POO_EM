package Exemplo2;

@FunctionalInterface
public interface Operacao<T> {
    Double calcula(T obj);
}
