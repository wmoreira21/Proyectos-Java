package cl.prueba.information.exception;

import cl.prueba.information.controller.ErrorInfo;

public class InformationException extends Exception {

	private ErrorInfo errorInfo;
	
	public InformationException(ErrorInfo errorInfo){
		this.errorInfo = errorInfo;
	}
	
	public InformationException(String message) {
        super(message);
    }
	
	public InformationException(String message, Throwable cause) {
        super(message, cause);
    }

	public ErrorInfo getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	
}
