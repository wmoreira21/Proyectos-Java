package cl.prueba.information.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "report")
public class ErrorInfo {

    private String error;
    
    public ErrorInfo() {
        super();
    }

    public ErrorInfo(String error) {
        this.error = error;
    }

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}



}
