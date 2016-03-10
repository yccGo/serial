package cn.edu.cust.test;

public class SubUser extends User{
	public String wing;
	public String username = "aaa";
	public SubUser(){
		
	}
	public SubUser(String username,String pass,String wing){
		super(username,pass);
		this.wing = wing;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	@Override
	public void setPass(String pass) {
		this.pass = pass + "###";
	}
	
	
}
