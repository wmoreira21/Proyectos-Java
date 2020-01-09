package cl.prueba.information.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.ArgumentMatchers.any;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cl.prueba.information.entity.EntityTest;
import cl.prueba.information.service.impl.InformatioServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class InformationControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private InformationController informationController;
	
	@Mock
	private InformatioServiceImpl informatioServiceImpl;
	
   @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(informationController)
                .build();
    }
   
   	@Test
	public void getInformationTest() throws Exception {
   		Mockito.when(informatioServiceImpl.getInformation(any(String.class))).thenReturn(EntityTest.bulitReportTest());

   		mockMvc.perform(get("/information/forecast").param("code", "18578"))
   			.andExpect(status().isOk())
	   		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))	   		
	   		.andExpect(jsonPath("$.location.city", equalTo("Santiago de Chile [Región Metropolitana de Santiago;Chile]"))
	   		);

   }
}
