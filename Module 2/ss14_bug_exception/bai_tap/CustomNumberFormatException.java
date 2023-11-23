package ss14_bug_exception.bai_tap;

public class CustomNumberFormatException extends NumberFormatException {
    public CustomNumberFormatException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
