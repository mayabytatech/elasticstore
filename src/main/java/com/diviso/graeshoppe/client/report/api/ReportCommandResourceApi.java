/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.report.api;


import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.diviso.graeshoppe.client.order.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.OrderMasterDTO;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-16T22:42:54.647+05:30[Asia/Calcutta]")

@Api(value = "ReportCommandResource", description = "the ReportCommandResource API")
public interface ReportCommandResourceApi {

    @ApiOperation(value = "createOrderMaster", nickname = "createOrderMasterUsingPOST1", notes = "", response = OrderMasterDTO.class, tags={ "report-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordermasters",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OrderMasterDTO> createOrderMasterUsingPOST1(@ApiParam(value = "orderMaster" ,required=true )  @Valid @RequestBody OrderMaster orderMaster);


    @ApiOperation(value = "updateOrderMaster", nickname = "updateOrderMasterUsingPUT1", notes = "", response = OrderMasterDTO.class, tags={ "report-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordermasters",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<OrderMasterDTO> updateOrderMasterUsingPUT1(@ApiParam(value = "orderMaster" ,required=true )  @Valid @RequestBody OrderMaster orderMaster);

}
