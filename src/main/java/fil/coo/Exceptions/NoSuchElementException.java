package fil.coo.Exceptions;

@SuppressWarnings("serial")

public class NoSuchElementException extends RuntimeException{
	public NoSuchElementException(String error) {
		super(error);
	}
}
