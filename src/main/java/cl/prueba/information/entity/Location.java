package cl.prueba.information.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Location {

	private String city;
	private List<Var> var;
	private Interesting interesting;
	
	public Location() {
		super();
	}
	
	
	public Location(String city, List<Var> var, Interesting interesting) {
		super();
		this.city = city;
		this.var = var;
		this.interesting = interesting;
	}

	@XmlAttribute
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement
	public List<Var> getVar() {
		return var;
	}


	public void setVar(List<Var> var) {
		this.var = var;
	}

	@XmlElement
	public Interesting getInteresting() {
		return interesting;
	}

	public void setInteresting(Interesting interesting) {
		this.interesting = interesting;
	}	
	
}
