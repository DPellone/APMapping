package io.swagger.api;

import io.swagger.model.APinfo;
import io.swagger.model.AttributeProvider;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-21T08:29:03.401Z")

@Api(value = "attributeProviders", description = "the attributeProviders API")
public interface AttributeProvidersApi {

    @ApiOperation(value = "searches for available Attribute Providers", notes = "Obtains a list of available Attribute Providers ", response = AttributeProvider.class, responseContainer = "List", tags={ "eIDAS Nodes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "list of available AP", response = AttributeProvider.class),
        @ApiResponse(code = 404, message = "no available AP", response = AttributeProvider.class) })
    @RequestMapping(value = "/attributeProviders",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AttributeProvider>> getAttributeProviders();


    @ApiOperation(value = "get the mapping syntax for an Attribute Provider", notes = "Get the mapping syntax for an Attribute Provider ", response = APinfo.class, tags={ "eIDAS Nodes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "mapping syntax made by 1 or more token", response = APinfo.class),
        @ApiResponse(code = 404, message = "no AP with such Id present", response = APinfo.class) })
    @RequestMapping(value = "/attributeProviders/mapping",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<APinfo> getMapping(@ApiParam(value = "Id of the AP") @RequestParam(value = "apid", required = false) String apid);

}
