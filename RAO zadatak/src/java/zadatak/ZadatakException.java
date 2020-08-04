package zadatak;

public class ZadatakException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final String message;

	public ZadatakException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
