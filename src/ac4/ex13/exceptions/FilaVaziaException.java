package ac4.ex13.exceptions;

public class FilaVaziaException extends RuntimeException {
    public FilaVaziaException(String mensagem) {
        super(mensagem);
    }
}
