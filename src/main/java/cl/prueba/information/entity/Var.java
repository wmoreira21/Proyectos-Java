package cl.prueba.information.entity;

import javax.xml.bind.annotation.XmlElement;

public class Var {

	private String name;
	private String icon;
	private Data data;
	
	public Var(){
		super();
	}
	
	public Var(String name, String icon, Data data) {
		super();
		this.name = name;
		this.icon = icon;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@XmlElement
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
}
