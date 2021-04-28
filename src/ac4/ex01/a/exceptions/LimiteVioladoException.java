package ac4.ex01.a.exceptions;

public class LimiteVioladoException extends RuntimeException {
    public LimiteVioladoException(String mensagem) {
        super(mensagem);
    }
}