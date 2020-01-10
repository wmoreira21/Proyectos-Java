package cl.prueba.information.entity;

import java.util.ArrayList;
import java.util.List;


public class EntityTest {
	
	public static Report bulitReportTest(){
		Report report = new Report();
		
		Location location = new Location();
		location.setCity("Santiago de Chile [Región Metropolitana de Santiago;Chile]");				
		List<Var> listVar = new ArrayList<Var>();
		Var var = new Var();
		Data data = new Data();
		List<Forecast> listForecast = new  ArrayList<Forecast>();
		Forecast forecast = new Forecast();
		forecast.setDataSequence("1");
		forecast.setId("1");
		forecast.setId2("1");
		forecast.setIdB("54");
		forecast.setValue("12");
		forecast.setValue2("Cielos despejados");
		forecast.setValueB("Viento moderado de suroeste");
		listForecast.add(forecast);
		data.setForecast(listForecast);
		var.setName("Temperatura Mínima");
		var.setIcon("4");
		var.setData(data);		
		listVar.add(var);
		location.setVar(listVar);
		
		report.setLocation(location);
		
		return report;
	}

}
