package cn.zxc.demo.demo3;

public class UserDao {
	public User addUser(){
		User u=new User();
		u.setUsername("jack");
		u.setId(3);
		u.setPassword("123");
		return u;
		
	}
	public User getUser(String id){
		User u=new User();
		u.setUsername("Blank");
		u.setId(Integer.parseInt(id));
		u.setPassword("123567");
		System.out.println("check");
		return u;
	}
}
