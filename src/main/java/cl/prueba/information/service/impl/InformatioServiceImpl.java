package cl.prueba.information.service.impl;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.prueba.information.entity.Report;
import cl.prueba.information.exception.InformationException;
import cl.prueba.information.service.InformationService;

@Service("weather")
public class InformatioServiceImpl implements InformationService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InformatioServiceImpl.class);
	
	@Value("${api.tiempo.url}")
	private String url;
	
	@Value("${affiliate.id}")
	private String id;

	@Override
	public Report getInformation(String code) throws InformationException  {
		LOGGER.info("Consumo Api https://www.tiempo.com/api/#/login");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url + "api_lang=es&localidad=" + code + "&affiliate_id=" + id, String.class);
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Report.class);   
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		    return (Report) jaxbUnmarshaller.unmarshal(new StringReader(response.getBody()));	
		    
		}
		catch (JAXBException e) 
		{			
			throw new InformationException("Error Consumo Api ",e);

		}
		
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
