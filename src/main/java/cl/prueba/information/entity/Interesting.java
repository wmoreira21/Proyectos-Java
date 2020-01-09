package cl.prueba.information.entity;

import javax.xml.bind.annotation.XmlAttribute;

public class Interesting {
	
	private String url;
	private String description;
	
	public Interesting() {
		super();
	}

	public Interesting(String url) {
		super();
		this.url = url;

	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@XmlAttribute(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
