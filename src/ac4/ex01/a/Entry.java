package ac4.ex01.a;

import ac4.ex01.a.interfaces.IEntry;

public class Entry<K, V> implements IEntry<K, V> {
    private K chave;
    private V valor;

    public Entry(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getKey() { return chave; }
    public V getValue() { return valor; }
    public String toString() { return "(" + chave + "," + valor + ")"; }
}
