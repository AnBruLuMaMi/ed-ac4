package ac4.ex01.b.interfaces;

import ac4.ex01.a.exceptions.LimiteVioladoException;
import ac4.ex01.a.exceptions.NodoInvalidoException;
import ac4.ex01.a.interfaces.INodo;
import ac4.ex01.b.exceptions.ArvoreVaziaException;

import java.util.Iterator;

public interface IArvore<T> extends Iterable<T> {
    Iterable<INodo<T>> positions();
    T replace(INodo<T> nodo, T elemento) throws NodoInvalidoException;
    INodo<T> root() throws ArvoreVaziaException;
    INodo<T> parent(INodo<T> nodo) throws NodoInvalidoException, LimiteVioladoException;
    Iterable<INodo<T>> children(INodo<T> nodo) throws NodoInvalidoException;
    boolean isInternal(INodo<T> nodo) throws NodoInvalidoException;
    boolean isExternal(INodo<T> nodo) throws NodoInvalidoException;
    boolean isRoot(INodo<T> nodo) throws NodoInvalidoException;
    Iterator<T> iterator();
    int size();
    boolean isEmpty();
}
