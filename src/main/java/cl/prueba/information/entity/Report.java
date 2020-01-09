package cl.prueba.information.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Report{
	
	private Location location;
	
	public Report() {
		super();
	} 
	
	public Report(Location location) {
		this.location = location;
	}

	@XmlElement
	public Location getLocation() {
		return location;
	}
		
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
