package ac4.ex01.a.interfaces;

import ac4.ex01.a.exceptions.EmptyPriorityQueueException;
import ac4.ex01.a.exceptions.InvalidKeyException;

public interface IFilaPrioridade<K,V> {
    IEntry<K,V> min() throws EmptyPriorityQueueException;
    IEntry<K,V> insert(K chave, V valor) throws InvalidKeyException;
    IEntry<K,V> removeMin( ) throws EmptyPriorityQueueException;
    int size();
    boolean isEmpty( );
}
