package com.tab2xml.converterController;

import com.tab2xml.converter.Converter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class converterController {
	converterController(){

	}

	@PostMapping(
			value = "/mxl",
			consumes = "text/plain"
	)
	String getMXL(@RequestBody String tablature){
		Converter converter = new Converter(tablature);
		return converter.getMusicXML();
	}

}
