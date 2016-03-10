package cn.edu.cust.test;

public class User {
	public String username = "bbb";
	public String pass;
	private int age;
	private User newInstance(){
		return new User();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {

	}

	public User(String username, String pass) {
		this.username = username;
		this.pass = pass;
	}

	/*
	 * public boolean equals(User user) { if
	 * (this.username.equals(user.username) && this.pass.equals(user.pass)) {
	 * return true; } else { return false; } }
	 */
	public String getUsername() {
		return username;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(!obj.getClass().equals(this.getClass())){
			return false;
		}
		User user = (User)obj;
		if(user.getUsername().equals(user.getUsername())){
			return true;
		}else{
			return false;
		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static void main(String[] args) {
		User user1 = new User("zl", "123");
		User user2 = new User("zl", "123");
		System.out.println(user1.equals(user2));
		// System.out.println(user1.equals(user2));
		User user3 = new SubUser("1", "2", "3");
		user3.setPass("12342");
		System.out.println(user3.getPass());
		User user4 = new SubUser();
		System.out.println(user4.username);
	}
}
