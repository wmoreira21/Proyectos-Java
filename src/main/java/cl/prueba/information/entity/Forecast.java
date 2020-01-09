package cl.prueba.information.entity;

import javax.xml.bind.annotation.XmlAttribute;

public class Forecast {

	private String value;
	private String dataSequence;
	private String id;
	private String idB;
	private String valueB;
	private String id2;
	private String value2;
	
	public Forecast() {
		super();
	}

	public Forecast(String value, String dataSequence, String id, String idB, String valueB, String id2,
			String value2) {
		super();
		this.value = value;
		this.dataSequence = dataSequence;
		this.id = id;
		this.idB = idB;
		this.valueB = valueB;
		this.id2 = id2;
		this.value2 = value2;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlAttribute(name = "data_sequence")
	public String getDataSequence() {
		return dataSequence;
	}

	public void setDataSequence(String dataSequence) {
		this.dataSequence = dataSequence;
	}

	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute(name = "idB")
	public String getIdB() {
		return idB;
	}

	public void setIdB(String idB) {
		this.idB = idB;
	}

	@XmlAttribute(name = "valueB")
	public String getValueB() {
		return valueB;
	}

	public void setValueB(String valueB) {
		this.valueB = valueB;
	}

	@XmlAttribute(name = "id2")
	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	@XmlAttribute(name = "value2")
	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
	
}
