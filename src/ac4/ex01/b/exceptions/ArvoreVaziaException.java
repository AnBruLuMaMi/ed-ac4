package ac4.ex01.b.exceptions;

public class ArvoreVaziaException extends RuntimeException {
    public ArvoreVaziaException(String mensagem) {
        super(mensagem);
    }
}
