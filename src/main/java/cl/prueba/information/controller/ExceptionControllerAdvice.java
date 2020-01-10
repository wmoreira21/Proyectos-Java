package cl.prueba.information.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cl.prueba.information.exception.InformationException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(InformationException.class)
    @ResponseBody
    public ErrorInfo errorException(HttpServletRequest request, InformationException exception){
    	LOGGER.error(exception.getMessage(), exception);
        return exception.getErrorInfo();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorInfo infoException(HttpServletRequest request, Exception exception){
    	LOGGER.error(exception.getMessage(), exception);
        return new ErrorInfo("Unexpected Error");
    }
}