package cn.zxc.demo.demo2;

import org.apache.cxf.jaxrs.JAXRSBindingFactory;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
;




public class Server {
	public Server() {
		JAXRSServerFactoryBean jsf = new JAXRSServerFactoryBean();
		jsf.setResourceClasses(CustomerService.class);
		jsf.setBindingId(JAXRSBindingFactory.JAXRS_BINDING_ID);

//		 jsf.setResourceProvider(CustomerService.class, 
//		            new SingletonResourceProvider(new CustomerService()));

		jsf.setAddress("http://localhost:9001/");
		jsf.create();

	}

	public static void main(String[] args) throws InterruptedException {
	    new Server();
        System.out.println("Server ready...");
        Thread.sleep(5 * 6000 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
	}
}
