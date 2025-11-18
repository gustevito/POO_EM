package Exemplo2;

@FunctionalInterface
public interface Condicao<T> {
    boolean verifica(T obj);
}
