interface HouseHandler {
	public void buyHouse();
}

public class User implements HouseHandler {
	@Override
	public void buyHouse() {
		System.out.println("我买房子自己要做的事");
	}
	public static void main(String[] args) {
		User user = new User();
		HouseCompany hc = new HouseCompany(user);
		hc.buyHouse();
	}
}

class HouseCompany implements HouseHandler {
	public User user;
	public HouseCompany(){}

	public HouseCompany(User user){
		this.user = user;
	}
	public void before(){
		System.out.println("房屋公司之前需要做的事");
	}
	public void after(){
		System.out.println("房屋公司之后需要做的事");
	}
	@Override
	public void buyHouse() {
		before();
		user.buyHouse();
		after();
	}

}