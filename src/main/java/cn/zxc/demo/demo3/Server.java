package cn.zxc.demo.demo3;



import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.JAXRSBindingFactory;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.zxc.demo.demo3.order.OrderServiceImpl;

public class Server {
	static UserService userService ;
	public Server() {
		List<Class<?>>list = new 	ArrayList<Class<?>>();
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		list.add(UserServiceImp.class);
		list.add(OrderServiceImpl.class);
		sf.setResourceClasses(list);
		sf.setBindingId(JAXRSBindingFactory.JAXRS_BINDING_ID);
		sf.setAddress("http://localhost:9081/");
		sf.create();

	}
	public static void main(String[] args) throws Exception {
		
//		userService.addUser();
		new Server();
		System.out.println("服务开启");
		Thread.sleep(5*1000*6000);
		System.out.println("服务关闭");
		System.exit(0);
	}
}
