package cl.prueba.information.service.impl;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import cl.prueba.information.entity.Report;
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

		informatioServiceImpl.setId(id);
		informatioServiceImpl.setUrl(url);
		
		Report report = informatioServiceImpl.getInformation("18260");
		assertNotNull(report);
	}
}
