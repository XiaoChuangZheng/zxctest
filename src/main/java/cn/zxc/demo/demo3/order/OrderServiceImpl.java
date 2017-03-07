package cn.zxc.demo.demo3.order;



public class OrderServiceImpl implements OrderService{
	private OrderDao dao ;



	public Order getOrder(String id) {
	return 	dao.getOrder(Integer.parseInt(id));
	}


	public OrderDao getDao() {
		return dao;
	}


	public void setDao(OrderDao dao) {
		this.dao = dao;
	}
}
