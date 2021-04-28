package ac4.ex01.b.interfaces;

import ac4.ex01.a.exceptions.LimiteVioladoException;
import ac4.ex01.a.exceptions.NodoInvalidoException;
import ac4.ex01.a.interfaces.INodo;

public interface IArvoreBinaria<T> extends IArvore<T> {
    INodo<T> left(INodo<T> nodo) throws NodoInvalidoException, LimiteVioladoException;
    INodo<T> right(INodo<T> nodo) throws NodoInvalidoException, LimiteVioladoException;
    boolean hasLeft(INodo<T> nodo) throws NodoInvalidoException;
    boolean hasRight(INodo<T> nodo) throws NodoInvalidoException;
}
