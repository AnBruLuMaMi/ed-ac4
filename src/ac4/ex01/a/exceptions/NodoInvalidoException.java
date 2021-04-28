package ac4.ex01.a.exceptions;

public class NodoInvalidoException extends RuntimeException {
    public NodoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
