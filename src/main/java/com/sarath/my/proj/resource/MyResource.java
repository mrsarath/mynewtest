package com.sarath.my.proj.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sarath.my.proj.domain.InputValidateResponseVO;
import com.sarath.my.proj.domain.InputValidateVO;
import com.sarath.my.proj.service.MyService;

import javax.ws.rs.QueryParam;

@Component
@Path("/wservice")
public class MyResource {
	
	@Autowired
	MyService inputValidateService;
	
	//@POST
	@GET
	@Path("/inputValidate")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	public Response inputValidate(@QueryParam("request") String request2) {

		
		String request1 = "";
		InputValidateVO request = new InputValidateVO("", request1, request1, request1, request1, request1, request1, request1);
		//@QueryParam("request") InputValidateVO request
		InputValidateResponseVO response = inputValidateService.doValidate(request);

		return Response.status(200).entity(response).build();

	}

}
