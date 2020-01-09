package cl.prueba.information.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Data {

	private List<Forecast> forecast;
	
	public Data(){
		super();
	}

	public Data(List<Forecast> forecast) {
		super();
		this.forecast = forecast;
	}

	@XmlElement
	public List<Forecast> getForecast() {
		return forecast;
	}

	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}
	
	
}
