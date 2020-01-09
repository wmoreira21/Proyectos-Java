package cl.prueba.information.exception;

public class InformationException extends Exception {

	public InformationException(String message) {
        super(message);
    }
	
	public InformationException(String message, Throwable cause) {
        super(message, cause);
    }
}
