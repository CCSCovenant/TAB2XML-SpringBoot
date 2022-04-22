package com.tab2xml.converterController;

import com.tab2xml.converter.Converter;
import com.tab2xml.utility.ValidationError;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class converterController {
	Converter converter;
	converterController(){

	}
	@PostMapping(
			value = "/mxl",
			consumes = "text/plain"
	)
	public String getMXL(@RequestBody String tablature){
		converter = new Converter(tablature);
		return converter.getMusicXML();
	}
	@GetMapping("/mxlError")
	public List<ValidationError> getErrors(){
		return converter.validate();
	}

}
