package cn.zxc.demo.demo3;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/userservice/")
public interface UserService {
	@POST
	@Path("/add")
	public User addUser() throws Exception;
	@DELETE
	@Path("/delete/{id}")
	public User deleteUser(@PathParam("id")String id) throws Exception;
	@PUT
	@Path("/put")
	public User putUser() throws Exception;
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/check/{id}")
	public User checkUser(@PathParam("id")String id) throws Exception;
	@GET
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	@Path("/download")
	public Response downLoadPdf();
}
