package cl.prueba.information.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityMock<T> extends ResponseEntity<T> {
	
	private T body;

	public ResponseEntityMock(HttpStatus status, String body) {
		super(status);
		this.body = (T) body;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
	
}
