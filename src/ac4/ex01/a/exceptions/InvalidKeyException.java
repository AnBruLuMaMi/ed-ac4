package ac4.ex01.a.exceptions;

public class InvalidKeyException extends RuntimeException {
    public InvalidKeyException(String mensagem) {
        super(mensagem);
    }
}
