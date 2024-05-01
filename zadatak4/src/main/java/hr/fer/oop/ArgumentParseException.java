package hr.fer.oop;

public class ArgumentParseException extends Exception {
	public ArgumentParseException(String message) {
		super(message);
	}
	public ArgumentParseException(Throwable e) {
		super(e);
	}
}
