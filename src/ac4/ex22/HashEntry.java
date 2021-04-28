package ac4.ex22;

import ac4.ex01.a.interfaces.IEntry;

public class HashEntry<K,V> implements IEntry<K,V> {
    private K chave;
    private V valor;

    public HashEntry(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public K getKey() {
        return this.chave;
    }

    @Override
    public V getValue() {
        return this.valor;
    }

    public V setValue(V val) {
        V valorAnterior = valor;
        valor = val;

        return valorAnterior;
    }

    @SuppressWarnings("unchecked")
    public boolean equals(Object o) {
        HashEntry<K, V> ent;

        try {
            ent = (HashEntry<K, V>) o;
        } catch (ClassCastException ex) { return false; }

        return (ent.getKey() == chave) && (ent.getValue() == valor);
    }

    public String toString() {
        return "(" + chave + "," + valor + ")";
    }
}
