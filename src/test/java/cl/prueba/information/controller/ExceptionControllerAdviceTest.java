/**
 * 
 */
package cl.prueba.information.controller;

import static org.junit.Assert.assertEquals;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cl.prueba.information.exception.InformationException;

@RunWith(MockitoJUnitRunner.class)
public class ExceptionControllerAdviceTest {
    @InjectMocks
    private ExceptionControllerAdvice controllerAdvice;
    
    @Mock
    private HttpServletRequest request;
    
    @Test
    public void errorExceptionTest(){
    	InformationException ex = new InformationException("Error");
    	
    	ErrorInfo errorInfo = 
    			controllerAdvice.errorException(request, ex);
    	
    	assertEquals("",errorInfo.getError());

    }
    
    @Test
    public void infoExceptionTest(){
    	IllegalArgumentException ex = new IllegalArgumentException();
    	
    	ErrorInfo errorInfo = 
    			controllerAdvice.infoException(request, ex);
    	
    	assertEquals("Unexpected Error",errorInfo.getError());
    }
}
