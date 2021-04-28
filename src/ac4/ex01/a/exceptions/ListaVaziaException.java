package ac4.ex01.a.exceptions;

public class ListaVaziaException extends RuntimeException {
    public ListaVaziaException(String mensagem) {
        super(mensagem);
    }
}
