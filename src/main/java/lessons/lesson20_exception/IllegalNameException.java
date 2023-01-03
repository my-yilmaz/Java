package lessons.lesson20_exception;

public class IllegalNameException extends RuntimeException {
    public IllegalNameException(String message) {
        super(message);
    }
}
