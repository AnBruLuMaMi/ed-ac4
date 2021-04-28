package ac4.ex01.b.interfaces;

import ac4.ex01.a.interfaces.INodo;

public interface IArvoreBinariaCompleta<T> extends IArvoreBinaria<T> {
    INodo<T> add(T elem);
    T remove();
}
