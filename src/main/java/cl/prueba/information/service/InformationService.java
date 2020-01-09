package cl.prueba.information.service;

import cl.prueba.information.entity.Report;
import cl.prueba.information.exception.InformationException;

public interface InformationService {
	
	abstract public Report getInformation(String code) throws InformationException;
	
}
