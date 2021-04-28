package ac4.ex01.a.exceptions;

public class EmptyPriorityQueueException extends RuntimeException {
    public EmptyPriorityQueueException(String mensagem) {
        super(mensagem);
    }
}
