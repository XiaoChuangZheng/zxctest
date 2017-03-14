package cn.zxc.demo.demo2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/customerService")
@Produces(MediaType.APPLICATION_XML)
public class CustomerService {
	
	/**
	 * @param id
	 * @return
	 * @throws IOException
	 */
	@Path("/customer/{id}")
	@GET
	public Customer  getCustomerById(@PathParam("id") String id) throws IOException{
//		return	new Customer("咋说的","22","323")	;

//		return mapper.writeValueAsString(dao.getCustomer()); 
		return list.get(3);
	}
	
	
	/**
	 * @return 
	 * @throws Exception
	 */
	@POST
	@Path("/addcustomer")
	public Customer addCustomer() throws Exception{
		
//		return mapper.writeValueAsString(dao.addCustomer()); 
		return list.get(2);
	}
	/**
	 * @return
	 * @throws Exception
	 */
	@PUT
	@Path("/putcustomer")
	public Customer updateCustomer() throws Exception{
		
		
//		return mapper.writeValueAsString(dao.putCustomer());
		return list.get(1);
	}
	/**
	 * @return
	 * @throws Exception
	 */
	@DELETE
	@Path("/deletecustomer")
	public Customer deleteCustomer() throws Exception{
		
		System.out.println("deletecustomer");
//		return mapper.writeValueAsString(dao.deleteCustomer());
		return list.get(0);
	}
	public static List<Customer>list=new ArrayList<Customer>();
	static{
		Customer c1=new Customer("Jack", "北京", "1");
		Customer c2=new Customer("Tom", "南京", "2");
		Customer c3=new Customer("Blank", "东京", "3");
		Customer c4=new Customer("Peter", "西凉", "4");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
	}

    
}
