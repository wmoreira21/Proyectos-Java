package cl.prueba.information.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import cl.prueba.information.entity.Report;
import cl.prueba.information.entity.ResponseEntityMock;
import cl.prueba.information.exception.InformationException;

@RunWith(MockitoJUnitRunner.class)
public class InformatioServiceImplTest {

	@InjectMocks
	private InformatioServiceImpl informatioServiceImpl;
	
	@Mock
	private RestTemplate restTemplate;

	private String url;	
	private String id;
	
	@Before
	public void setUp() throws IOException {
		Properties props = new Properties();

		InputStream is = ClassLoader.getSystemResourceAsStream("test.properties");
		props.load(is);
		
		url = props.getProperty("api.tiempo.url");
		id = props.getProperty("affiliate.id");
	}
	
	@Test
	public void getInformationTest() throws InformationException {
		ResponseEntityMock<String> response = new ResponseEntityMock<String>(HttpStatus.ACCEPTED, "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><report><location city=\"Santiago de Chile [Regi\u00F3n Metropolitana de Santiago;Chile]\"><interesting><url description=\"Predicci\u00F3n\">https://www.tiempo.com/santiago-de-chile.htm</url></interesting><var><name>Temperatura M\u00EDnima</name><icon>4</icon><data><forecast data_sequence=\"1\" value=\"10\"/><forecast data_sequence=\"2\" value=\"15\"/><forecast data_sequence=\"3\" value=\"16\"/><forecast data_sequence=\"4\" value=\"19\"/><forecast data_sequence=\"5\" value=\"16\"/><forecast data_sequence=\"6\" value=\"17\"/><forecast data_sequence=\"7\" value=\"16\"/></data></var><var><name>Temperatura M\u00E1xima</name><icon>5</icon><data><forecast data_sequence=\"1\" value=\"29\"/><forecast data_sequence=\"2\" value=\"33\"/><forecast data_sequence=\"3\" value=\"34\"/><forecast data_sequence=\"4\" value=\"34\"/><forecast data_sequence=\"5\" value=\"33\"/><forecast data_sequence=\"6\" value=\"33\"/><forecast data_sequence=\"7\" value=\"33\"/></data></var><var><name>Viento</name><icon>9</icon><data><forecast data_sequence=\"1\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"2\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"3\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"4\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"5\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"6\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/><forecast data_sequence=\"7\" id=\"14\" idB=\"54\" value=\"Viento moderado de suroeste\" valueB=\"Viento moderado de suroeste\"/></data></var><var><name>S\u00EDmbolo del tiempo</name><icon>10</icon><data><forecast data_sequence=\"1\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"2\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"3\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"4\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"5\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"6\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/><forecast data_sequence=\"7\" id=\"1\" id2=\"1\" value=\"Cielos despejados\" value2=\"Cielos despejados\"/></data></var><var><name>D\u00EDa</name><icon>15</icon><data><forecast data_sequence=\"1\" value=\"Jueves\"/><forecast data_sequence=\"2\" value=\"Viernes\"/><forecast data_sequence=\"3\" value=\"S\u00E1bado\"/><forecast data_sequence=\"4\" value=\"Domingo\"/><forecast data_sequence=\"5\" value=\"Lunes\"/><forecast data_sequence=\"6\" value=\"Martes\"/><forecast data_sequence=\"7\" value=\"Mi\u00E9rcoles\"/></data></var><var><name>Definici\u00F3n de Atmosfera</name><icon>19</icon><data><forecast data_sequence=\"1\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"2\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"3\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"4\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"5\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"6\" value=\"Durante todo el dia Cielos despejados\"/><forecast data_sequence=\"7\" value=\"Durante todo el dia Cielos despejados\"/></data></var></location></report>");
		informatioServiceImpl.setId(id);
		informatioServiceImpl.setUrl(url);
		
		when(restTemplate.getForEntity(isA(String.class),isA(Class.class)))
		.thenReturn(response);
		
		Report report = informatioServiceImpl.getInformation("18260");
		assertNotNull(report);
	}
	
	@Test(expected = InformationException.class)
	public void getInformationError() throws InformationException {
		ResponseEntityMock<String> response = new ResponseEntityMock<String>(HttpStatus.ACCEPTED, "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><report><error>La localidad a la que intentas acceder no existe. Pruebe con otra localidad o p\u00F3ngase en contacto con el administrador del sistema (api@tiempo.com).</error></report>");
		informatioServiceImpl.setId(id);
		informatioServiceImpl.setUrl(url);
		
		when(restTemplate.getForEntity(isA(String.class),isA(Class.class)))
		.thenReturn(response);
		
		Report report = informatioServiceImpl.getInformation("18260");
		
	}
}
