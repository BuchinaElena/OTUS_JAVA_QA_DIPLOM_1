package exceptions;

public class ModeNotSupportedException extends RuntimeException {
    public ModeNotSupportedException(String mode) {
        super(String.format("Mode %s not supported", mode));
    }
}
