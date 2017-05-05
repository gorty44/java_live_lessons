package exceptions;

@SuppressWarnings("serial")
public class MyException extends Exception {
	public MyException() {
		this("default message");
	}

	public MyException(String message) {
		super(message);
	}
}
