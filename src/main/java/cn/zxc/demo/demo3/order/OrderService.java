package cn.zxc.demo.demo3.order;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orderservice/")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public interface OrderService {
	@GET
	@Path("/getorder/{id}")
	public Order getOrder(@PathParam("id")String id);
		
	
}
