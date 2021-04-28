package ac4.ex22.interfaces;

import ac4.ex01.a.exceptions.InvalidKeyException;
import ac4.ex01.a.interfaces.IEntry;

public interface IMapa<K,V> {
    V put(K chave, V valor) throws InvalidKeyException;
    V get(K chave) throws InvalidKeyException;
    V remove(K chave) throws InvalidKeyException;
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<IEntry<K,V>> entrySet();
    int size();
    boolean isEmpty();
}
