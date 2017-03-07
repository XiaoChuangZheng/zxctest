package cn.zxc.demo.demo3.order;



public class OrderDao {
	public Order getOrder(int id){
	Order order = new Order();
		order.setId(id);
		order.setName("白酒");
		return order;	
	}
}
