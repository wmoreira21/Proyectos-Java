package cl.prueba.information.entity;

import javax.xml.bind.annotation.XmlAttribute;

public class Url {
	
	private String description;
	
	public Url() {
		super();
	}

	public Url(String description) {
		super();
		this.description = description;
	}

	@XmlAttribute(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
