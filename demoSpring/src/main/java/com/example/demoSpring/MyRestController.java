package com.example.demoSpring;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {
	
	@Autowired
	RestTemplate restTemp;

		@GetMapping (value = "/getAlien")
		public String getAlien()
		{
			
			String uri = "http://localhost:8088/Jersey2/webapi/myresource";
            ResponseEntity<String> responseEntity = restTemp.exchange(uri, HttpMethod.GET, null, String.class);
			return responseEntity.getBody();
		}
	}
