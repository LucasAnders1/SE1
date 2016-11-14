package se1app.applicationcore.util;

public class AnwendungsException extends Exception{

	private static final long serialVersionUID = 1L;

	public AnwendungsException() {
		super();
	}

	public AnwendungsException(String msg) {
		super(msg);
	}
}
