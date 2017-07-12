package io.swagger.api;

import io.swagger.model.AttributeProvider;
import io.swagger.model.StringToken;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-11T10:46:35.862Z")

@Controller
public class AttributeProvidersApiController implements AttributeProvidersApi {
	
	ClassLoader classLoader = getClass().getClassLoader();
	ObjectMapper o = new ObjectMapper();

    public ResponseEntity<List<AttributeProvider>> getAttributeProviders() {
        try {
        	URL APlist = classLoader.getResource("ap.json");
        	if(APlist == null)
        		return new ResponseEntity<List<AttributeProvider>>(HttpStatus.NOT_FOUND);
			List<AttributeProvider> list = o.readValue(APlist, new TypeReference<List<AttributeProvider>>(){});
			return new ResponseEntity<List<AttributeProvider>>(list, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<List<AttributeProvider>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

    public ResponseEntity<List<StringToken>> getMapping(@ApiParam(value = "Id of the AP") @RequestParam(value = "apid", required = false) String apid) {
        URL mapping;
    	if(apid == null || (mapping = classLoader.getResource(apid + ".json")) == null)
        	return new ResponseEntity<List<StringToken>>(HttpStatus.NOT_FOUND);
        try {
			List<StringToken> list = o.readValue(mapping, new TypeReference<List<StringToken>>(){});
			return new ResponseEntity<List<StringToken>>(list, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<List<StringToken>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

}
