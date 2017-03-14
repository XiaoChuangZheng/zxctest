package cn.zxc.demo.demo2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Cusotomer")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String name, String address, String id) {
		super();
		this.name = name;
		this.address = address;
		this.id=id;
	}
	public Customer() {
	
	}
	
}
