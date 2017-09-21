package io.swagger.api;

import io.swagger.model.APinfo;
import io.swagger.model.AttributeProvider;

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

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-21T08:29:03.401Z")

@Controller
public class AttributeProvidersApiController implements AttributeProvidersApi {

    public ResponseEntity<List<AttributeProvider>> getAttributeProviders() {
        // do some magic!
        return new ResponseEntity<List<AttributeProvider>>(HttpStatus.OK);
    }

    public ResponseEntity<APinfo> getMapping(@ApiParam(value = "Id of the AP") @RequestParam(value = "apid", required = false) String apid) {
        // do some magic!
        return new ResponseEntity<APinfo>(HttpStatus.OK);
    }

}
