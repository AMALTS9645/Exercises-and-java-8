package setcollectionexception;

public class CustomerAlreadyExistsException extends RuntimeException{
	public CustomerAlreadyExistsException(String message) {
		super(message);
	}
}
