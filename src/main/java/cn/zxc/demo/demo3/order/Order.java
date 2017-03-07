package cn.zxc.demo.demo3.order;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
public class Order {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
