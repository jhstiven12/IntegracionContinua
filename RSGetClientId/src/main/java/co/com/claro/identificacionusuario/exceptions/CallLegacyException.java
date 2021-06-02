package co.com.claro.identificacionusuario.exceptions;

public class CallLegacyException extends RuntimeException {

    public CallLegacyException(String message) {
        super(message);
    }

    public CallLegacyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CallLegacyException(Throwable cause) {
        super(cause);
    }
}
