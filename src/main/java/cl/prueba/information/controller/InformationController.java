package cl.prueba.information.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.information.entity.Report;
import cl.prueba.information.exception.InformationException;
import cl.prueba.information.service.InformationService;

@RestController
@RequestMapping("/information")
public class InformationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InformationController.class);
	
	@Autowired
	@Qualifier("weather")
	private InformationService informationService;
	
	@RequestMapping(path={"/forecast"}, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Report getInformation(
			HttpServletRequest request, 
			@RequestParam String code) throws InformationException{
		
		LOGGER.info("Microservisio rest pronóstico para los próximos 7");
		
		return informationService.getInformation(code);
	}
	
	
}
