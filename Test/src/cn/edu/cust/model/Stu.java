package cn.edu.cust.model;

import cn.edu.cust.annotaion.YccField;
import cn.edu.cust.annotaion.YccTable;

@YccTable(value = "tb_stu")
public class Stu {
	@YccField(name = "s_name", type = "varchar", len = 20)
	private String username;
	@YccField(name = "s_id", type = "int", len = 10)
	private int id;
	@YccField(name = "s_age", type = "int", len = 2)
	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
