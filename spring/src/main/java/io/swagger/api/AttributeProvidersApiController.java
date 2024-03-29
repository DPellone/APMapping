package io.swagger.api;

import io.swagger.model.APinfo;
import io.swagger.model.AttributeProvider;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-21T08:29:13.741Z")

@Controller
public class AttributeProvidersApiController implements AttributeProvidersApi {
	
	// Oggetto usato per il parsing dei file JSON
	ObjectMapper o = new ObjectMapper();

    public ResponseEntity<List<AttributeProvider>> getAttributeProviders() {
    	try {
    		// Recupero informazioni dal file "ap.json"
        	URL APlist = Paths.get("ap.json").toUri().toURL();
        	if(APlist == null)
        		return new ResponseEntity<List<AttributeProvider>>(HttpStatus.NOT_FOUND);
        	// Parsing delle informazioni recuperate
			List<AttributeProvider> list = o.readValue(APlist, new TypeReference<List<AttributeProvider>>(){});
			return new ResponseEntity<List<AttributeProvider>>(list, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<List<AttributeProvider>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

    public ResponseEntity<APinfo> getMapping(@ApiParam(value = "Id of the AP") @RequestParam(value = "apid", required = false) String apid) {
    	URL mapping;
    	try {
    		// Recupero informazioni sull'AP richiesto
	    	if(apid == null || (mapping = Paths.get(apid + ".json").toUri().toURL()) == null)
	        	return new ResponseEntity<APinfo>(HttpStatus.NOT_FOUND);
	    	// Parsing delle informazioni
        	APinfo info = o.readValue(mapping, new TypeReference<APinfo>(){});
			return new ResponseEntity<APinfo>(info, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<APinfo>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

}
